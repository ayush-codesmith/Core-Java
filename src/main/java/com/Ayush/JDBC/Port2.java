package com.Ayush.JDBC;

import java.sql.*;

public class Port2 {
    public static void main(String[] args) {
        try (
            Connection connection = ConnectionMain.getConnection();
        CallableStatement callableStatement = connection.prepareCall("{CALL Getusers()}")){

            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name"));
            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
