package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Ayush");
        list.add("Karan");
        list.add("Aramn");
        list.add("Prajwal");


//        list.forEach(names-> System.out.println(names));
//        System.out.println("Names start with 'A'");
//        list.stream()
//                .filter(n->n.startsWith("A"))
//                .map(n->n.toUpperCase())
//                .forEach(System.out::println);
//        Predicate<String > result = n->n.startsWith("S");
//        System.out.println(result.test("Sujal"));
//
//        Consumer<String > obj = n-> System.out.println("Hello "+n);
//        obj.accept("Ayush");

        Supplier<Integer> result1 = ()-> new Random().nextInt(100);

        System.out.println(result1.get());





    }
}
