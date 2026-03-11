package com.Ayush.DSA.Basics;
/*Given the non-negative integers n , compute the factorial of a given number.
Note: Factorial of n is defined as n * (n -1) * (n - 2) * ... * 1, for n = 0, factorial is 1.*/
public class Test11 {
    public static int findFactorial(int n){
        int fac =1;
        // why we initilize this as zero because complier don't confused
        for (int i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }


    // Using Recursion
    public static int facresursion(int n){
        if (n==0 || n==1)
            return 1;
        return n*findFactorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
