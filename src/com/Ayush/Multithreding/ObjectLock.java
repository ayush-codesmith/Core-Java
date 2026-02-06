package com.Ayush.Multithreding;

public class ObjectLock {
    public static void main(String[] args) {
    ObjecL l = new ObjecL();
    Thread t1 = new Thread(l::display,"Thread-1");
    Thread t2 = new Thread(l::display,"Thread-2");
    t1.start();
    t2.start();

    }
}
