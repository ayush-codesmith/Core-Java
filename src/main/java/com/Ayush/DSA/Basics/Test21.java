package com.Ayush.DSA.Basics;

public class Test21 {
    // Digital root
    // n=123 = 1+2+3=6 we will perfrom Addition until we can not get single digit

    public static int digitRoot(int n){

        if (n==0)
            return 0;

        if (n%9==0)
            return 9;
        return n%9;
    }
    public static void main(String[] args) {
        System.out.println(digitRoot(1234)); // 10=1+0=1
    }
}
