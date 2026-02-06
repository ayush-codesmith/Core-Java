package com.Ayush.Multithreding;

public class ObjecL {
public synchronized void display(){
    System.out.println(Thread.currentThread().getName()+" acquired object-level lock.");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

}
