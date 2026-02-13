package com.Ayush.Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacePractice {
    public static void main(String[] args) {
        // predict
        Predicate<Integer> predicate = x-> x%2==0;
        System.out.println(predicate.test(2));

        Function<Integer, Integer> function = x->2*x;
        System.out.println(function.apply(2));

        Consumer<String> consumer = (s) -> System.out.println("Ayush "+s);
        consumer.accept("Khandekar");

        Supplier<String> stringSupplier = ()-> "Ayush";
        System.out.println(stringSupplier.get());


    }
}
