package com.app;

import com.app.enums.TaxErrorEnum;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InsertTaxDataService {

    @Autowired
    private TaxRepository taxRepository;
    @Autowired
    private Configuration configuration;
    @Autowired
    private DSLContext dslContext;

    public TaxErrorEnum insertTaxFilingData(TaxFilingRecord taxFilingRecord) {
        try {
            configuration.data("crudOperation", "insert");
            configuration.data("data", taxFilingRecord);
            log.info("+++" + taxFilingRecord.toString() + "+++");
            dslContext.transaction(taxRepository);
            return TaxErrorEnum.SUCCESS;
        } catch (DataAccessException d) {
            log.error("ERROR IN INSERTING" + d);
            return TaxErrorEnum.INSERT_ERROR;
        }
    }

}
