package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsDemo1 {
    public static void main(String[] args) {
        //ways to create or use Streams
        //1 way using list
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add("Ayush");
        objects.add(3.3);
        //objects.forEach(System.out::println);
        // objects.stream().forEach(System.out::println);

//        for (Object a :objects){
//            System.out.println(a);
        //}

        //2 way usin Array
//        Integer[] arr = {1,2,3,4,5,6,7,8,9};
//        Arrays.stream(arr).forEach(System.out::println);
//
//        //3 way
//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
//        System.out.println(integerStream);

        //4 way
        //infinite stream
//        Stream<Integer> generate = Stream.generate(()->1).limit(100);
//        generate.forEach(System.out::println);

        // anothre way to create Infinite stream


         Stream<Integer> iterate = Stream.iterate(1, x -> x + 1).limit(100);
        System.out.println(iterate);
        iterate.forEach(System.out::println);


    }
}
