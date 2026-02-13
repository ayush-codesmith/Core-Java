package com.Ayush.Java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferences1 {
    public static void squar(int n){
        System.out.println(n*n);
    }
    //non static method
    public void squarN(int n){
        System.out.println(n*n);
    }
    public static void main(String[] args) {
        // look using method references we complete all logic in 1 line.
        MethodReferences1 methodReferences1 = new MethodReferences1();
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //list.forEach(MethodReferences1::squar); //
       // list.forEach(s->MethodReferences1.squar(s));
        list.forEach(methodReferences1::squarN);

    }
}
