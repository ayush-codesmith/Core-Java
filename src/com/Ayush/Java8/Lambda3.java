package com.Ayush.Java8;
interface SingleParameter{
    void display();
}
public class Lambda3 {

    public static void main(String[] args) {

        SingleParameter obj = ()-> System.out.println("Hello");
        obj.display();

    }
}
