package com.Ayush.DSA.Basics;

public class Test2 {
//    Given a number n, we need to print its table

    public static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }

    //Given a positive integer n, find the sum of the first n natural numbers.
    public static int naturalN(int n){
        // logic if n =3 so 1+2+3=6
        int sum = 0 ;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        //table(2);
        System.out.println(naturalN(3)); // so the lop run on n we don't have fix Iteration O(n) // 6

    }
}
