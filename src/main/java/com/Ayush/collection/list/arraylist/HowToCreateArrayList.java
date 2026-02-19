package com.Ayush.collection.list.arraylist;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowToCreateArrayList {
    public static void main(String[] args) {
        //There Are 3 Ways we Can create it
        // 1 default constructor
//        List<String > list = new ArrayList<String>();
//        list.add("Ayush");
//        list.add("Arman");
//        System.out.println(list.size());
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list);

        //2 creating ArrayList using specifid capacity value
        //ArrayList<Integer> list = new ArrayList<Integer>(11);
        // here we are resizing Array after element 12 we want to add, so we avoid resizing the ArrayList.
        //3 way
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8);
//        System.out.println(list1);
//        list1.set(1,3);
//        System.out.println(list1);
//        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8);
//        System.out.println(list1);
//
//        String[] arr = {"Ayush","Aranm"};
//        List<String> list2 = Arrays.asList(arr);
//        System.out.println(list2);

//        List<Integer> list1 = List.of(1,2,3,4,5,6);
//        List<Integer> list3=new ArrayList<>(list1);
//        list3.add(4);
//        System.out.println(list3);
        //addAll() method
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(0,0);
//        list1.remove(Integer.valueOf(1));
//        System.out.println(list1);

//        List<Integer> list2 = List.of(5,6,7,8,9,10);
//        list1.addAll(list2);
//        System.out.println(list1);

        // we can also converet the list into array
       Integer[] arr = list1.toArray(new Integer[0]);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}
