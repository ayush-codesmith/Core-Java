package com.Ayush.genericsPractice;

public class ConstructorDemo {

    public<T> ConstructorDemo(T a, T b){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo("Ayush","Khandekar");

    }
}
