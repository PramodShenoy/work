package com.app;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;


@RestController
@Slf4j
public class MyController {
    @Autowired
    private CalculationService calculationService;
    @Autowired
    private InsertDataService insertDataService;
    @Autowired
    private UpdateDataService updateDataService;
    @Autowired
    private DeleteDataService deleteDataService;
    @Autowired
    private QueryService queryService;

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
        if (insertDataService.insertData(dbEntry) == 0)
            return new ResponseEntity<>("INSERTED SUCCESSFULLY IN TABLES", HttpStatus.OK);
        return new ResponseEntity<>("ERROR IN INSERTING", HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<String> update(@RequestBody DBEntry dbEntry) {
        if (updateDataService.updateFilingsData(dbEntry) == 0)
            return new ResponseEntity<>("UPDATE DONE", HttpStatus.OK);
        return new ResponseEntity<>("ERROR IN FINDING ROW", HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<String> delete(@RequestBody DBEntry dbEntry) {
        if (deleteDataService.deleteData(dbEntry) == 0)
            return new ResponseEntity<>("SUCCESSFULLY DELETED", HttpStatus.OK);
        return new ResponseEntity<>("ERROR IN FINDING ROW", HttpStatus.OK);
    }

    @RequestMapping(value = "/query/{appId}", method = RequestMethod.GET)
    public ResponseEntity<String> searchAppIdInfo(@PathVariable UUID appId) {
        String json = queryService.searchByAppId(appId);
        return new ResponseEntity<>(json,HttpStatus.OK);
    }

    @RequestMapping(value = "/query/appid={appId}/state={state}", method = RequestMethod.GET)
    public ResponseEntity<String> searchAppIdInfoState(@PathVariable UUID appId,@PathVariable String state)
    {
        String json = queryService.searchByAppIdState(appId,state);
        return new ResponseEntity<>(json,HttpStatus.OK);
    }

    @RequestMapping(value = "/query/appid={appId}/from={fromYear}/to={toYear}", method = RequestMethod.GET)
    public ResponseEntity<String> searchAppIdInfoYearRange(@PathVariable UUID appId,
                                                           @PathVariable int fromYear,@PathVariable int toYear)
    {
        String json = queryService.searchByAppIdYearRange(appId,fromYear,toYear);
        return new ResponseEntity<>(json,HttpStatus.OK);
    }


}
