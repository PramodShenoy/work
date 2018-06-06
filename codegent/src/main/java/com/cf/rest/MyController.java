package com.cf.rest;

import lombok.Data;
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

import java.sql.SQLException;

import static com.cf.jooq.tables.Uni.UNI;


@RestController
@Slf4j
public class MyController {

    private ConnectionService connectionService = new ConnectionService();

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/get")
    public ResponseEntity<String> getUni() {
        log.info("DATASOURCE IS " + dataSource);
        try
        {
            DSLContext dsl = DSL.using(dataSource.getConnection());
            Result result = dsl.select(UNI.ID, UNI.NAME).from(UNI).where(UNI.CITY.eq("California")).fetch();
            log.info(result.toString());
        }catch (SQLException e)
        {
            e.printStackTrace();
            log.error("sdkfl,.");
        }

        return new ResponseEntity<String>("dfdg", HttpStatus.OK);
    }

}
