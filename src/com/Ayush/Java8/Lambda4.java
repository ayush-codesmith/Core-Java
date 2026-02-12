package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.List;

public class Lambda4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ayush");
        list.add("Karan");
        list.add("Aramn");
        list.add("Prajwal");

        list.forEach(names-> System.out.println(names));
        System.out.println("Names start with 'A'");
        list.stream()
                .filter(n->n.startsWith("A"))
                .map(n->n.toUpperCase())
                .forEach(System.out::println);
    }
}
