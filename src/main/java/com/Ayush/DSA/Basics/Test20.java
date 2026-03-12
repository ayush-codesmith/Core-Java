package com.Ayush.DSA.Basics;

public class Test20 {
    //Amstrong number
    // 123 =1*1*1+2*2*2+3*3*3
    public static boolean printAm(int n){
        int number=0;
        int original=n;
        while (n!=0){
            int digit = n%10;
            number  += digit*digit*digit;
            n/=10;
        }
        return number==original;
    }
    public static void main(String[] args) {
        System.out.println(printAm(153));
    }
}
