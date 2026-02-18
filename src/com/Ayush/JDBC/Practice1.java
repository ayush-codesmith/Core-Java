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
            Statement statement = connection.createStatement();
            String query = String.format("INSERT INTO users (id , name , surname) VALUES(%o,'%s','%s')",9,"Arman","Patil");
            int rowAffected = statement.executeUpdate(query);
            if (rowAffected>0){
                System.out.println("Data Added");
            }else {
                System.out.println("Fail !!!!");
            }
            String query1 ="SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(query1);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                System.out.println("ID :" + id);
                System.out.println("Name :" + name);
                System.out.println("Surname :" + surname);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
