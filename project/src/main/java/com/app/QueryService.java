package com.app;

import com.cf.public_.tables.records.TaxRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.jooq.tools.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import java.util.UUID;

import static com.cf.public_.Tables.TAX;
import static com.cf.public_.Tables.FILINGS;

@Component
@Slf4j
public class QueryService {

    @Autowired
    private DataSource dataSource;
    private DSLContext dslContext;

    public String searchByAppId(UUID appId)
    {
        String jsonResult="";
        try {
            dslContext = DSL.using(dataSource.getConnection());
            Result result = dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId)).fetch();
            jsonResult = result.formatJSON();
            log.info(jsonResult);
        } catch (Exception e) {
            log.error("ERROR IN QUERY " + e);
        }
        return jsonResult;
    }

    public String searchByAppIdState(UUID appId,String state)
    {
        String jsonResult="";
        try {
            dslContext = DSL.using(dataSource.getConnection());
            Result result = dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId).and(TAX.STATE.equalIgnoreCase(state))).fetch();
            jsonResult = result.formatJSON();
            log.info(jsonResult);
        } catch (Exception e) {
            log.error("ERROR IN QUERY " + e);
        }
        return jsonResult;
    }

    public String searchByAppIdYearRange(UUID appId,int fromYear,int toYear)
    {
        String jsonResult="";
        try {
            dslContext = DSL.using(dataSource.getConnection());
            Result result = dslContext.selectFrom(TAX.innerJoin(FILINGS).on(TAX.ID.eq(FILINGS.ID)))
                    .where(TAX.APP_ID.eq(appId).and(TAX.FROM_YEAR.eq(fromYear)).and(TAX.TO_YEAR.eq(toYear)))
                    .fetch();
            jsonResult = result.formatJSON();
            log.info(jsonResult);
        } catch (Exception e) {
            log.error("ERROR IN QUERY " + e);
        }
        return jsonResult;
    }
}
