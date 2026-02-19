package com.Ayush.Java8;

import java.util.function.*;

public class FunctionalInterfacePractice {
    public static void main(String[] args) {
//        // predict
//        Predicate<Integer> predicate = x-> x%2==0;
//        System.out.println(predicate.test(2));
//
//        Function<Integer, Integer> function = x->2*x;
//        System.out.println(function.apply(2));
//
//        Consumer<String> consumer = (s) -> System.out.println("Ayush "+s);
//        consumer.accept("Khandekar");
//
//        Supplier<String> stringSupplier = ()-> "Ayush";
//        System.out.println(stringSupplier.get());
    // this only for single attribute if we want double attribute so use below

        BiPredicate<Integer,Integer> predicate1= (x,y)->x*y%2==0;
        System.out.println(predicate1.test(2,2));
        BiFunction<Integer,Integer,Integer> biFunction = (x,y)->x*y*3;
        System.out.println(biFunction.apply(2,2));
        BiConsumer<Integer,Integer> biConsumer = (a,b)-> System.out.println(a+" "+b);
        biConsumer.accept(2,2);

        // there are also some Interfaces
        UnaryOperator<Integer> unaryOperator = x -> x*3;
        System.out.println(unaryOperator.apply(3));
        BinaryOperator<Integer> binaryOperator = (x,y)->x*y;
        System.out.println(binaryOperator.apply(2,2));



    }
}
