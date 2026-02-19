package com.Ayush.Java8;
interface Add{
  int add(int a , int b);
}
public class Lambda1 {
    public static void main(String[] args) {
        Add add = (a,b)->a+b;
        int add1 = add.add(2, 3);
        System.out.println(add1);
    }

}
