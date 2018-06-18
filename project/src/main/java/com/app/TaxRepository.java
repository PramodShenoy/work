package com.app;

import com.app.enums.FilingFrequencyEnum;
import com.app.enums.TaxTypeEnum;
import com.cf.public_.tables.records.FilingsRecord;
import com.cf.public_.tables.records.TaxRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static com.cf.public_.Tables.FILINGS;
import static com.cf.public_.Tables.TAX;

@Repository
@Slf4j
public class TaxRepository implements com.app.Repository<DBEntry>, TaxSpecification<QueryRequest> {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private DSLContext dslContext;

    private int errorCode;

    private void init() {
        try {
            dslContext = DSL.using(dataSource.getConnection());
            errorCode = 0;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("ERROR IN INITIALISING DSL CONTEXT" + e);
        }
    }

    public void insertData(DBEntry dbEntry) {
        init();
        try {
            dslContext.transaction(configuration -> {
                int id = dslContext.insertInto(TAX, TAX.APP_ID, TAX.STATE, TAX.FROM_YEAR, TAX.TO_YEAR, TAX.TAX_TYPE, TAX.FILING_FREQENCY)
                        .values(dbEntry.getApp_id(), dbEntry.getState(), dbEntry.getFrom_year(), dbEntry.getTo_year(),
                                TaxTypeEnum.valueOf(dbEntry.getTax_type()).id(), FilingFrequencyEnum.valueOf(dbEntry.getFiling_frequency()).id())
                        .returning().fetchOne().getId();
                log.info("ID GENERATED " + id);
                int res = dslContext.insertInto(FILINGS, FILINGS.ID, FILINGS.JAN, FILINGS.FEB, FILINGS.MAR, FILINGS.APR, FILINGS.MAY,
                        FILINGS.JUN, FILINGS.JUL, FILINGS.AUG, FILINGS.SEP, FILINGS.OCT, FILINGS.NOV, FILINGS.DEC)
                        .values(id, BigDecimal.valueOf(dbEntry.getJan()), BigDecimal.valueOf(dbEntry.getFeb()), BigDecimal.valueOf(dbEntry.getMar()),
                                BigDecimal.valueOf(dbEntry.getApr()), BigDecimal.valueOf(dbEntry.getMay()), BigDecimal.valueOf(dbEntry.getJun()),
                                BigDecimal.valueOf(dbEntry.getJul()), BigDecimal.valueOf(dbEntry.getAug()), BigDecimal.valueOf(dbEntry.getSep()),
                                BigDecimal.valueOf(dbEntry.getOct()), BigDecimal.valueOf(dbEntry.getNov()), BigDecimal.valueOf(dbEntry.getDec()))
                        .execute();
                log.info("RES " + res);
            });
        } catch (DataAccessException d) {
            d.printStackTrace();
            log.error("ROLLING BACK TRANSACTION");
            errorCode = 1;
        }
    }

    public void delete(DBEntry dbEntry) {
        init();
        dslContext.transaction(configuration -> {
            TaxRecord taxRecord = dslContext.selectFrom(TAX).where(TAX.ID.eq(dbEntry.getId())).fetchOne();
            if (taxRecord != null)
                taxRecord.delete();
        });
    }

    public void update(DBEntry dbEntry) {
        //init();
        try {
            /*dslContext.transaction(configuration -> {
                FilingsRecord filingsRecord = dslContext.selectFrom(FILINGS).where(FILINGS.ID.eq(dbEntry.getId())).fetchOne();
                if (filingsRecord != null) {
                    filingsRecord.setJan(BigDecimal.valueOf(dbEntry.getJan()));
                    filingsRecord.setFeb(BigDecimal.valueOf(dbEntry.getFeb()));
                    filingsRecord.setMar(BigDecimal.valueOf(dbEntry.getMar()));
                    filingsRecord.setApr(BigDecimal.valueOf(dbEntry.getApr()));
                    filingsRecord.setMay(BigDecimal.valueOf(dbEntry.getMay()));
                    filingsRecord.setJun(BigDecimal.valueOf(dbEntry.getJun()));
                    filingsRecord.setJul(BigDecimal.valueOf(dbEntry.getJul()));
                    filingsRecord.setAug(BigDecimal.valueOf(dbEntry.getAug()));
                    filingsRecord.setSep(BigDecimal.valueOf(dbEntry.getSep()));
                    filingsRecord.setOct(BigDecimal.valueOf(dbEntry.getOct()));
                    filingsRecord.setNov(BigDecimal.valueOf(dbEntry.getNov()));
                    filingsRecord.setDec(BigDecimal.valueOf(dbEntry.getDec()));
                    filingsRecord.store();
                }
            });*/
            DSL.using(dataSource.getConnection()).transaction(configuration -> {
                FilingsRecord filingsRecord = DSL.using(dataSource.getConnection())
                        .selectFrom(FILINGS).where(FILINGS.ID.eq(dbEntry.getId())).fetchOne();
                if (filingsRecord != null) {
                    filingsRecord.setJan(BigDecimal.valueOf(dbEntry.getJan()));
                    filingsRecord.setFeb(BigDecimal.valueOf(dbEntry.getFeb()));
                    filingsRecord.setMar(BigDecimal.valueOf(dbEntry.getMar()));
                    filingsRecord.setApr(BigDecimal.valueOf(dbEntry.getApr()));
                    filingsRecord.setMay(BigDecimal.valueOf(dbEntry.getMay()));
                    filingsRecord.setJun(BigDecimal.valueOf(dbEntry.getJun()));
                    filingsRecord.setJul(BigDecimal.valueOf(dbEntry.getJul()));
                    filingsRecord.setAug(BigDecimal.valueOf(dbEntry.getAug()));
                    filingsRecord.setSep(BigDecimal.valueOf(dbEntry.getSep()));
                    filingsRecord.setOct(BigDecimal.valueOf(dbEntry.getOct()));
                    filingsRecord.setNov(BigDecimal.valueOf(dbEntry.getNov()));
                    filingsRecord.setDec(BigDecimal.valueOf(dbEntry.getDec()));
                    filingsRecord.store();
                }

            });
        } catch (Exception e) {
            log.error("ERROR IN UPDATING" + e);
            errorCode = 3;
        }
    }

    public List<DBEntry> query(QueryRequest queryRequest) {
        init();
        UUID appId = queryRequest.getApp_id();
        int fromYear = queryRequest.getFrom_year();
        int toYear = queryRequest.getTo_year();
        String state = queryRequest.getState();
        /*if (fromYear != 0 && toYear != 0 && queryRequest.getState()==null)
            return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId).and(TAX.FROM_YEAR.eq(fromYear)).and(TAX.TO_YEAR.eq(toYear)))
                    .fetch().into(DBEntry.class);
        else if (queryRequest.getState()!=null)
            return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId).and(TAX.STATE.equalIgnoreCase(state)))
                    .fetch().into(DBEntry.class);
        else
            return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId))
                    .fetch().into(DBEntry.class);*/
        if (stateSpecified(queryRequest))
            return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId).and(TAX.STATE.equalIgnoreCase(state)))
                    .fetch().into(DBEntry.class);
        else if (yearSpecified(queryRequest))
            return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId).and(TAX.FROM_YEAR.eq(fromYear)).and(TAX.TO_YEAR.eq(toYear)))
                    .fetch().into(DBEntry.class);
        else
            return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId))
                    .fetch().into(DBEntry.class);

    }

    public Result<?> getJoinFromYear(int fromYear, UUID appId) {
        init();
        return dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                .where(TAX.FROM_YEAR.eq(fromYear).and(TAX.APP_ID.eq(appId)))
                .fetch();
    }

    public Result<?> getJoinToYear(int toYear, UUID appId) {
        init();
        return dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                .where(TAX.TO_YEAR.eq(toYear).and(TAX.APP_ID.eq(appId)))
                .fetch();
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public boolean stateSpecified(QueryRequest obj) {
        return obj.getState()!=null;
    }

    @Override
    public boolean yearSpecified(QueryRequest obj) {
        return obj.getFrom_year()!=0 && obj.getTo_year()!=0;
    }
}
