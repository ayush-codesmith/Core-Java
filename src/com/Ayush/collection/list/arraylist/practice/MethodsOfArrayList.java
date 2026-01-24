package com.Ayush.collection.list.arraylist.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MethodsOfArrayList {
    public static void main(String[] args) {
        // there are 3 ways to create ArrayList
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//        list.add(0,0);
//        System.out.println(list);
//        list.set(0,5);
//        System.out.println(list);
//        list.remove(Integer.valueOf(5));
//        System.out.println(list);
//        ArrayList<String > list = new ArrayList<>();
//        list.add("Ayush");
//        list.add("Nakul");
//        list.add("Karan");
//        list.remove("Ayush");
//        System.out.println(list);
//        System.out.println(list.contains("Nakul"));
//        String [] arr = list.toArray(new String[0]);
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println(list.size());
//        System.out.println(list.get(0));
//        list.forEach(a-> System.out.println(a));
//ArrayList<String > copy = (ArrayList<String>) list.clone();
//        copy.forEach(b-> System.out.println(b));
//        System.out.println(copy.isEmpty());
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(2);
//        list.add(6);
//        list.add(9);
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()){
//            if (it.next()%2!=0){
//                it.remove();
//            }
//        }
//        System.out.println(list);

        // 3rd way to create List is using another Arraylist
//        List<Integer> list = List.of(1,2,3,4,5,6);
//        System.out.println(list);
        List<Integer> list1 = Arrays.asList(2,3,4,5);
        System.out.println(list1);
    }
}
