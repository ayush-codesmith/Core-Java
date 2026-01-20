package com.Ayush.generics_in_Java;

public class GenericMethod {
    static <T> void method1(T element){
        System.out.println(element.getClass().getName()+"="+element);
    }

    public static void main(String[] args) {
        method1(12);
        method1("Ayush");
        method1(2.2);
    }
}
