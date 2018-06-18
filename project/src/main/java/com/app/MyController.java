package com.app;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@Slf4j
public class MyController {
    @Autowired
    private CalculationService calculationService;
    @Autowired
    private TaxRepository taxRepository;

    @RequestMapping(value = "/getRange", method = RequestMethod.POST)
    public ResponseEntity<Map<String,Double>> get(@RequestBody QueryRequest queryRequest) {
        String fm = queryRequest.getFrom_month().toLowerCase().substring(0, 3);
        String tm = queryRequest.getTo_month().toLowerCase().substring(0, 3);
        queryRequest.setFrom_month(fm);
        queryRequest.setTo_month(tm);
        Map<String, Double> resultMap = calculationService.getSumAvgFinancialYear(queryRequest);
        log.info(resultMap.toString());
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<String> insert(@RequestBody DBEntry dbEntry) {
        taxRepository.insertData(dbEntry);
        if(taxRepository.getErrorCode()==0)
            return new ResponseEntity<>("INSERTED", HttpStatus.OK);
        return new ResponseEntity<>("ERROR",HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<String> update(@RequestBody DBEntry dbEntry) {
        taxRepository.update(dbEntry);
        if (taxRepository.getErrorCode()==0)
            return new ResponseEntity<>("DONE", HttpStatus.OK);
        return new ResponseEntity<>("ERROR",HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<String> delete(@RequestBody DBEntry dbEntry) {
        taxRepository.delete(dbEntry);
        if(taxRepository.getErrorCode()==0)
            return new ResponseEntity<>("DONE", HttpStatus.OK);
        return new ResponseEntity<>("ERROR",HttpStatus.OK);
    }
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public ResponseEntity<List<DBEntry>> search(@RequestBody QueryRequest queryRequest) {
        log.info(queryRequest.toString());
        List<DBEntry> dbEntry = taxRepository.query(queryRequest);
        return new ResponseEntity<>(dbEntry, HttpStatus.OK);
    }
}
