package com.Ayush.genericsPractice;

public class ImlInterfaceDemo implements InterfaceDemo<Integer>{
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static void main(String[] args) {
    ImlInterfaceDemo obj = new ImlInterfaceDemo();
        System.out.println(obj.add(1,1));
















    }
}
