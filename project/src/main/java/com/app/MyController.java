package com.app;


import com.app.enums.MonthEnum;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.UUID;

import static com.cf.public_.Tables.FILINGS;
import static com.cf.public_.Tables.TAX;

@RestController
@Slf4j
public class MyController {


    @Autowired
    private DataSource dataSource;
    private DSLContext dslContext;

    private int count = 0;

    @RequestMapping(value = "/get")
    public ResponseEntity<String> get() {
        int fy = 2018;
        int ty = 2019;
        String fm = "aug";
        String tm = "feb";
        UUID app_id = UUID.fromString("40e6215d-b5c6-4896-987c-f30f3678f608");
        String state = "maharashtra";
        int tax_type = 1;
        try {
            double sum = 0.0;
            boolean flag = checkFinancialYear(fm, tm, fy, ty);
            dslContext = DSL.using(dataSource.getConnection());
            if (!flag) {
                sum += getSumRangeFinancialYear(fm, fy, tm, ty, app_id);
                log.info(Double.toString(sum));
                log.info("FINAL COUNT " + count);
            } else {
                Result<?> result;
                if (checkInJanFebMar(fm))
                    result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                            where(TAX.TO_YEAR.eq(fy).and(TAX.APP_ID.eq(app_id)))
                            .fetch();
                else
                    result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                            where(TAX.FROM_YEAR.eq(fy).and(TAX.APP_ID.eq(app_id)))
                            .fetch();
                sum += getSumFromTo(fm, result, tm);
                log.info(Double.toString(sum));
                log.info("FINAL COUNT " + count);
            }
        } catch (Exception e) {
            log.error("SQL EXCEPTION ", e);
        }

        return new ResponseEntity<>("DONE", HttpStatus.OK);
    }

    public double getSumRangeFinancialYear(String fm, int fy, String tm, int ty, UUID app_id) {
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

    public double getSumFromTo(String fm, Result<?> result, String tm) {
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

    public boolean checkInJanFebMar(String str) {
        if (!str.equalsIgnoreCase("jan") && !str.equalsIgnoreCase("feb") && !str.equalsIgnoreCase("mar"))
            return false;
        return true;
    }

    public boolean checkFinancialYear(String fm, String tm, int fy, int ty) {
        if ((!checkInJanFebMar(fm) && fy == ty) ||
                (!checkInJanFebMar(fm) && checkInJanFebMar(tm) && fy + 1 == ty) ||
                (checkInJanFebMar(fm) && checkInJanFebMar(tm) && fy == ty))
            return true;
        return false;
    }
}