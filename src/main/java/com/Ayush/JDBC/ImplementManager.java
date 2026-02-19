package com.Ayush.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImplementManager {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
try {
    connection = ConnectionManager.getConnection();

    if (connection != null) {
        String query = "SELECT * FROM users";
        preparedStatement = connection.prepareStatement(query);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("name")+" "+resultSet.getString("surname"));
        }

    }else {
        System.out.println("Failed to get connections !");
    }
}catch (SQLException e){
    System.out.println(e.getMessage());
    e.printStackTrace();

}finally {
    // we use finally to close all resources but in this connection to return pool.

    try {
        if (resultSet!=null) resultSet.close();
        if (preparedStatement !=null) preparedStatement.close();
        if (connection!=null) connection.close();
    }catch (SQLException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}
//Close the connection pool when application exits
ConnectionManager.close();

    }
}
