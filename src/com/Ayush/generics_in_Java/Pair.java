package com.Ayush.generics_in_Java;

public class Pair<T, U> {
    T value1;
    U value2;
    Pair(T value1,U value2){
        this.value1=value1;
        this.value2=value2;
    }
    public void printValues(){
        System.out.println(value1);
        System.out.println(value2);
    }
    public static <T> void multipleTypesWork(T value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        Pair<Integer,Integer> obj1 = new Pair<Integer, Integer>(1,2);
        Pair<String ,String > obj2 = new Pair<String, String>("Ayush ","Khandekar");
        obj1.printValues();
        obj2.printValues();
        multipleTypesWork(12);
        multipleTypesWork(3.3);
        multipleTypesWork("Ayush");
    }
}
