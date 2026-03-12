package com.Ayush.DSA.Basics;

public class Test19 {
    // find n-th series
    public static void printNth(int n){


        int number=0;
        for (int i=1;i<=n;i++){
            number+=i;
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        printNth(10);
    }
}
