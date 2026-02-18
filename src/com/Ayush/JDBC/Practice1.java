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
           // Statement statement = connection.createStatement();
            String query = "INSERT INTO users VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            //String query = String.format("INSERT INTO users (id , name , surname) VALUES(%o,'%s','%s')",9,"Arman","Patil");
            //String query = String.format("UPDATE users set surname = '%s' WHERE id= %o","Khan",1);
            preparedStatement.setInt(1,23);
            preparedStatement.setString(2,"Suraj");
            preparedStatement.setString(3,"Rajput");
            int rowAffected = preparedStatement.executeUpdate();

            if (rowAffected>0){
                System.out.println("Data INSERT");
            }else {
                System.out.println("Fail !!!!");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
