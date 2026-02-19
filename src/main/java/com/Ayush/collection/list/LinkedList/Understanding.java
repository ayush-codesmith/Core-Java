package com.Ayush.collection.list.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Understanding {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        System.out.println(list);
//        list.add(0,0);
//        System.out.println(list);
//        list.set(0,10);
//        System.out.println(list);
//        System.out.println(list.isEmpty());
//        list.clear();
//        System.out.println(list);
//        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,2));
//        list.removeAll(list1);
//        System.out.println(list);
        list.addLast(5);
        list.addFirst(0);
        //System.out.println(list);
//        ListIterator<Integer> it = list.listIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        //sepcific index
//        ListIterator<Integer> it1 = list.listIterator(1);
//        while (it1.hasNext()){
//            System.out.println(it1.next());
//        }
//        ListIterator<Integer> it2 = list.listIterator(list.size());
//        while (it2.hasPrevious()){
//            System.out.println(it2.previous());
//        }
       // System.out.println(list.getLast());
//        System.out.println(list.getFirst());
//        System.out.println(list.get(5));
       // System.out.println(list.size());
//        for (int i= list.size()-1;i>=0;i--){
//            System.out.println(list.get(i));
//        }
//        Integer[] arr = list.toArray(new Integer[0]);
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }

    }
}
