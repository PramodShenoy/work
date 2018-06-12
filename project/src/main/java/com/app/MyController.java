package com.app;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class MyController {
    @Autowired
    private CalculationService calculationService;

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public ResponseEntity<String> get(@RequestBody Request request) {
        Map<String, Double> resultMap = calculationService.getSumAvgFinancialYear(request);
        log.info(resultMap.toString());
        return new ResponseEntity<>("DONE", HttpStatus.OK);
    }
}
