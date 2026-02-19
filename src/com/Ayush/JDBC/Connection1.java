package com.Ayush.JDBC;

import java.sql.*;

public class Connection1 {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/connection1";
    private static final String userName = "root";
    private static final String password = "Java@80100";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement INstatement = connection.createStatement();
            int i = INstatement.executeUpdate("INSERT INTO users(name,surname,age,city)" + "VALUES('Piyush','Kute',21,'Nagpur')");
            if (i > 0) {
                System.out.println("Data Is Inserted Successfully");
            } else {
                System.out.println("Data Insertion is Field");
            }

            //printing databases data using ResultSet interfaces.
            ResultSet resultSet = INstatement.executeQuery("SELECT * FROM users");
            System.out.printf("%-5s %-15s %-15s %-15s%n",
                    "ID", "Name", "Surname", "City");

            System.out.println("------------------------------------------------------------");

            while (resultSet.next()) {

                System.out.printf("%-5d %-15s %-15s %-15s%n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("city"));
            }
            connection.close();
            INstatement.close();
            resultSet.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
