package com.Ayush.DSA.Basics;

public class Test14 {
    // Find the LCM smallest commom divisor
    // a=4 and b=6 we go through multiple of this both number and then find commal smalles mulktiple who can divide both

    public static int LCM(int a , int b){
       // first wefind min abd max to decide loop condition
        int g = Math.max(a, b);
        int s = Math.min(a, b);
        for (int i=g ; i<=a*b;i+=g){
            if (i%s==0){
                return i;
            }
        }
        return a*b;

    }

    // we can use gcd to find LCM
    static int gcd(int a, int b){
        return (b==0)?a: gcd(b,a%b);
    }
    static int lcm(int a, int b){
        return (a/gcd(a,b))*b;
    }

    public static void main(String[] args) {
        System.out.println(LCM(2,4));
        System.out.println(lcm(10,5));
    }
}
