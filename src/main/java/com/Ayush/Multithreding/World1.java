package com.Ayush.Multithreding;

public class World1 implements Runnable {

    @Override
    public void run() {
        for (;;){
            System.out.println("World");
        }
    }
}
