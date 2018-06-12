package com.app;

import com.cf.public_.tables.records.FilingsRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.math.BigDecimal;

import static com.cf.public_.Tables.FILINGS;

@Component
@Slf4j
public class UpdateService {
    @Autowired
    private DataSource dataSource;
    private DSLContext dslContext;

    public int updateFilingsData(DBEntry dbEntry) {
        try {
            dslContext = DSL.using(dataSource.getConnection());
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
                return 0;
            }
        } catch (Exception e) {
            log.error("ERROR " + e);
        }
        return -1;
    }
}
