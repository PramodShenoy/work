package com.capitalfloat.rest;

import com.capitalfloat.service.ConnectionService;
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

import static com.capitalfloat.jooq.model.Tables.AUTHOR;
import static com.capitalfloat.jooq.model.Tables.BOOK;

@RestController
@Slf4j
public class Controller {

    private ConnectionService connectionService = new ConnectionService();

    @RequestMapping("/getAuthor")
    public ResponseEntity<String> getAllAuthors()
    {
        DSLContext dsl = DSL.using(connectionService.getConnection());
        Result authorResult = dsl.select(AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME).from(AUTHOR).orderBy(AUTHOR.ID).fetch();
        log.info(authorResult.get(0).toString());
        return new ResponseEntity<>(authorResult.getValue(0,AUTHOR.FIRST_NAME).toString(),HttpStatus.OK);
    }

    @PostMapping("/insertAuthor")
    public ResponseEntity<Void> insertAuthorInfo(@RequestBody MyAuthor myAuthor, UriComponentsBuilder builder)
    {
        log.info(myAuthor.getFirst_name());
        DSLContext dsl = DSL.using(connectionService.getConnection());
        log.info(myAuthor.getDate_of_birth());
        Date date = Date.valueOf(myAuthor.getDate_of_birth());
        dsl.insertInto(AUTHOR, AUTHOR.ID, AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME,AUTHOR.DATE_OF_BIRTH)
                .values(myAuthor.getId(), myAuthor.getFirst_name(), myAuthor.getLast_name(),date).execute();
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @GetMapping("/author/{name}")
    public ResponseEntity<String> getAuthorByName(@PathVariable("name") String name)
    {
        DSLContext dsl = DSL.using(connectionService.getConnection());
        log.info("NAME IS : " + name);
        Result authorResult = dsl.select(AUTHOR.FIRST_NAME,AUTHOR.LAST_NAME,BOOK.TITLE).from(AUTHOR,BOOK)
                .where(AUTHOR.ID.eq(BOOK.AUTHOR_ID),AUTHOR.FIRST_NAME.eq(name)).fetch();
        log.info(authorResult.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
