package com.Ayush.collection.list.arraylist.practice;

import java.util.ArrayList;
import java.util.Comparator;

class SortString implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
}
public class SecondFile {
    public static void main(String[] args) {
        // here we understand how to sort
        ArrayList<String> list = new ArrayList<>();
        list.add("Ayush");
        list.add("Nakull");
        list.add("Balu");
        list.sort(new SortString());
        System.out.println(list);

    }
}
