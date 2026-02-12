package com.Ayush.Java8;

public class FunctionalInterface {
    public static void main(String[] args) {
    // with lambda expression
      //  new Thread(()-> System.out.println("Thread started")).start();

        //if we don't use Lambda expression
        //it will look like
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread started");
            }
        }).start();



    }
}
