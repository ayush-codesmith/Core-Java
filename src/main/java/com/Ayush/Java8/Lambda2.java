package com.Ayush.Java8;
interface Funinterface{
    void  add(int x);
    default void norFunc(){
        System.out.println("Hello");
    }
}
public class Lambda2 {
    public static void main(String[] args) {
        Funinterface obj = (int x)-> System.out.println(2*x);
        obj.add(2);
        System.out.println(obj);
        obj.norFunc();
    }
}
