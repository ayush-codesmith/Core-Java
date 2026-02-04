package com.Ayush.Multithreding;

public class ThreadState extends Thread {
    @Override

    public void run() {
        System.out.println("Heyy!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.println(t1.getName());
        System.out.println(ThreadState.currentThread().getName());
        System.out.println(t1.getState()); // NEW
//        System.out.println(t1.getPriority());
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE
//        Thread.sleep(100);
//        System.out.println(Thread.currentThread().getState());
//        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());

    }
}
