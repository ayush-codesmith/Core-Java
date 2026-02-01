package com.Ayush.collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class File1 {
    public static void main(String[] args) {
        Map<Integer,String > map = new HashMap<>();
        map.put(4,"Kunal");
        map.put(1,"Ayush");
        map.put(2,"Karan");
        map.put(3,"Raju");

//        //System.out.println(map);
//        for (Integer integer : map.keySet()) {
//            System.out.println(map.get(integer));
//        }
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer,String> i :entries){
//            System.out.println(i.getKey()+":"+i.getValue());
//        }
//        for (String value : map.values()){
//            System.out.println(value);
//        }
       // map.forEach((k,v)-> System.out.println(k+":"+v));
        //First way .keyset()
//        Set<Integer> keySet = map.keySet();
//        for (Integer key : keySet){
//            System.out.println(key+" :"+map.get(key));
//        }

        //2 way .entrySet()
//        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//        for (Map.Entry<Integer, String> i : entrySet){
//            System.out.println(i.getKey()+" :"+i.getValue());
//        }
        // 3 way values()
//        for (String i: map.values()){
//            System.out.println(i);
//        }
        //4 easy and mordan way foreach
        map.forEach((K,v)-> System.out.println(K+":"+v));


    }
}
