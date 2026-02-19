package com.Ayush.collection.list.CopyonArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FirstFile {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Milk");
        list.add("Egg");
        list.add("tomato");

        for (String a : list){
            System.out.println(a);
            if (a.equals("Egg")){
                list.add("Masala");
                System.out.println("Done");
            }
        }
        System.out.println(list);
    }
}
