package com.Ayush.collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class File2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ayush");
        map.put(2, "Karan");
        //1 way to iterate Map
//        Set<Integer> integers = map.keySet();
//        for (Integer a :integers){
//            System.out.println(a+" :"+map.get(a));
//        }

        //2 way
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }

        //3 way
//        for (String value : map.values()){
//            System.out.println(value);
//        }
        //4 way
//        map.forEach((a,v)-> System.out.println(a+":"+v));
        // equals method
        HashMap<Object, Object> map1 = new HashMap<>();
        map1.put("Ayush", 8);
        System.out.println(map1);
        HashMap<Object, Object> map2 = new HashMap<>();
        map2.put("Ayush", 8);
        System.out.println(map1.equals(map2));
        LinkedHashMap<String, Integer> list = new LinkedHashMap<>(11, 2, true);

    }
}
