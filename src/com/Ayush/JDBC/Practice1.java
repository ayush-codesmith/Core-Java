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
        try (
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery( "SELECT * FROM users")
            ){
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                System.out.println("ID :" + id);
                System.out.println("Name :" + name);
                System.out.println("Surname :" + surname);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
