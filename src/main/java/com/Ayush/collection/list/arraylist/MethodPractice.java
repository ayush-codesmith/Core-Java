package com.Ayush.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MethodPractice {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(9);
//        list1.add(10);
//        list.addAll(list1);
////        System.out.println(list);
////        list.clear();
////        System.out.println(list);
//
//        ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
//        System.out.println(list2);
//        System.out.println(list2.contains(2));
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.ensureCapacity(20);
//        for (int i=1;i<=20;i++){
//            list.add(i);
//        }
//        for (Integer a : list){
//            System.out.println(a);
//        }
//        System.out.println();
//        System.out.println(list.size());

        //for each
//        list.forEach(e-> System.out.println(e));
//        System.out.println(list.indexOf(2));
//        System.out.println(list.isEmpty());
        //forward
//        ListIterator<Integer> it = list.listIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        //backward
//        ListIterator<Integer> it2 = list.listIterator(list.size());
//        while (it2.hasPrevious()){
//            System.out.println(it2.previous());
//        }
//       Iterator<Integer> it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        ArrayList<Integer> removeNumbers = new ArrayList<>();
//        removeNumbers.add(2);
//        removeNumbers.add(3);
//        list.removeAll(removeNumbers);
//        System.out.println(list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if (it.next()%2!=0){
                it.remove();
            }
        }
        System.out.println(list);


    }
}
