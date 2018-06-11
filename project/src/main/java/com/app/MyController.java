package com.app;


import com.app.enums.MonthEnum;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

import static com.cf.public_.Tables.FILINGS;
import static com.cf.public_.Tables.TAX;

@RestController
@Slf4j
public class MyController {


    @Autowired
    private DataSource dataSource;
    @RequestMapping(value = "/get")
    public ResponseEntity<String> get() {
        DSLContext dslContext;
        int fy = 2016;
        int ty = 2018;
        String fm = "may";
        String tm = "jan";
        try {
            double sum = 0.0;
            boolean flag = checkFinancialYear(fm, tm, fy, ty);
            log.info(Boolean.toString(flag));
            dslContext = DSL.using(dataSource.getConnection());
            if (!flag) {
                if (!checkInJanFebMar(fm)) {
                    Result result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                            where(TAX.FROM_YEAR.eq(fy)).fetch();
                    sum += getSumFromTo(fm, result, "mar");
                    fy++;
                    fm="apr";
                    while (fy < ty-1 && !checkInJanFebMar(tm)) {
                        result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                                where(TAX.FROM_YEAR.eq(fy)).fetch();
                        sum += getSumFromTo("apr", result, "mar");
                        log.info(Double.toString(sum));
                        fy++;
                    }
                    result = dslContext.selectFrom(TAX.join(FILINGS).on(TAX.ID.eq(FILINGS.ID))).
                            where(TAX.FROM_YEAR.eq(fy)).fetch();
                    sum+=getSumFromTo(fm,result,tm);
                    log.info(Double.toString(sum));
                }
            }

        } catch (Exception e) {
            log.error("SQL EXCEPTION ", e);
        }

        return new ResponseEntity<>("DONE", HttpStatus.OK);
    }

    public double getSumFromTo(String fm, Result result, String tm) {
        double sum = 0.0;
        int startIndex = MonthEnum.valueOf(fm).id();
        int endIndex = MonthEnum.valueOf(tm).id();
        try {
           int i=startIndex;
           while(i!=endIndex)
           {
               String in = MonthEnum.from(i).label();
               log.info(result.getValue(0, in).toString());
               sum += Double.parseDouble(result.getValue(0, in).toString());
               i=(i+1)%12;
               if(i==0)
                   i=12;
           }
            sum += Double.parseDouble(result.getValue(0, MonthEnum.from(i).label()).toString());
        } catch (Exception e) {
            log.error("ENUM ERROR ", e);
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
