package com.Ayush.Java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferences1 {
    public static void squar(int n){
        System.out.println(n*n);
    }
    public static void main(String[] args) {
        // look using method references we complete all logic in 1 line.
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //list.forEach(MethodReferences1::squar); //
        list.forEach(s->MethodReferences1.squar(s));

    }
}
