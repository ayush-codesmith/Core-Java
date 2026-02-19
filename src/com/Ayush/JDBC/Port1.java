package com.Ayush.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Port1 {
    public static void main(String[] args) {
        try(Connection connection = ConnectionMain.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name) VALUES(?)")){
            preparedStatement.setString(1,"Kunal");
            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM users");
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name"));
            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
