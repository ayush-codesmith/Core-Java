package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamVSCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kunal");
        list.add("Ayush");
        list.add("Balu");

        Comparator<String > com = (O1 , O2)->O1.compareTo(O2);
        Collections.sort(list,com);
        System.out.println(list);
    }
}
