package com.app;

import com.app.enums.MonthEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Slf4j
public class CalculationService {

    @Autowired
    private TaxRepository taxRepository;
    private int count = 0;


    public Map<String, Double> getSumAvgFinancialYear(QueryRequest queryRequest) {
        double sum = 0.0;
        double avg = 0.0;
        String fromMonth = queryRequest.getFromMonth(), toMonth
                = queryRequest.getToMonth();
        int fromYear = queryRequest.getFromYear(), toYear = queryRequest.getToYear();
        UUID appId = queryRequest.getAppId();
        boolean flag = checkFinancialYear(fromMonth, toMonth, fromYear, toYear);
        try {
            if (!flag) {
                log.info("RANGE FINANCIAL YEAR");
                sum += getSumRangeFinancialYear(fromMonth, fromYear, toMonth, toYear, appId);
                avg = sum / count;
                log.info("SUM IS " + sum);
                log.info("AVG IS " + avg);
                log.info("FINAL COUNT " + count);
            } else {
                log.info("SAME FINANCIAL YEAR");
                sum += getSumSameFinancialYear(fromMonth, fromYear, toMonth, toYear, appId);
                avg = sum / count;
                log.info("SUM IS " + sum);
                log.info("AVG IS " + avg);
                log.info("FINAL COUNT " + count);
            }
        } catch (Exception e) {
            log.error("SQL EXCEPTION ", e);
        }
        Map<String, Double> resultMap = new HashMap<>();
        resultMap.put("Sum", BigDecimal.valueOf(sum).setScale(2, RoundingMode.HALF_UP).doubleValue());
        resultMap.put("Avg", BigDecimal.valueOf(avg).setScale(2, RoundingMode.HALF_UP).doubleValue());
        count = 0;
        return resultMap;
    }

    private double getSumSameFinancialYear(String fromMonth, int fromYear, String toMonth
            , int toYear, UUID appId) {
        List<TaxFilingRecord> taxFilingRecordList;
        if (checkInJanFebMar(fromMonth))
            taxFilingRecordList = taxRepository.getJoinToYear(fromYear, appId).into(TaxFilingRecord.class);
        else
            taxFilingRecordList = taxRepository.getJoinFromYear(fromYear, appId).into(TaxFilingRecord.class);
        double sum = 0.0;
        sum += getSumFromTo(fromMonth, taxFilingRecordList, toMonth
        );
        return sum;
    }

    private double getSumRangeFinancialYear(String fromMonth, int fromYear, String toMonth
            , int toYear, UUID appId) {
        double sum = 0.0;
        List<TaxFilingRecord> taxFilingRecordList;
        if (!checkInJanFebMar(fromMonth)) {
            taxFilingRecordList = taxRepository.getJoinFromYear(fromYear, appId).into(TaxFilingRecord.class);
            fromYear++;
        } else
            taxFilingRecordList = taxRepository.getJoinToYear(fromYear, appId).into(TaxFilingRecord.class);
        sum += getSumFromTo(fromMonth, taxFilingRecordList, "mar");
        fromMonth = "apr";
        log.info("FIRST FY COUNT " + count);
        if (checkInJanFebMar(toMonth
        ))
            toYear--;
        while (fromYear < toYear) {
            taxFilingRecordList = taxRepository.getJoinFromYear(fromYear, appId).into(TaxFilingRecord.class);
            sum += getSumFromTo(fromMonth, taxFilingRecordList, "mar");
            fromYear++;
            log.info("LOOP COUNT " + count);
        }
        log.info("FY IS " + fromYear);
        taxFilingRecordList = taxRepository.getJoinFromYear(fromYear, appId).into(TaxFilingRecord.class);
        sum += getSumFromTo(fromMonth, taxFilingRecordList, toMonth
        );
        return sum;
    }

    private double getSumFromTo(String fromMonth, List<TaxFilingRecord> taxFilingRecordList, String toMonth
    ) {
        double sum = 0.0;
        int startIndex = MonthEnum.valueOf(fromMonth).id()-1;
        int endIndex = MonthEnum.valueOf(toMonth).id()-1;
        for (TaxFilingRecord rowResult : taxFilingRecordList) {
            try {
                int i = startIndex;
                while (i != endIndex) {
                    sum += rowResult.getFilingValues().get(i).doubleValue();
                    count++;
                    i = (i + 1) % 12;
                }
                sum += rowResult.getFilingValues().get(i).doubleValue();
                count++;
            } catch (Exception e) {
                log.error("ENUM ERROR ", e);
            }
        }
        return sum;
    }

    private boolean checkInJanFebMar(String str) {
        if (!str.equalsIgnoreCase("jan") && !str.equalsIgnoreCase("feb") && !str.equalsIgnoreCase("mar"))
            return false;
        return true;
    }

    private boolean checkFinancialYear(String fromMonth, String toMonth
            , int fromYear, int toYear) {
        if ((!checkInJanFebMar(fromMonth) && fromYear == toYear) ||
                (!checkInJanFebMar(fromMonth) && checkInJanFebMar(toMonth
                ) && fromYear + 1 == toYear) ||
                (checkInJanFebMar(fromMonth) && checkInJanFebMar(toMonth
                ) && fromYear == toYear))
            return true;
        return false;
    }
}
