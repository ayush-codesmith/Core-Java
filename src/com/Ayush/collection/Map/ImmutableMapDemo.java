package com.Ayush.collection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String ,Integer> list = new HashMap<>();
        list.put("Ayush",1);
        Map<String, Integer> map = Collections.unmodifiableMap(list);
        //System.out.println(map);

//        Map<Object, Object> of = Map.of("Ayush",1,"Vivek",2);
//        //of.put("Vishal",6);// throw error because it is Immutable
//        System.out.println(of);
        // this above Map has limetation it only stotre 10  key value paires for that we also have another opetion
        Map<Object, Object> ofEntries = Map.ofEntries(Map.entry("Ayush",1));
        System.out.println(ofEntries);

    }
}
