package com.Ayush.Multithreding;

public class BlockDemo {
    private int c=0;

    public void inc(){
        synchronized (this){c++;}
       // c++;
    }
    public int get(){
        return c;
    }
}
