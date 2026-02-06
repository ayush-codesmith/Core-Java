package com.Ayush.Multithreding;
class  Demo{
    private    boolean running = true;

    public void stop(){
        running=false;
    }

    public void start(){
        new Thread(()->{
            while (running){
                System.out.println("Running....");

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("Stopped");
        }).start();
    }
}
public class VolatileKeyword {
    public static void main(String[] args) throws InterruptedException {
        Demo c = new Demo();
        c.start();
        Thread.sleep(1000);
        c.stop();
    }
}
