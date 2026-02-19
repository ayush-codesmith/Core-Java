package com.Ayush.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public class PoolTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            int threadNumber = i;

            new Thread(() -> {
                try {
                    System.out.println("Thread " + threadNumber + " Requesting to connection....");
                    Connection connection = ConnectionManagerP.getConnection();
                    System.out.println("Thread " + threadNumber + " got Connection");
                    Thread.sleep(5000);
                    connection.close();
                    System.out.println("Thread " + threadNumber + " Released Connection");
                } catch (Exception e) {
                    System.out.println("Thread " + threadNumber + " failed: " + e.getMessage());
                    e.printStackTrace();

                }
            }).start();
            Thread.sleep(500);


        }
    }
}
