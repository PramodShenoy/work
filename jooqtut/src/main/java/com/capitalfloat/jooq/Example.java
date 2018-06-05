package com.capitalfloat.jooq;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.jooq.util.derby.sys.Sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.capitalfloat.jooq.model.Tables.AUTHOR;
import static org.jooq.impl.DSL.select;

public class Example {

    public static void main(String args[]) {

        // This creates a simple query without executing it
        // By default, a Query's toString() method will print the SQL string to the console
       /*System.out.println("Create a simple query without executing it");
        System.out.println(
             select(AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME)
            .from(AUTHOR)
            .orderBy(AUTHOR.ID)
        );*/
        Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/jooq?useSSL=false"
                            ,"root","pramod");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("CLASS NOT FOUND");
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("SQL EXCEPTION");
            e.printStackTrace();
        }
        DSLContext dsl = DSL.using(con);

        dsl.select(AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME)
                .from(AUTHOR)
                .orderBy(AUTHOR.ID)
                .fetch();
    }
}
