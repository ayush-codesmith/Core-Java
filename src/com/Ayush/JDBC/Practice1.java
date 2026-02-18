package com.Ayush.JDBC;

import java.sql.*;

public class Practice1 {
    private static final String  url="jdbc:mysql://127.0.0.1:3306/practice1";
    private static final String  user="root";
    private static final String  password="Java@80100";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection(url,user,password);

            String query = "SELECT name , surname FROM users WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,2);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("Name with Surname");
                System.out.println(resultSet.getString("name")+" "+resultSet.getString("surname"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
