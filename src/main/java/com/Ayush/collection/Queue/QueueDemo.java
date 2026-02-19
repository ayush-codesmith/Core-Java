package com.Ayush.collection.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // we can use LinkedList or there are other also Classes
//        Queue<String> queue = new LinkedList<>();
//        queue.add("Person 1");
//        queue.add("Person 2");
//        queue.add("Person 3");
//        queue.add("Person 4");
//        queue.add("Person 5");
//        queue.add("Person 6");
//        queue.add("Person 7");
//        queue.add("Person 8");
//        Iterator<String> iterator = queue.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+"-- ");
//        }
//        System.out.println();
//        String remove = queue.remove();
//        System.out.println(queue);
        Queue<String > queue = new PriorityQueue<>();
        queue.add("Person 1");
        queue.add("Person 2");
        queue.add("Person 3");
        queue.add("Person 4");
        queue.add("Person 5");
        queue.add("Person 6");
        queue.add("Person 7");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
