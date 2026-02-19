package com.Ayush.Java8;
interface A{
    public void add(int a, int b);

    default void show(){
        System.out.println("This is default method");
    }
}
interface B{
    default void print(){
        System.out.println("Hello this is 2 default method");
    }
}
interface C{
    default void printc(){
        System.out.println("Hello this is 3 default method");
    }
}
public class DefaultDemo implements A ,B,C{

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public void showM(){
        System.out.println("I'm Default class method which is calling all method you can see below");
        A.super.show();
        B.super.print();
        C.super.printc();
    }
    public static void main(String[] args) {
    DefaultDemo obj = new DefaultDemo();
    obj.add(2,2);
    obj.showM();
    }
}
