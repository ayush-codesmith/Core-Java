package com.Ayush.Patterns;

import java.io.Serializable;

public class SingletonDemo implements Serializable {
    private  static volatile   SingletonDemo instance;

    private SingletonDemo(){
        if (instance!=null){//Handling Refection Attack.
            throw new IllegalArgumentException("Object is Already exists !! ");
        }
    }
    public static SingletonDemo getInstance() {
        if (instance==null){
            synchronized (SingletonDemo.class){
                if (instance==null){
                    instance = new SingletonDemo();
                }
            }
        }
        return instance;
    }
    public void display(){
        System.out.println("This Is Thread Safe !!");
    }

   protected Object readResolve(){
        return getInstance();
    }

    public static void main(String[] args) {
        Runnable task = ()->{
          SingletonDemo.getInstance().display();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);
        t1.start();
        t2.start();
        t3.start();
        t4.start();




    }
}
