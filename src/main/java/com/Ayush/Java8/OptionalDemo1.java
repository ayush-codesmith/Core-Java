package com.Ayush.Java8;

import java.io.FilterOutputStream;
import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {
    String [] word = new String[10];
    // by default it has 10 null values
//        String wordprint = word[5].toUpperCase();
//        System.out.println(wordprint);
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "word[5]" is null
        //	at com.Ayush.Java8.OptionalDemo1.main(OptionalDemo1.java:7)

        //it will throw run time Error NPE

        String[] Word = new String[10];
        word[5]="Ayush";
        // if I assign a value at index 5
        //word[5]="Ayush is trying hard to get proffessional developre not only developer but someone who can run an own It company";
        // if statement body will get run.
//        Optional<String > optional = Optional.ofNullable(word[5]);
//        if (optional.isPresent()){
//            String wordprint1 = word[5].toUpperCase();
//            System.out.println(wordprint1);
//        }else {
//            System.out.println("The Array is holding null value at that index");
//
//        }

//       Optional<String> optional1 = Optional.empty();
//        System.out.println(optional1 );

//        Optional<String> optional2 = Optional.of(word[5]);
//        System.out.println(optional2);

        Optional<String> value = Optional.of(word[5]);
        System.out.println(value.get());
        System.out.println(value.hashCode());
        System.out.println(value.isPresent());


    }
}
