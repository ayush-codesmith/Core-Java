package com.Ayush.generics_in_Java;

public class Box <T>{
    T obj;
    Box(T obj){
        this.obj=obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        Box<String> myObj1 = new Box<String>("Ayush");
        Box<Integer> myObj2 = new Box<Integer>(12);
        System.out.println(myObj1.getObj());
        System.out.println(myObj2.getObj());
    }
}
