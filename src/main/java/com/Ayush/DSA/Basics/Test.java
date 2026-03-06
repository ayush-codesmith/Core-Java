package com.Ayush.DSA.Basics;

public class Test {

    public static boolean checkN(int n){

        return (n%2==0);
    }
    public static void main(String[] args) {
        //Given a number n, check whether it is even or odd. Return true for even and false for odd.

//        int n = 15;
////        String s = (n % 2 == 0) ? "True" : "False";
////        System.out.println(s);
//        boolean result = (n%2==0);
//        System.out.println(result);

//        for (int i=1 ; i<=10;i++){
//            if (i%2==0){
//                System.out.print("EVEN :"+i+" ");
//            }else {
//                System.out.print("Odd :"+i+" ");
//            }
//        }
        System.out.println(checkN(2));

    }
}
