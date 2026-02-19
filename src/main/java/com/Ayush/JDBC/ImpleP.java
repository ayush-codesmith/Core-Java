package com.Ayush.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImpleP {
    public static void main(String[] args) {
        try (Connection connection = ConnectionManagerP.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()){

                System.out.println(resultSet.getString("name")+" "+resultSet.getString("surname"));
            }




        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        ConnectionManagerP.close();
    }
}
