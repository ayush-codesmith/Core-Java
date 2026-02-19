package com.Ayush.JDBC;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManagerP {
private static final HikariDataSource dataSource;

static {
    HikariConfig config = new HikariConfig();
    config.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/hikari");
    config.setUsername("root");
    config.setPassword("Java@80100");
    config.setMaximumPoolSize(2);
    config.setConnectionTimeout(3000);

    dataSource = new HikariDataSource(config);
}

public static Connection getConnection(){
    try {
        return dataSource.getConnection();
    }catch (SQLException e){
        throw  new RuntimeException("Failed to get DB commection "+e);
    }
}
public static void close(){
    if (dataSource!=null){
        dataSource.close();
    }
}

}
