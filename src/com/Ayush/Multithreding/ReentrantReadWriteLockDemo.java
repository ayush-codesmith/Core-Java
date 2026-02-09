package com.Ayush.Multithreding;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockDemo {
    private final ReentrantReadWriteLock writeLock = new ReentrantReadWriteLock();
    int data =0;
    public void write(){
        writeLock.writeLock().lock();
        try {
          data++;
            System.out.println(Thread.currentThread().getName()+"Read :"+data);
        }catch (Exception e){

        }finally {
            writeLock.writeLock().unlock();
        }
    }
    public void read(){
        writeLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+" Read :"+data);
        }catch (Exception e){

        }finally {
            writeLock.readLock().unlock();
        }
    }

    public static void main(String[] args) {

        ReentrantReadWriteLockDemo readWriteLockDemo = new ReentrantReadWriteLockDemo();
        new Thread(readWriteLockDemo::write,"Write Thread").start();
        new Thread(readWriteLockDemo::read,"Read-1").start();
        new Thread(readWriteLockDemo::read,"Read-2").start();


    }
}
