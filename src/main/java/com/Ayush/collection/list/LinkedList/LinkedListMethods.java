package com.Ayush.collection.list.LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        System.out.println(list);
//        list.add(0,0);
//        System.out.println(list);
//        list.addFirst(-1);
//        list.addLast(6);
//        System.out.println(list);
//        LinkedList<Integer > list1 = new LinkedList<>(Arrays.asList(7,8,9));
//        list.addAll(list1);
//        System.out.println(list);
//        LinkedList<Integer> copy = (LinkedList<Integer>) list.clone();
//        System.out.println(copy);
//        Iterator<Integer> it = list.descendingIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        System.out.println(list.element());
//        System.out.println(list);
//        System.out.println(list.lastIndexOf(1));
//        System.out.println(list.offer(6));
//        System.out.println(list);
        Spliterator<Integer> it = list.spliterator();
        it.forEachRemaining(System.out::println);
    }
}
