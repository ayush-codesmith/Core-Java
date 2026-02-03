package com.Ayush.collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(50);
        queue.add(3);
        queue.add(1);
        queue.add(7);
        queue.add(9);
        System.out.println(queue.peek());
    }
}
