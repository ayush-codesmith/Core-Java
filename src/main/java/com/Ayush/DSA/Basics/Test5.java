package com.Ayush.DSA.Basics;

public class Test5 {
    //Given a number n, find the sum of its digits.
    public static void sum(int n){
        int sum =0;
        while (n!=0){
            sum +=(n % 10); // to get last digit and then add to sum variable
            n/=10; // remove last digit
        }
        System.out.println("Sum :"+sum); // TS = O(log n) SC = O(1)

    }
    public static void main(String[] args) {
        sum(123); // it will run 3 times and print 3+2+1=6
    }
}
