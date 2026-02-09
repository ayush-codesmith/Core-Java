package com.Ayush.Multithreding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Iml{
    private final Lock lock= new ReentrantLock();


    public void method(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" Done.");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}
public class FairnessDemo {
    public static void main(String[] args) {
        Iml obj = new Iml();
        Thread t1 = new Thread(obj::method,"Thread-1");
        Thread t2 = new Thread(obj::method,"Thread-2");
        Thread t3 = new Thread(obj::method,"Thread-3");
        Thread t4 = new Thread(obj::method,"Thread-4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
