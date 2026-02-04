package com.Ayush.Multithreding;

public class PriorityDemo extends Thread {


    @Override
    public void run() {
       for (int i=0;i<5;i++){
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getPriority());
       }
    }

    public static void main(String[] args) {

        PriorityDemo p1 = new PriorityDemo();
        p1.start();


    }
}
