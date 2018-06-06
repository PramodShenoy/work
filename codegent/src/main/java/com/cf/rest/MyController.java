package com.cf.rest;

import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.sql.DataSource;
import java.sql.Date;

import static com.cf.jooq.tables.Uni.UNI;


@RestController
@Slf4j
public class MyController {

    private ConnectionService connectionService = new ConnectionService();


    @RequestMapping(value = "/get")
    public ResponseEntity<String> getUni()
    {
        DSLContext dsl = DSL.using(connectionService.getConnection());
        Result result = dsl.select(UNI.ID,UNI.NAME).from(UNI).fetch();
        log.info(result.toString());
        return new ResponseEntity<String>(result.toString(),HttpStatus.OK);
    }

}
