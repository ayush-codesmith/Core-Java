package com.Ayush.JDBC;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {
   private static final HikariDataSource datasource;
   static {
       HikariConfig config = new HikariConfig();
       config.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/port1");
       config.setUsername("root");
       config.setPassword("Java@80100");
       config.setMaximumPoolSize(10);
       datasource = new HikariDataSource(config);
   }
   public static Connection getConnection(){
       try {
           return datasource.getConnection();
       } catch (SQLException e) {
           throw new RuntimeException("Failed to get DB connection", e);
       }
   }

   public static void close(){
       if (datasource!=null){
           datasource.close();
       }
   }
}
