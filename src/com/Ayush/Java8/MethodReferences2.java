package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ayush");
        list.add("Karan");
        list.add("Prakash");
        list.add("Arman");
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
