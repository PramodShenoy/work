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
        String fm = request.getFrom_month(), tm = request.getTo_month();
        int fy = request.getFrom_year(), ty = request.getTo_year();
        UUID app_id = request.getApp_id();
        boolean flag = checkFinancialYear(fm, tm, fy, ty);
        try {
            dslContext = DSL.using(dataSource.getConnection());
            if (!flag) {
                log.info("RANGE FINANCIAL YEAR");
                sum += getSumRangeFinancialYear(fm, fy, tm, ty, app_id);
                avg = sum / count;
                log.info("SUM IS " + sum);
                log.info("AVG IS " + avg);
                log.info("FINAL COUNT " + count);
            } else {
                log.info("SAME FINANCIAL YEAR");
                sum += getSumSameFinancialYear(fm, fy, tm, ty, app_id);
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

    private double getSumSameFinancialYear(String fm, int fy, String tm, int ty, UUID app_id) {
        Result<?> result;
        if (checkInJanFebMar(fm))
            result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                    where(TAX.TO_YEAR.eq(fy).and(TAX.APP_ID.eq(app_id)))
                    .fetch();
        else
            result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                    where(TAX.FROM_YEAR.eq(fy).and(TAX.APP_ID.eq(app_id)))
                    .fetch();
        double sum = 0.0;
        sum += getSumFromTo(fm, result, tm);
        return sum;
    }

    private double getSumRangeFinancialYear(String fm, int fy, String tm, int ty, UUID app_id) {
        double sum = 0.0;
        Result<?> result;
        if (!checkInJanFebMar(fm)) {
            result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                    where(TAX.FROM_YEAR.eq(fy).and(TAX.APP_ID.eq(app_id)))
                    .fetch();
            fy++;
        } else
            result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                    where(TAX.TO_YEAR.eq(fy).and(TAX.APP_ID.eq(app_id)))
                    .fetch();
        sum += getSumFromTo(fm, result, "mar");
        fm = "apr";
        log.info("FIRST FY COUNT " + count);
        if (checkInJanFebMar(tm))
            ty--;
        while (fy < ty) {
            result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                    where(TAX.FROM_YEAR.eq(fy).and(TAX.APP_ID.eq(app_id)))
                    .fetch();
            sum += getSumFromTo(fm, result, "mar");
            fy++;
            log.info("LOOP COUNT " + count);
        }
        log.info("FY IS " + fy);
        result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                where(TAX.FROM_YEAR.eq(fy).and(TAX.APP_ID.eq(app_id)))
                .fetch();
        sum += getSumFromTo(fm, result, tm);
        return sum;
    }

    private double getSumFromTo(String fm, Result<?> result, String tm) {
        double sum = 0.0;
        int startIndex = MonthEnum.valueOf(fm).id();
        int endIndex = MonthEnum.valueOf(tm).id();
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

    private boolean checkFinancialYear(String fm, String tm, int fy, int ty) {
        if ((!checkInJanFebMar(fm) && fy == ty) ||
                (!checkInJanFebMar(fm) && checkInJanFebMar(tm) && fy + 1 == ty) ||
                (checkInJanFebMar(fm) && checkInJanFebMar(tm) && fy == ty))
            return true;
        return false;
    }
}
