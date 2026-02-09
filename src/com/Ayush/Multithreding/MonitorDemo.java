package com.Ayush.Multithreding;
class SharedResource{
    public void printTable(int n){
        synchronized (this){
            for (int i=1;i<=10;i++){
                System.out.println(n*i);
                //notify();
                notifyAll();
                if (i==5){
                    System.out.println(Thread.currentThread().getName()+" Waiting....");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread1 extends Thread{
    SharedResource  resource;
    MyThread1(SharedResource resource){
        this.resource=resource;
    }
    public void run(){
        resource.printTable(2);
    }
}
class MyThread2 extends Thread{
    SharedResource  resource;
    MyThread2(SharedResource resource){
        this.resource=resource;
    }
    public void run(){
        resource.printTable(3);
    }
}
public class MonitorDemo {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();


    }


}
