package com.Ayush.DSA.Basics;

import java.util.ArrayList;
import java.util.List;

public class Test16 {
   public static int gcd(int a , int b){
       // using temp variable
       while (b!=0){
           int temp = b;
           b=a%b;
           a=temp;
       }
       return a;
   }

   public static void addFraction(int[] a, int[] b){
       int n1 = a[0];
       int d1 = a[1];

       int n2 = b[0];
       int d2 = b[1];

       int num = n1*d2+n2*d1;
       int den = d1*d2;
       int gcd = gcd(num, den);
       // now this is most important sepe here we are dividin gcd to find reduse fraction
       int ansN = num/gcd;
       int ansD = den/gcd;
       System.out.println(ansN+"/"+ansD);

   }


    public static void main(String[] args) {
        addFraction(new int[]{1,2},new int[]{3,2});
    }
}
