package com.Ayush.Multithreding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//import java.util.concurrent.TimeUnit;

class Ex{

    private int balance = 1000;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
       try {
           System.out.println(Thread.currentThread().getName()+" Attempting to withdraw");
           if(lock.tryLock()){
               if (balance>=amount){
                   try {
                   System.out.println(Thread.currentThread().getName()+" Operation ongoing withdraw "+amount);
                   balance-=amount;
                   Thread.sleep(1000);
                   System.out.println(Thread.currentThread().getName()+" Balance is now "+balance+" After withdraw "+amount);
                   }catch (Exception e){
                       Thread.currentThread().interrupt();
                   }finally {
                       lock.unlock();
                   }

               }else {
                   System.out.println("Insufficient Balance !!!!");
               }

           }else {
               System.out.println("Operation is Lock we will try again !!");
           }

       }catch (Exception e){
          Thread.currentThread().interrupt();
       }

    }

}
public class ExplictLockE1 {
    public static void main(String[] args) {
        Ex op = new Ex();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                op.withdraw(100);
            }
        };
        Thread t1 = new Thread(runnable,"Thread-1");
        Thread t2 = new Thread(runnable,"Thread-2");
        t1.start();
        t2.start();

    }

}
