package com.Ayush.genericsPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcard {
    public static double add(List<? extends Number> list){
        double sum =0;
        for (Number value : list ){
            sum +=value.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<? extends Number> list = Arrays.asList(1.1,22,3.45);
        System.out.println(add(list));
    }
}
