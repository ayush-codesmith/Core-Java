package com.Ayush.collection.list.arraylist;

import java.util.ArrayList;

public class SortUsingLamda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(0);
        list.sort(null);// Ascending  order
        System.out.println(list);
        //using lambda
        list.sort((a,b)->a-b);
        System.out.println("Ascending :"+list);
        list.sort((a,b)->b-a);
        System.out.println("Descending:"+list);


    }
}
