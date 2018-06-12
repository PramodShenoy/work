package com.app;

import com.app.enums.FilingFrequencyEnum;
import com.app.enums.TaxTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.math.BigDecimal;

import static com.cf.public_.Tables.FILINGS;
import static com.cf.public_.Tables.TAX;

@Component
@Slf4j
public class InsertDataService {
    @Autowired
    private DataSource dataSource;
    private DSLContext dslContext;

    public int insertData(DBEntry dbEntry) {
        try {
            dslContext = DSL.using(dataSource.getConnection());
            Result result = dslContext.select(TAX.ID)
                    .from(TAX)
                    .where(TAX.ID.eq(dbEntry.getId()))
                    .fetch();
            if (result.isEmpty()) {
                dslContext.insertInto(TAX, TAX.APP_ID, TAX.STATE, TAX.FROM_YEAR, TAX.TO_YEAR, TAX.TAX_TYPE, TAX.FILING_FREQENCY)
                        .values(dbEntry.getApp_id(), dbEntry.getState(), dbEntry.getFrom_year(), dbEntry.getTo_year(),
                                TaxTypeEnum.valueOf(dbEntry.getTax_type()).id(), FilingFrequencyEnum.valueOf(dbEntry.getFiling_frequency()).id())
                        .execute();
                Result<?> result1 = dslContext.select(TAX.ID).from(TAX).orderBy(TAX.ID.desc()).fetch();
                int id = (Integer) result1.getValue(0, "id");
                log.info("ID LAST " + id);
                dslContext.insertInto(FILINGS, FILINGS.ID, FILINGS.JAN, FILINGS.FEB, FILINGS.MAR, FILINGS.APR, FILINGS.MAY,
                        FILINGS.JUN, FILINGS.JUL, FILINGS.AUG, FILINGS.SEP, FILINGS.OCT, FILINGS.NOV, FILINGS.DEC)
                        .values(id, BigDecimal.valueOf(dbEntry.getJan()), BigDecimal.valueOf(dbEntry.getFeb()), BigDecimal.valueOf(dbEntry.getMar()),
                                BigDecimal.valueOf(dbEntry.getApr()), BigDecimal.valueOf(dbEntry.getMay()), BigDecimal.valueOf(dbEntry.getJun()),
                                BigDecimal.valueOf(dbEntry.getJul()), BigDecimal.valueOf(dbEntry.getAug()), BigDecimal.valueOf(dbEntry.getSep()),
                                BigDecimal.valueOf(dbEntry.getOct()), BigDecimal.valueOf(dbEntry.getNov()), BigDecimal.valueOf(dbEntry.getDec()))
                        .execute();
            }
            log.info("INSERTED SUCCESSFULLY IN BOTH TABLES");
            return 0;
        } catch (Exception e) {
            log.error("ERROR IN INSERTING " + e);
            return -1;
        }
    }
}
