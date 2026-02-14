package com.Ayush.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamExample {
    private static long factorial(int n){
        long result = 1;
        for (int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        List<Integer> iterate = Stream.iterate(1, x->x+1).limit(2000).toList();
//        iterate.stream().map(StreamExample::factorial).forEach(System.out::println);
//        long endtime = System.currentTimeMillis();
//        System.out.println("Time consume :"+(endtime-startTime));
//
//
//        startTime = System.currentTimeMillis();
//        iterate = Stream.iterate(1, x->x+1).limit(2000).toList();
//        iterate.parallelStream().map(StreamExample::factorial).forEach(System.out::println);
//         endtime = System.currentTimeMillis();
//        System.out.println("Time consume :"+(endtime-startTime));

        // cumulative example
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        List<Integer> list1 = list.parallelStream().map(atomicInteger::addAndGet).sequential().toList();
        System.out.println(list1);
    }
}
