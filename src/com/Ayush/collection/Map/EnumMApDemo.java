package com.Ayush.collection.Map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
enum Day{
    Monday , Tuesday , Wednesday,Thursday, Friday, Saturday,Sunday
}
public class EnumMApDemo {
    public static void main(String[] args) {
        Map<Day,String> list = new EnumMap<>(Day.class);
        list.put(Day.Monday,"Working Day");
        System.out.println(list);
    }
}


