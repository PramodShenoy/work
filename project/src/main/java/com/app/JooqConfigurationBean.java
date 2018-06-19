package com.app;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JooqConfigurationBean {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private DSLContext dslContext;

    private Configuration configuration;

    @Bean
    public Configuration getConfiguration()
    {
        configuration = new DefaultConfiguration().set(dataSource)
                .set(SQLDialect.DEFAULT);
        return configuration;
    }
}
