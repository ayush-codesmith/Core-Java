package com.Ayush.collection.list.Stack;

import java.util.Stack;

public class Understanding {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(2);
        list.push(3);
        list.push(5);
        list.push(6);
//        System.out.println(list);
//        while (!list.isEmpty()){
//            System.out.println(list.pop());
//        }
//        System.out.println(list);
        list.add(7);
        System.out.println(list.peek());
    }
}
