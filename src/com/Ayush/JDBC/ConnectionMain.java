package com.Ayush.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMain {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
    private static final String userName = "root";
    private static final String password = "Java@80100";
    public static Connection getConnection(){
        try {
          return   DriverManager.getConnection(url,userName,password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
