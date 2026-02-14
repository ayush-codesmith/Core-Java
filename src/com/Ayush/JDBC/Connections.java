package com.Ayush.JDBC;

import java.sql.*;

public class Connections {
    private static final String url ="jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "Java@80100";
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            Connection connections = DriverManager.getConnection(url,username,password);
            Statement statement = connections.createStatement();
            String query = " SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int Id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");
                System.out.println(Id);
                System.out.println(name);
                System.out.println(age);
                System.out.println(marks);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
