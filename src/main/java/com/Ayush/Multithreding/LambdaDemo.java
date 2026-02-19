package com.Ayush.Multithreding;

public class LambdaDemo {
    public static void main(String[] args) {
    Thread t1 = new Thread(()->{
        System.out.println("Hello!!");
    });
    t1.start();
    }
}
