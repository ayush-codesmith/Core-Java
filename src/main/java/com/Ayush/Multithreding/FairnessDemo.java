package com.Ayush.Multithreding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Iml{
    private final Lock lock= new ReentrantLock(true);


    public void method(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" Running..");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName()+" Done!!!");
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
        try {

            t1.start();
            Thread.sleep(500);
            t2.start();
            Thread.sleep(500);
            t3.start();
            Thread.sleep(500);
            t4.start();
        }catch (Exception e){

        }


    }
}
