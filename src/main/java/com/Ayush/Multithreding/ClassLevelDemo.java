package com.Ayush.Multithreding;
class Clevel{
    public  static synchronized void display(){
        System.out.println(Thread.currentThread().getName()+" acquired object-level lock.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ClassLevelDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(Clevel::display,"Thread-1");
        Thread t2 = new Thread(Clevel::display,"Thread-2");
        t1.start();
        t2.start();

    }
}
