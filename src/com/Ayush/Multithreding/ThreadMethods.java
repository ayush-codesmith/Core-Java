package com.Ayush.Multithreding;

public class ThreadMethods extends Thread {
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 = new ThreadMethods();

        t1.start();
        t1.join();
        System.out.println("END !!!!!!");
    }
}
