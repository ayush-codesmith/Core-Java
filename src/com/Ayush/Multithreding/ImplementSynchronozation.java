package com.Ayush.Multithreding;

public class ImplementSynchronozation {
    public static void main(String[] args) throws InterruptedException {
        CounterDemo counterDemo = new CounterDemo();
        Thread t1 = new Thread(()->
        {
            for (int i=0;i<1000;i++){
              counterDemo.inc();
            }
        });

        Thread t2 = new Thread(()->
        {
            for (int i=0;i<1000;i++){
                counterDemo.inc();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counterDemo.getC());
    }
}
