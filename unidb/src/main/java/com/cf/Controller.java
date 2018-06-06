package com.cf;

import com.cf.public_.tables.Uni;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQL;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;

@RestController
public class Controller {

    @Autowired
    private DataSource dataSource;
    public void func()
    {
        try {
            DSLContext dslContext = DSL.using(dataSource.getConnection());
            Result result = dslContext.select(Uni.UNI.NAME).from(Uni.UNI).fetch();
            System.out.println(result.toString());
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
