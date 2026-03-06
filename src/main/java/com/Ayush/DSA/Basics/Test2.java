package com.Ayush.DSA.Basics;

public class Test2 {
//    Given a number n, we need to print its table

    public static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    public static void main(String[] args) {
        table(2);

    }
}
