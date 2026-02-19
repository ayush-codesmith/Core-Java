package com.Ayush.collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(50);
//        queue.add(3);
//        queue.add(1);
//        queue.add(7);
//        queue.add(9);
//        System.out.println(queue.peek());

        PriorityQueue<String > queue = new PriorityQueue<>();
        PriorityQueue<String > queue1 = new PriorityQueue<>(Comparator.reverseOrder());
        // this is for integer ... for string there is a other way to write lambda expressions
//        PriorityQueue<Integer > queue2 = new PriorityQueue<>((x,y) -> {
//            return x - y;
//        });
        queue.add("A");
        queue.add("U");
        queue.add("C");
        queue.add("F");
        queue.add("B");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        // we can use in constructor
        // Comparator.reverseOrder();
        // We can use lambda  Function

    }
}
