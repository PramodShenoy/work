package com.app;


import com.app.enums.TaxErrorEnum;
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
    @Autowired
    private InsertTaxDataService insertTaxDataService;

    @RequestMapping(value = "/getRange", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Double>> get(@RequestBody QueryRequest queryRequest) {
        String fm = queryRequest.getFromMonth().toLowerCase().substring(0, 3);
        String tm = queryRequest.getToMonth().toLowerCase().substring(0, 3);
        queryRequest.setFromMonth(fm);
        queryRequest.setToMonth(tm);
        Map<String, Double> resultMap = calculationService.getSumAvgFinancialYear(queryRequest);
        log.info(resultMap.toString());
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<String> insert(@RequestBody TaxFilingRecord taxFilingRecord) {
        // TaxErrorEnum errorCode = taxRepository.insertTaxFilingRecord(taxFilingRecord);
        insertTaxDataService.insertTaxFilingData(taxFilingRecord);
        return new ResponseEntity<>("DONE", HttpStatus.OK);
    }

    @RequestMapping(value = "/updateTaxFilingRecord", method = RequestMethod.POST)
    public ResponseEntity<TaxErrorEnum> update(@RequestBody TaxFilingRecord taxFilingRecord) {
        TaxErrorEnum errorCode = taxRepository.updateTaxFilingRecord(taxFilingRecord);
        return new ResponseEntity<>(errorCode, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteTaxFilingRecord", method = RequestMethod.POST)
    public ResponseEntity<TaxErrorEnum> delete(@RequestBody TaxFilingRecord taxFilingRecord) {
        TaxErrorEnum errorCode = taxRepository.deleteTaxFilingRecord(taxFilingRecord);
        return new ResponseEntity<>(errorCode, HttpStatus.OK);
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public ResponseEntity<List<TaxFilingRecord>> search(@RequestBody QueryRequest queryRequest) {
        log.info(queryRequest.toString());
        List<TaxFilingRecord> taxFilingRecord = taxRepository.query(queryRequest);
        return new ResponseEntity<>(taxFilingRecord, HttpStatus.OK);
    }
}
