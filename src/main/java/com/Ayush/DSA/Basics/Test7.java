package com.Ayush.DSA.Basics;

public class Test7 {
    // prime numbers

    public static boolean primeN(int n){
        //check the number is prime or not
        boolean isPrime = true;
        //for (int i=2;i<Math.sqrt(n);i++){  // Math.sqrt because we will short the steps fo loops if we don't use this so loop will runs n times so now time complixty is O(n)
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime)
            return true;
        return false;
    }
// if we want to check a nth numbers so how we can do
    public static void printPrime(int n){

        if (n<=1){
            System.out.println("Error");
        }
        for (int i=2;i<=n;i++){
            boolean isPrime = true;
            for (int j=2;j*j<=i;j++){
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i+" ");
            }
        }

    }

    public static void main(String[] args) {
       // System.out.println(primeN(4)); // TC = O(n) and SC = O(1)

       printPrime(10);
    }
}
