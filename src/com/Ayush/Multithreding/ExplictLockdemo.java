package com.Ayush.Multithreding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccountED{
    private int balance = 1000;

    private final Lock lock = new ReentrantLock();



    public void withdraw(int ammount){
        System.out.println(Thread.currentThread().getName()+" Attempting to withdraw "+ammount);
      try {

          if (lock.tryLock()){
              if (balance>=ammount){
                  try {

                      System.out.println(Thread.currentThread().getName() + " Thread Attempting to withdraw " + ammount);
                      Thread.sleep(3000);
                      balance -= ammount;
                      System.out.println(Thread.currentThread().getName() + " Successful " + balance);
                  }catch (Exception e){
                      Thread.currentThread().interrupt();
                  }finally {
                      lock.unlock();
                  }

              }else {
                  System.out.println(Thread.currentThread().getName()+" Insufficient balance "+balance);
              }
          }else {
              System.out.println(Thread.currentThread().getName()+" Could not acquire the lock will try later");
          }

      }catch (Exception e){
          Thread.currentThread().interrupt();
      }
      }
}
public class ExplictLockdemo {
    public static void main(String[] args) {
        BankAccountED b = new BankAccountED();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                b.withdraw(100);
            }
        };

        Thread t1 = new Thread(runnable,"Thread-1");
        Thread t2 = new Thread(runnable,"Thread-2");
        t1.start();
        t2.start();

    }

}
