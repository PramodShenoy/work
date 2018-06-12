package com.app;


import com.cf.public_.tables.Tax;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.Map;

import static com.cf.public_.Tables.FILINGS;
import static com.cf.public_.Tables.TAX;


@RestController
@Slf4j
public class MyController {
    @Autowired
    private CalculationService calculationService;
    @Autowired
    private DataSource dataSource;
    private DSLContext dslContext;

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public ResponseEntity<String> get(@RequestBody Request request) {
        String fm = request.getFrom_month().toLowerCase().substring(0,3);
        String tm = request.getTo_month().toLowerCase().substring(0,3);
        request.setFrom_month(fm);
        request.setTo_month(tm);
        Map<String, Double> resultMap = calculationService.getSumAvgFinancialYear(request);
        log.info(resultMap.toString());
        return new ResponseEntity<>("DONE", HttpStatus.OK);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ResponseEntity<String> insert(@RequestBody DBEntry dbEntry)
    {
        try {
            dslContext = DSL.using(dataSource.getConnection());
            int res = dslContext.insertInto(TAX,TAX.APP_ID,TAX.STATE,TAX.FROM_YEAR,TAX.TO_YEAR,TAX.TAX_TYPE,TAX.FILING_FREQENCY).
                    values(dbEntry.getApp_id(),dbEntry.getState(),dbEntry.getFrom_year(),dbEntry.getTo_year(),dbEntry.getTax_type(),dbEntry.getFiling_frequency()).
                    execute();
            log.info("RESULT " + res);
        }catch (Exception e)
        {
            e.printStackTrace();
            log.error("FCVGBJNKML");
        }
        return new ResponseEntity<>("DONE",HttpStatus.OK);
    }
}
