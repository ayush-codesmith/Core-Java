package com.Ayush;

public class Test3 {
    public static void main(String[] args) {
        int n= 0;
        if (n==0){
            System.out.println("Zero is not Even or Odd");
            return;
        }
        if (n%2==0){
            System.out.println(n+" is Even");
        }else if (n%2!=0){
            System.out.println(n+" is Odd");
        }else {
            System.out.println("Enter Valid Entries");
        }
    }
}
