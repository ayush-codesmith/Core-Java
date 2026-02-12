package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.List;

interface SingleParameter{
    void display();
}
interface Operation{
    void operation(int a , int b);
}
public class Lambda3 {

    public static void main(String[] args) {
        //no parameter
//        SingleParameter obj = ()-> System.out.println("Hello");
//        obj.display();
//
//        // single parameter
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        list.forEach(n-> System.out.println(n));
//        System.out.println("Even Numbers in List");
//        list.forEach(n->{
//            if (n%2==0){
//                System.out.println(n);
//            }
//        });
//        //multiple parameter
        Operation add = (a,b)-> System.out.println(a+b);
        Operation mul = (a,b)-> System.out.println(a*b);
        add.operation(2,2); //4

        mul.operation(2,2);//4

    }
}
