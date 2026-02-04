package com.Ayush.collection.Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue= new ArrayBlockingQueue<>(2);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);// now the capacity is 2 so it will only store 2 elements if we try to store 3rd element it will throw an error
        System.out.println(queue.offer(1)); //true
        System.out.println(queue.offer(1)); //true
        System.out.println(queue.offer(1)); //false because capacity is only 2
    }
}
