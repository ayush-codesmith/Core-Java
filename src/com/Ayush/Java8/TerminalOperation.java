package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // 1
//        List<Integer> collect = list.stream().skip(1).collect(Collectors.toList());
//        System.out.println(collect);

//        List<Integer> tolist1 = list.stream().skip(1).toList();
//        System.out.println(tolist1);

        //2
//        long count = list.stream().count();
//        System.out.println(count);

        //3
       // list.stream().forEach(System.out::println);
        //4
//        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
//        System.out.println(reduce.get());
//
//        // 5
//        System.out.println(list.stream().anyMatch(x->x%2==0));
//        System.out.println(list.stream().allMatch(x->x%2==0));
//        System.out.println(list.stream().noneMatch(x->x%2==0));
//
//        //6
//        System.out.println(list.stream().findFirst().get());
//        System.out.println(list.stream().findAny().get());
//
//        List<String> list1 =new ArrayList<>();
//        list1.add("Ayush");
//        list1.add("Anu");
//        list1.add("Charli");
//        list1.add("Pap");
//        list1.add("nihal");
//        list1.stream()
//                .filter(x->x.length()<=3)
//                .forEach(System.out::println);

//        List<Integer> list1 = Arrays.asList(5,2,9,1,6);
//        List<Integer> collect = list1.stream().map(x -> x * x).sorted().collect(Collectors.toList());
//        System.out.println(collect);

//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//        System.out.println(list1.stream().reduce(Integer::sum).get());

//        String sentense = "hello world";
//        long count = sentense.chars().filter(x -> x == 'l').count();
//        System.out.println(count);


    }
}
