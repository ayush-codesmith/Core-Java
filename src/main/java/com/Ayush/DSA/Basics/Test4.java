package com.Ayush.DSA.Basics;
//You are given a cubic dice with 6 faces. All the individual faces have a number printed on them. The
//numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube,
//your task is to guess the number on the opposite face of the cube.
public class Test4 {
    public static void dice(int n){
        switch (n){
            case 1:
                System.out.println(6);
                break;
            case 2:
                System.out.println(5);
                break;
            case 3:
                System.out.println(4);
                break;
            case 4:
                System.out.println(3);
                break;
            case 5:
                System.out.println(2);
                break;
            case 6:
                System.out.println(1);
                break;
            default:
                System.out.println("Enter valid number");
        }
    }

    public static void Optimize(int n){
        // we can check opposit number by substartct by 7
        if (n>=1 && n<=6){
            System.out.println(7-n);
        }else {
            System.out.println("Enter Valid number");
        }
    }
    public static void main(String[] args) {
    dice(2);// it will print 5
         Optimize(5);
    }
}
