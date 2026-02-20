package com.Ayush.Patterns;

public class TestClone {
    public static void main(String[] args) {
        SingletonDemo instance1 = SingletonDemo.getInstance();

        try {
            SingletonDemo instance2 = (SingletonDemo) instance1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
