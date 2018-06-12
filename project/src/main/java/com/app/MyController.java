package com.app;


import com.app.enums.FilingFrequencyEnum;
import com.app.enums.TaxTypeEnum;
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
import java.math.BigDecimal;
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
    public ResponseEntity<String> get(@RequestBody Request request)
    {
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
            Result result = dslContext.select(TAX.ID)
                    .from(TAX)
                    .where(TAX.ID.eq(dbEntry.getId()))
                    .fetch();
            if (result.isEmpty())
            {
                dslContext.insertInto(TAX,TAX.APP_ID,TAX.STATE,TAX.FROM_YEAR,TAX.TO_YEAR,TAX.TAX_TYPE,TAX.FILING_FREQENCY)
                        .values(dbEntry.getApp_id(),dbEntry.getState(),dbEntry.getFrom_year(),dbEntry.getTo_year(),
                                TaxTypeEnum.valueOf(dbEntry.getTax_type()).id(),FilingFrequencyEnum.valueOf(dbEntry.getFiling_frequency()).id())
                        .execute();
                Result<?> result1=dslContext.select(TAX.ID).from(TAX).orderBy(TAX.ID.desc()).fetch();
                int id =(Integer)result1.getValue(0,"id");
                log.info("ID LAST " + id);
                dslContext.insertInto(FILINGS,FILINGS.ID,FILINGS.JAN,FILINGS.FEB,FILINGS.MAR,FILINGS.APR,FILINGS.MAY,
                        FILINGS.JUN,FILINGS.JUL,FILINGS.AUG,FILINGS.SEP,FILINGS.OCT,FILINGS.NOV,FILINGS.DEC)
                        .values(id,BigDecimal.valueOf(dbEntry.getJan()),BigDecimal.valueOf(dbEntry.getFeb()),BigDecimal.valueOf(dbEntry.getMar()),
                                BigDecimal.valueOf(dbEntry.getApr()),BigDecimal.valueOf(dbEntry.getMay()),BigDecimal.valueOf(dbEntry.getJun()),
                                BigDecimal.valueOf(dbEntry.getJul()),BigDecimal.valueOf(dbEntry.getAug()),BigDecimal.valueOf(dbEntry.getSep()),
                                BigDecimal.valueOf(dbEntry.getOct()),BigDecimal.valueOf(dbEntry.getNov()),BigDecimal.valueOf(dbEntry.getDec()))
                        .execute();
            }
            log.info("INSERTED SUCCESSFULLY IN BOTH TABLES");
            return new ResponseEntity<>("DONE",HttpStatus.OK);
        }catch (Exception e)
        {
            log.error("ERROR IN INSERTING " + e);
            return new ResponseEntity<>("ERROR IN INSERTING",HttpStatus.OK);
        }
    }
}
