package com.Ayush.Multithreding;

public class Main {
    public static void main(String[] args) {
//        World world = new World();
//        world.start();
        World1 world1 =new World1();
        Thread t1 = new Thread(world1);
        t1.start();
        for (;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
