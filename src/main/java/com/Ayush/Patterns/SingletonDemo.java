package com.Ayush.Patterns;

public class SingletonDemo {
    private static  SingletonDemo instance;

    private SingletonDemo(){
        System.out.println("Singleton Pattern");
    }
    public static SingletonDemo getInstance(){
        if (instance==null){
            instance = new SingletonDemo();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo s1 = SingletonDemo.getInstance();
        SingletonDemo s2 = SingletonDemo.getInstance();
        SingletonDemo s3 = SingletonDemo.getInstance();

        System.out.println((s1==s2)==(s2==s3));

    }
}
