package com.Ayush.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
class DesendingOrder implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
class DesendingStrings implements Comparator<String >{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

public class ArrayListSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(9);
        //list.sort(null);
//        list.sort(new DesendingOrder());
       // System.out.println(list);

        ArrayList<String > list1 = new ArrayList<>();
        list1.add("Ayush");
        list1.add("Nul");
        list1.add("Prakash");
        list1.add("Mayur");
        list1.sort(new DesendingStrings());
        System.out.println(list1);



    }
}
