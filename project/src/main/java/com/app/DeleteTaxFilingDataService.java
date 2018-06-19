package com.app;

import lombok.extern.slf4j.Slf4j;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeleteTaxFilingDataService {
    @Autowired
    private TaxRepository taxRepository;
    @Autowired
    private Configuration configuration;
    @Autowired
    private DSLContext dslContext;

    public void deleteTaxFilingData(TaxFilingRecord taxFilingRecord) {
        try {
            configuration.data("crudOperation", "delete");
            configuration.data("data", taxFilingRecord);
            log.info("+++" + taxFilingRecord.toString() + "+++");
            dslContext.transaction(taxRepository);
        } catch (DataAccessException d) {
            log.error("ERROR IN INSERTING" + d);
        }
    }

}
