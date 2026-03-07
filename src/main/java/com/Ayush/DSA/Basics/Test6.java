package com.Ayush.DSA.Basics;

public class Test6 {
    // Reverse a Number
    public static long reverse(long n){
        long reverse=0;
        while (n!=0){
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverse(2147483647)); // 4321

    }
}
