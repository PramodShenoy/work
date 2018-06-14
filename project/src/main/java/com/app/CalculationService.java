package com.app;

import com.app.enums.MonthEnum;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.cf.public_.Tables.FILINGS;
import static com.cf.public_.Tables.TAX;

@Component
@Slf4j
public class CalculationService {

    @Autowired
    private DataSource dataSource;
    private DSLContext dslContext;
    private int count = 0;


    public Map<String, Double> getSumAvgFinancialYear(Request request) {
        double sum = 0.0;
        double avg = 0.0;
        String fromMonth = request.getFrom_month(), toMonth
                = request.getTo_month();
        int fromYear = request.getFrom_year(), toYear = request.getTo_year();
        UUID app_id = request.getApp_id();
        boolean flag = checkFinancialYear(fromMonth, toMonth
                , fromYear, toYear);
        try {
            dslContext = DSL.using(dataSource.getConnection());
            if (!flag) {
                log.info("RANGE FINANCIAL YEAR");
                sum += getSumRangeFinancialYear(fromMonth, fromYear, toMonth
                        , toYear, app_id);
                avg = sum / count;
                log.info("SUM IS " + sum);
                log.info("AVG IS " + avg);
                log.info("FINAL COUNT " + count);
            } else {
                log.info("SAME FINANCIAL YEAR");
                sum += getSumSameFinancialYear(fromMonth, fromYear, toMonth
                        , toYear, app_id);
                avg = sum / count;
                log.info("SUM IS " + sum);
                log.info("AVG IS " + avg);
                log.info("FINAL COUNT " + count);
            }
        } catch (Exception e) {
            log.error("SQL EXCEPTION ", e);
        }
        Map<String, Double> resultMap = new HashMap<>();
        resultMap.put("Sum", sum);
        resultMap.put("Avg", avg);
        count = 0;
        return resultMap;
    }

    private double getSumSameFinancialYear(String fromMonth, int fromYear, String toMonth
            , int toYear, UUID app_id) {
        Result<?> result;
        if (checkInJanFebMar(fromMonth))
            result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                    where(TAX.TO_YEAR.eq(fromYear).and(TAX.APP_ID.eq(app_id)))
                    .fetch();
        else
            result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                    where(TAX.FROM_YEAR.eq(fromYear).and(TAX.APP_ID.eq(app_id)))
                    .fetch();
        double sum = 0.0;
        sum += getSumFromTo(fromMonth, result, toMonth
        );
        return sum;
    }

    private double getSumRangeFinancialYear(String fromMonth, int fromYear, String toMonth
            , int toYear, UUID app_id) {
        double sum = 0.0;
        Result<?> result;
        if (!checkInJanFebMar(fromMonth)) {
            result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                    where(TAX.FROM_YEAR.eq(fromYear).and(TAX.APP_ID.eq(app_id)))
                    .fetch();
            fromYear++;
        } else
            result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                    where(TAX.TO_YEAR.eq(fromYear).and(TAX.APP_ID.eq(app_id)))
                    .fetch();
        sum += getSumFromTo(fromMonth, result, "mar");
        fromMonth = "apr";
        log.info("FIRST FY COUNT " + count);
        if (checkInJanFebMar(toMonth
        ))
            toYear--;
        while (fromYear < toYear) {
            result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                    where(TAX.FROM_YEAR.eq(fromYear).and(TAX.APP_ID.eq(app_id)))
                    .fetch();
            sum += getSumFromTo(fromMonth, result, "mar");
            fromYear++;
            log.info("LOOP COUNT " + count);
        }
        log.info("FY IS " + fromYear);
        result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                where(TAX.FROM_YEAR.eq(fromYear).and(TAX.APP_ID.eq(app_id)))
                .fetch();
        sum += getSumFromTo(fromMonth, result, toMonth
        );
        return sum;
    }

    private double getSumFromTo(String fromMonth, Result<?> result, String toMonth
    ) {
        double sum = 0.0;
        int startIndex = MonthEnum.valueOf(fromMonth).id();
        int endIndex = MonthEnum.valueOf(toMonth
        ).id();
        for (Record rowResult : result) {
            try {
                int i = startIndex;
                while (i != endIndex) {
                    String in = MonthEnum.from(i).label();
                    sum += Double.parseDouble(rowResult.get(in).toString());
                    count++;
                    i = (i + 1) % 12;
                    if (i == 0)
                        i = 12;
                }
                sum += Double.parseDouble(rowResult.get(MonthEnum.from(i).label()).toString());
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
