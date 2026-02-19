package com.Ayush.collection.list.Vector;

import java.util.Vector;

public class Understanding {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,2);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
    }
}
