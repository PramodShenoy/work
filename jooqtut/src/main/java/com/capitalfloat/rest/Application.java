package com.capitalfloat.rest;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.capitalfloat.jooq.model.Tables.AUTHOR;

@SpringBootApplication
public class Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}