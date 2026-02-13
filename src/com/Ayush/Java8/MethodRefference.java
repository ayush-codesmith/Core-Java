package com.Ayush.Java8;

import java.util.Arrays;

public class MethodRefference {
    public void print(Integer num){
        System.out.println(num);
    }
    public static void main(String[] args) {
        Integer[] arr ={1,2,3,4,5,6,7,8};
       // Arrays.stream(arr).forEach(n-> System.out.println(n));
        //Arrays.stream(arr).forEach(MethodRefference::print);
       //Arrays.stream(arr).forEach(s->MethodRefference.print(s));
     //   Arrays.stream(arr).forEach(n-> System.out.println(n));
//        Arrays.stream(arr).forEach(n->MethodRefference.print(n));
//        System.out.println();
//        Arrays.stream(arr).forEach(MethodRefference::print);
        MethodRefference obj = new MethodRefference();
        Arrays.stream(arr).forEach(obj::print);

    }
}
