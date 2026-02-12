package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.List;

interface SingleParameter{
    void display();
}
public class Lambda3 {

    public static void main(String[] args) {
        //no parameter
        SingleParameter obj = ()-> System.out.println("Hello");
        obj.display();

        // single parameter
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach(n-> System.out.println(n));
        System.out.println("Even Numbers in List");
        list.forEach(n->{
            if (n%2==0){
                System.out.println(n);
            }
        });

    }
}
