package com.capitalfloat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Component
@Configuration
public class ConnectionService {

    private Connection con;

    public Connection getConnection()
    {
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
        return con;
    }

}
