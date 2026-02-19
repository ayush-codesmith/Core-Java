package com.Ayush.collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DqueueDemo {
    // it is a duoble ended queue
//    Deque<Integer> deque1 = new LinkedList<>();
//    Deque<Integer> deque2 = new ArrayDeque<>();
//    Deque<Integer> deque3 = new ConcurrentLinkedDeque<>();
//    // this are 3 classe to implemetn Deque
    public static void main(String[] args) {

//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(2);
//        deque.add(4);
//
//        deque.addFirst(3);
//        deque.addLast(5);
//        System.out.println(deque);

        Deque<Integer> deque1 = new LinkedList<>();
        deque1.addLast(2);
        deque1.addFirst(1);
        System.out.println(deque1);





    }



}
