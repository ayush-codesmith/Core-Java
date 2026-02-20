package com.Ayush.Patterns;

import java.io.*;

public class BrowserReadSolve {
    public static void main(String[] args) {

        try {
            SingletonDemo instance = SingletonDemo.getInstance();
            //serialize the SingltonDemo instance.
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Apply.json"));
            out.writeObject(instance);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Apply.json"));
            SingletonDemo instance2 =(SingletonDemo) in.readObject();
            in.close();

            System.out.println("The Hashcode 1:"+instance.hashCode());
            System.out.println("The Hashcode 2:"+instance2.hashCode());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
