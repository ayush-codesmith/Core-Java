package com.Ayush.DSA.Basics;

import java.math.BigInteger;

public class Test13 {
    /*
    Find GCD  ?
    if we have a and b (12,18)
    12%18->6
    now
    (12,6)
    12%6->0
    so GCD is 6
    now how we write code
    */

    public static int findGCD(int a, int b){
        // to handle zero
        if (a==0 ||b==0) return Math.max(a,b);
        int result = Math.min(a,b);
        while (result>0){
            if (a%result==0 && b%result==0){
                break;
            }
            result--;
        }
        return result;
    }

    public static int best(int a , int b){
        return (b==0) ? a: best(b,a%b);
    }

    public static int evenBest(int a , int b){
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
    public static void main(String[] args) {
//        System.out.println(findGCD(12,18));
      //  System.out.println(best(12,18));

        System.out.println(evenBest(0,18));
    }
}
