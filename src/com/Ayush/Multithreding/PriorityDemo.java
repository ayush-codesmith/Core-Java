package com.Ayush.Multithreding;

public class PriorityDemo extends Thread {

    // If want to change Thread Name so create a constructor
   public PriorityDemo(String name){
       super(name);
   }
//
//    @Override
//    public void run() {



//       for (int i=0;i<5;i++){
//           try {
//               Thread.sleep(1000);
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
//           System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getPriority());
//       }
//    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
                Thread.yield();
            } catch (InterruptedException e) {
                System.out.println("Exception " + e);
            }
        }
    }

    public static void main(String[] args) {

        PriorityDemo p1 = new PriorityDemo("Ayush");
        PriorityDemo p2 = new PriorityDemo("Karan");
        p1.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.start();
        //p1.interrupt();



    }
}
