package com.Ayush.genericsPractice;

public class ImlClassDemo {
    public static void main(String[] args) {
        System.out.println("THis File Is Running.....");
        ClassDemo<Integer> obj = new ClassDemo<>(2);
        System.out.println(obj.getAge());

    }
}
