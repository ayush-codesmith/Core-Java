package com.Ayush.collection.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Person 1");
        queue.add("Person 2");
        queue.add("Person 3");
        queue.add("Person 4");
        queue.add("Person 5");
        queue.add("Person 6");
        queue.add("Person 7");
        queue.add("Person 8");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"-- ");
        }
        System.out.println();
        String remove = queue.remove();
        System.out.println(queue);

    }
}
