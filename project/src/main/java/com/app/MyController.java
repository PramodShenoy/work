package com.app;


import com.cf.public_.tables.records.FilingsRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
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



@RestController
@Slf4j
public class MyController {
    @Autowired
    private CalculationService calculationService;
    @Autowired
    private InsertDataService insertDataService;
    @Autowired
    private UpdateService updateService;
    @Autowired
    private DeleteDataService deleteDataService;

    @RequestMapping(value = "/getRange", method = RequestMethod.POST)
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
        if(insertDataService.insertData(dbEntry)==0)
            return new ResponseEntity<>("INSERTED SUCCESSFULLY IN TABLES",HttpStatus.OK);
        return new ResponseEntity<>("ERROR IN INSERTING",HttpStatus.OK);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ResponseEntity<String> update(@RequestBody DBEntry dbEntry)
    {
        if(updateService.updateFilingsData(dbEntry)==0)
            return new ResponseEntity<>("UPDATE DONE",HttpStatus.OK);
        return new ResponseEntity<>("ERROR IN FINDING ROW",HttpStatus.OK);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ResponseEntity<String> delete(@RequestBody DBEntry dbEntry)
    {
        if(deleteDataService.deleteData(dbEntry)==0)
            return new ResponseEntity<>("SUCCESSFULLY DELETED",HttpStatus.OK);
        return new ResponseEntity<>("ERROR IN FINDING ROW",HttpStatus.OK);
    }

}
