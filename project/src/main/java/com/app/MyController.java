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
    public ResponseEntity<String> get(@RequestBody Request request) {
        String fm = request.getFrom_month().toLowerCase().substring(0, 3);
        String tm = request.getTo_month().toLowerCase().substring(0, 3);
        request.setFrom_month(fm);
        request.setTo_month(tm);
        Map<String, Double> resultMap = calculationService.getSumAvgFinancialYear(request);
        log.info(resultMap.toString());
        return new ResponseEntity<>("DONE", HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<String> insert(@RequestBody DBEntry dbEntry) {
        taxRepository.insertData(dbEntry);
        return new ResponseEntity<>("INSERTED", HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<String> update(@RequestBody DBEntry dbEntry) {
        taxRepository.update(dbEntry);
        return new ResponseEntity<>("DONE",HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<String> delete(@RequestBody DBEntry dbEntry) {
        taxRepository.delete(dbEntry);
        return new ResponseEntity<>("DONE",HttpStatus.OK);
    }

    @RequestMapping(value = "/query/request", method = RequestMethod.POST)
    public ResponseEntity<List<DBEntry>> search(@RequestBody Request request) {
        List<DBEntry> dbEntry = taxRepository.query(request);
        return new ResponseEntity<>(dbEntry, HttpStatus.OK);
    }


}
