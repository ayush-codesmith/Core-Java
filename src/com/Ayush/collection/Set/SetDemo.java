package com.Ayush.collection.Set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // Only 1 point is main set does not contain duplicates
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }

        // In LinkedHashSet it will maintain insertions order
//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(2);
//        set.add(6);
//        set.add(9);
//        set.add(1);
//        System.out.println(set);
        // TreeSet

        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(6);
        set.add(9);
        set.add(1);
        System.out.println(set);






    }
}
