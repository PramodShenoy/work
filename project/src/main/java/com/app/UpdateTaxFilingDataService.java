package com.app;

import com.app.enums.TaxErrorEnum;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UpdateTaxFilingDataService {

    @Autowired
    private TaxRepository taxRepository;
    @Autowired
    private Configuration configuration;
    @Autowired
    private DSLContext dslContext;

    public TaxErrorEnum updateTaxFilingData(TaxFilingRecord taxFilingRecord) {
        try {
            configuration.data("crudOperation", "update");
            configuration.data("data", taxFilingRecord);
            log.info("+++" + taxFilingRecord.toString() + "+++");
            dslContext.transaction(taxRepository);
            return TaxErrorEnum.SUCCESS;
        } catch (DataAccessException d) {
            log.error("ERROR IN INSERTING" + d);
            return TaxErrorEnum.UPDATE_ERROR;
        }
    }
}
