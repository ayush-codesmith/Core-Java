package com.Ayush.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class FirstProgram {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
//        System.out.println(list); // When we print an ArrayList using its object name, it internally calls the overridden toString() method of ArrayList, which returns a string representation of all elements in the list.
//        // we can use loops also
//        System.out.println("Using loops");
//        for (int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println("\nusing  For-each-loop");
//        for (int i : list){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.println(list.size());
//        System.out.println(list.get(1));
//        list.add(1,2);
//        System.out.println(list);
//        list.set(1,0);
//        System.out.println(list);
//        //list.clear();
//        System.out.println(list);
//        System.out.println(list.contains(2));
//        list.remove(2);
//        System.out.println(list);
       list.remove(1);
        System.out.println(list);
        System.out.println(list.size());


    }
}
