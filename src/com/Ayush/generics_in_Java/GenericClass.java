package com.Ayush.generics_in_Java;

public class GenericClass<T> {
    T obj;
    GenericClass(T obj){
        this.obj=obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
       GenericClass<Integer> myObj1 = new GenericClass<Integer>(12);
       GenericClass<String> myObj2 = new GenericClass<String>("Ayush");
        System.out.println(myObj1.getObj());
        System.out.println(myObj2.getObj());
    }
}
