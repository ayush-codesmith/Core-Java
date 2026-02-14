package com.Ayush.Java8;

public class OptionalDemo1 {
    public static void main(String[] args) {
    String [] word = new String[10];
    // by default it has 10 null values
        String wordprint = word[5].toUpperCase();
        System.out.println(wordprint);
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "word[5]" is null
        //	at com.Ayush.Java8.OptionalDemo1.main(OptionalDemo1.java:7)

        //it will throw run time Error NPE


    }
}
