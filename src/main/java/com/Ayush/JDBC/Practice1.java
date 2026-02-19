package com.Ayush.JDBC;

import java.sql.*;
import java.util.Scanner;

public class Practice1 {
    private static final String  url="jdbc:mysql://127.0.0.1:3306/practice2";
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
            String query = "INSERT INTO users (name,subject,marks) VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("You Want to Enter Entries Or see Database (E/S) :");
                String enter = sc.nextLine();
                if (enter.toUpperCase().equals("E")) {
                    while (true) {
                        System.out.print("Enter Name :");
                        String name = sc.nextLine();
                        System.out.print("Enter Subject Name :");
                        String subject = sc.nextLine();
                        System.out.print("Enter Marks :");
                        int mark = sc.nextInt();
                        preparedStatement.setString(1,name);
                        preparedStatement.setString(2,subject);
                        preparedStatement.setInt(3,mark);
                        preparedStatement.addBatch();
                        System.out.print("Want to Add more Data (Y/N) :");
                        String choise = sc.next();
                        sc.nextLine();
                        if (choise.toUpperCase().equals("N")) {
                            break;
                        }
                    }
                }else if (enter.toUpperCase().equals("S")){
                    break;
                }else {
                    System.out.println("Enter Valid Operation !!!");
                }
            }
            // storing operation
            int[] batch = preparedStatement.executeBatch();
            // Validation checks condition ..
            for (int i=0;i< batch.length;i++){
                if (batch[i]==0){
                    System.out.println("Query "+i+" Is Failed");
                }
            }

            // Retrieve Data from the database.
            String query2 = "SELECT * FROM users";
            PreparedStatement preparedStatement1 = connection.prepareStatement(query2);
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()){
                System.out.println("Name :"+resultSet.getString("name"));
                System.out.println("Subject :"+resultSet.getString("subject"));
                System.out.println("Mark :"+resultSet.getInt("marks"));
            }
            System.out.println("Operation Done !!!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
