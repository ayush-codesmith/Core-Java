package com.Ayush.Java8;
@java.lang.FunctionalInterface
interface CheckMethod{
    void add(int a, int b);
    // if we try to implementanother abstract methods so it will throw compile time errors...
   // void mul(int a, int b);
}
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
