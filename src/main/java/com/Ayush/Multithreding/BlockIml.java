package com.Ayush.Multithreding;

public class BlockIml {
    public static void main(String[] args) throws InterruptedException {
        BlockDemo b = new BlockDemo();

        Thread t1 = new Thread(()->{
            for (int i=0;i<1000;i++){
                b.inc();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i=0;i<1000;i++){
                b.inc();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Total Count :"+b.get());

    }
}
