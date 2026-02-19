package com.Ayush.collection.Set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

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
//
//        Set<Integer> set = new TreeSet<>();
//        set.add(2);
//        set.add(6);
//        set.add(9);
//        set.add(1);
//        System.out.println(set);
        SortedSet<Integer> set = new TreeSet<>();
        // just learn it will print natural order with ascending orders

        ConcurrentSkipListSet<Integer> listSet = new ConcurrentSkipListSet<>();
        // this is store data in skipList data Strusture and dones't need any hashing it will stroe data in layringspace
        // so Set is not Synchronized  so we can use collection Class for this but this is not recommended

        //Set<Integer> set1 = Collections.synchronizedSet(set);
        // this set1 object is synchronized means thred safe but it is not recommended
        // we can use thois
        CopyOnWriteArraySet<Integer> set1 = new CopyOnWriteArraySet<>();
        // it will help for connuery while we can perform operation at the time of Itrations


    }
}
