package com.Ayush.collection.list.arraylist.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FirstFile {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        for (Integer a : list){
//            System.out.println(a);
//        }
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        ListIterator<Integer> it = list.listIterator(2);
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        ListIterator<Integer> it = list.listIterator(list.size());
//        while (it.hasPrevious()){
//            System.out.println(it.previous());
//        }



    }
}
