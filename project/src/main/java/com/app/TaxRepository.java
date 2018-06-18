package com.app;

import com.app.enums.FilingFrequencyEnum;
import com.app.enums.TaxTypeEnum;
import com.cf.public_.tables.records.FilingsRecord;
import com.cf.public_.tables.records.TaxRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.UUID;

import static com.cf.public_.Tables.FILINGS;
import static com.cf.public_.Tables.TAX;

@Repository
@Slf4j
public class TaxRepository implements com.app.Repository<TaxFilingRecord>, TaxSpecification<QueryRequest> {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private DSLContext dslContext;

    public void insertTaxFilingRecord(TaxFilingRecord taxFilingRecord) {
        try {
            dslContext.transaction(configuration -> {
                int id = dslContext.insertInto(TAX, TAX.APP_ID, TAX.STATE, TAX.FROM_YEAR, TAX.TO_YEAR, TAX.TAX_TYPE, TAX.FILING_FREQENCY)
                        .values(taxFilingRecord.getAppId(), taxFilingRecord.getState(), taxFilingRecord.getFromYear(), taxFilingRecord.getToYear(),
                                TaxTypeEnum.valueOf(taxFilingRecord.getTaxType()).id(), FilingFrequencyEnum.valueOf(taxFilingRecord.getFilingFrequency()).id())
                        .returning().fetchOne().getId();
                log.info("ID GENERATED " + id);
                int res = dslContext.insertInto(FILINGS, FILINGS.ID, FILINGS.JAN, FILINGS.FEB, FILINGS.MAR, FILINGS.APR, FILINGS.MAY,
                        FILINGS.JUN, FILINGS.JUL, FILINGS.AUG, FILINGS.SEP, FILINGS.OCT, FILINGS.NOV, FILINGS.DEC)
                        .values(id, (taxFilingRecord.getJan()), (taxFilingRecord.getFeb()), (taxFilingRecord.getMar()),
                                (taxFilingRecord.getApr()), (taxFilingRecord.getMay()), (taxFilingRecord.getJun()),
                                (taxFilingRecord.getJul()), (taxFilingRecord.getAug()), (taxFilingRecord.getSep()),
                                (taxFilingRecord.getOct()), (taxFilingRecord.getNov()), (taxFilingRecord.getDec()))
                        .execute();
                log.info("RES " + res);
            });
        } catch (DataAccessException d) {
            d.printStackTrace();
            log.error("ROLLING BACK TRANSACTION");
        }
    }

    public void deleteTaxFilingRecord(TaxFilingRecord taxFilingRecord) {
        dslContext.transaction(configuration -> {
            TaxRecord taxRecord = dslContext.selectFrom(TAX).where(TAX.ID.eq(taxFilingRecord.getId())).fetchOne();
            if (taxRecord != null)
                taxRecord.delete();
        });
    }

    public void updateTaxFilingRecord(TaxFilingRecord taxFilingRecord) {
        try {
            dslContext.transaction(configuration -> {
                FilingsRecord filingsRecord = dslContext
                        .selectFrom(FILINGS).where(FILINGS.ID.eq(taxFilingRecord.getId())).fetchOne();
                if (filingsRecord != null) {
                    filingsRecord.setJan((taxFilingRecord.getJan()));
                    filingsRecord.setFeb((taxFilingRecord.getFeb()));
                    filingsRecord.setMar((taxFilingRecord.getMar()));
                    filingsRecord.setApr((taxFilingRecord.getApr()));
                    filingsRecord.setMay((taxFilingRecord.getMay()));
                    filingsRecord.setJun((taxFilingRecord.getJun()));
                    filingsRecord.setJul((taxFilingRecord.getJul()));
                    filingsRecord.setAug((taxFilingRecord.getAug()));
                    filingsRecord.setSep((taxFilingRecord.getSep()));
                    filingsRecord.setOct((taxFilingRecord.getOct()));
                    filingsRecord.setNov((taxFilingRecord.getNov()));
                    filingsRecord.setDec((taxFilingRecord.getDec()));
                    filingsRecord.store();
                }
            });
        } catch (Exception e) {
            log.error("ERROR IN UPDATING" + e);
        }
    }

    public List<TaxFilingRecord> query(QueryRequest queryRequest) {
        UUID appId = queryRequest.getAppId();
        int fromYear = queryRequest.getFromYear();
        int toYear = queryRequest.getToYear();
        String state = queryRequest.getState();
        if (stateSpecified(queryRequest))
            return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId).and(TAX.STATE.equalIgnoreCase(state)))
                    .fetch().into(TaxFilingRecord.class);
        else if (yearSpecified(queryRequest))
            return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId).and(TAX.FROM_YEAR.eq(fromYear)).and(TAX.TO_YEAR.eq(toYear)))
                    .fetch().into(TaxFilingRecord.class);
        else
            return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId))
                    .fetch().into(TaxFilingRecord.class);

    }

    public Result<?> getJoinFromYear(int fromYear, UUID appId) {
        return dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                .where(TAX.FROM_YEAR.eq(fromYear).and(TAX.APP_ID.eq(appId)))
                .fetch();
    }

    public Result<?> getJoinToYear(int toYear, UUID appId) {
        return dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                .where(TAX.TO_YEAR.eq(toYear).and(TAX.APP_ID.eq(appId)))
                .fetch();
    }

    @Override
    public boolean stateSpecified(QueryRequest obj) {
        return obj.getState() != null;
    }

    @Override
    public boolean yearSpecified(QueryRequest obj) {
        return obj.getFromYear() != 0 && obj.getToYear() != 0;
    }
}
