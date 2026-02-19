package com.Ayush.Multithreding;

public class World extends Thread{
    @Override
    public void run() {
        for (;;){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

    }
}
