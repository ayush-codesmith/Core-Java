package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        //Intermediate Operation
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(1);

       // list.stream().forEach(System.out::println);
       // list.stream().map(x->x*x).forEach(System.out::println);
       // list.stream().filter(x->x%2==0).forEach(System.out::println);
//        list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//        Stream<Integer> sorted = list.stream().sorted();
//       sorted.forEach(System.out::println);

      //  list.stream().filter(x->x%2!=0).distinct().forEach(System.out::println);

//        list.stream()
//                .peek(x-> System.out.println("After .map method the output :"+x))
//                .distinct()
//                .peek(x-> System.out.println("After .map method the output :"+x))
//                .forEach(System.out::println);

        List<List<Integer>> list1 = List.of(
                List.of(1,2),
                List.of(3,4),
                List.of(5,6)
        );

        list1.stream()
                .flatMap(x->x.stream()).forEach(System.out::println);






    }
}
