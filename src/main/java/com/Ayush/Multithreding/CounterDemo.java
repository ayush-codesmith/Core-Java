package com.Ayush.Multithreding;

public class CounterDemo {
    private int c =0;

    public synchronized void inc(){
        c++;
    }
    public synchronized int getC(){
        return c;
    }
    public static void main(String[] args) {



    }
}
