package com.Ayush.genericsPractice;

public class MeythodGenerics {
    public static <T> void print(T a , T b){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        print("Ayush","Khandekar");
        print(1,2);
        print(1.1, 2.34);
    }
}
