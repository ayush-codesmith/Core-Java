package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface2 {
    public static void main(String[] args) {
        // Using Predicate Interface to Filter Strings
        List<String > list = new ArrayList<>();
        list.add("Ayush");
        list.add("Prakash");
        list.add("Karan");
        list.add("Kunal");
        list.add("Arman");
        Predicate<String > stringPredicate = n->n.startsWith("A");
        for (String i : list){
            if (stringPredicate.test(i)){
                System.out.println(i);
            }
        }
    }
}
