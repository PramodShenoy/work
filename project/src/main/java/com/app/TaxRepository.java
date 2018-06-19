package com.app;

import com.app.enums.FilingFrequencyEnum;
import com.app.enums.TaxTypeEnum;
import com.cf.public_.tables.records.FilingsRecord;
import com.cf.public_.tables.records.TaxRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.TransactionalRunnable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.UUID;

import static com.cf.public_.Tables.FILINGS;
import static com.cf.public_.Tables.TAX;

@Repository
@Slf4j
public class TaxRepository implements TransactionalRunnable {

    @Autowired
    private DSLContext dslContext;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private Configuration configuration;

    @Override
    public void run(Configuration config) {
        String crudOperation = (String) configuration.data("crudOperation");
        TaxFilingRecord taxFilingRecord = (TaxFilingRecord) configuration.data("data");
        if (taxFilingRecord == null) {
            log.error("NULL");
            return;
        }
        log.info("---" + taxFilingRecord.toString() + "---");
        if (crudOperation.equalsIgnoreCase("insert")) {

            int id = dslContext.insertInto(TAX, TAX.APP_ID, TAX.STATE, TAX.FROM_YEAR, TAX.TO_YEAR, TAX.TAX_TYPE, TAX.FILING_FREQENCY)
                    .values(taxFilingRecord.getAppId(), taxFilingRecord.getState(), taxFilingRecord.getFromYear(), taxFilingRecord.getToYear(),
                            TaxTypeEnum.valueOf(taxFilingRecord.getTaxType()).id(), FilingFrequencyEnum.valueOf(taxFilingRecord.getFilingFrequency()).id())
                    .returning().fetchOne().getId();
            log.info("ID GENERATED " + id);
            dslContext.insertInto(FILINGS, FILINGS.ID, FILINGS.JAN, FILINGS.FEB, FILINGS.MAR, FILINGS.APR, FILINGS.MAY,
                    FILINGS.JUN, FILINGS.JUL, FILINGS.AUG, FILINGS.SEP, FILINGS.OCT, FILINGS.NOV, FILINGS.DEC)
                    .values(id, (taxFilingRecord.getJan()), (taxFilingRecord.getFeb()), (taxFilingRecord.getMar()),
                            (taxFilingRecord.getApr()), (taxFilingRecord.getMay()), (taxFilingRecord.getJun()),
                            (taxFilingRecord.getJul()), (taxFilingRecord.getAug()), (taxFilingRecord.getSep()),
                            (taxFilingRecord.getOct()), (taxFilingRecord.getNov()), (taxFilingRecord.getDec()))
                    .execute();
        } else if (crudOperation.equalsIgnoreCase("delete")) {
            TaxRecord taxRecord = dslContext.selectFrom(TAX).where(TAX.ID.eq(taxFilingRecord.getId())).fetchOne();
            if (taxRecord != null)
                taxRecord.delete();
        } else if (crudOperation.equalsIgnoreCase("update")) {
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
        }
    }

    public List<TaxFilingRecord> queryWithState(QueryRequest queryRequest) {

        return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                .where(TAX.APP_ID.eq(queryRequest.getAppId()).and(TAX.STATE.equalIgnoreCase(queryRequest.getState())))
                .fetch().into(TaxFilingRecord.class);
    }

    public List<TaxFilingRecord> queryWithYearRange(QueryRequest queryRequest) {
        return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                .where(TAX.APP_ID.eq(queryRequest.getAppId())
                        .and(TAX.FROM_YEAR.ge(queryRequest.getFromYear())).and(TAX.TO_YEAR.le(queryRequest.getToYear())))
                .fetch().into(TaxFilingRecord.class);
    }

    public List<TaxFilingRecord> queryWithAppIdOnly(QueryRequest queryRequest) {
        return dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                .where(TAX.APP_ID.eq(queryRequest.getAppId()))
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


}
