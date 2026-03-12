package com.Ayush.DSA.Basics;

public class Test17 {
    public static int fibb(int n){

int curr=0;
int first=0;
int second =1;
//0 1 1 2 3 5

        for (int i=2;i<=n;i++){
            curr=first+second;
            first=second;
            second=curr;
        }
        return curr;
    }

    public static void printFibb(int n){
        int first =0;
        int second =1;
        System.out.print(first+" "+second+" ");
        for (int i=2;i<=n;i++){
            int sum = first+second;
            first=second;
            second=sum;
            System.out.print(second+" ");
        }
    }
    public static void main(String[] args) {
        //System.out.println(fibb(5));
        printFibb(10);
    }
}
