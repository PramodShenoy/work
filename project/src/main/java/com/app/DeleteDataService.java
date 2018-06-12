package com.app;

import com.cf.public_.tables.records.TaxRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import static com.cf.public_.Tables.TAX;

@Component
@Slf4j
public class DeleteDataService {
    @Autowired
    private DataSource dataSource;
    private DSLContext dslContext;

    public int deleteData(DBEntry dbEntry) {
        try {
            dslContext = DSL.using(dataSource.getConnection());
            TaxRecord taxRecord = dslContext.selectFrom(TAX).where(TAX.ID.eq(dbEntry.getId())).fetchOne();
            taxRecord.delete();
            log.info("SUCCESSFULLY DELETED");
            return 0;
        } catch (Exception e) {
            log.error("ERROR IN DELETING " + e);
            return -1;
        }
    }
}
