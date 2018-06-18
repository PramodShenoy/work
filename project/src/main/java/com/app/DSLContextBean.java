package com.app;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class DSLContextBean {

    private DSLContext context;
    @Bean
    public DSLContext dslContext(DataSource dataSource) throws Exception
    {
        context = DSL.using(dataSource.getConnection());
        return context;
    }
}
