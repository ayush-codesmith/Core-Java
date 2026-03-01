package com.Ayush.JDBC;

import java.sql.*;

public class IntrevuewP {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/inter";
    private static final String username = "root";
    private static final String password = "Java@80100";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try(Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement statement = connection.prepareStatement("Select * from users")) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                System.out.println("ID :"+resultSet.getInt("id"));
                System.out.println("Name :"+resultSet.getString("name"));
            }


             }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
