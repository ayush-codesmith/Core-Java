package com.Ayush.generics_in_Java;

public class GenericConstructor {
    private double v;
    <T extends Number> GenericConstructor(T t){
        v = t.doubleValue();
    }
    void show(){
        System.out.println("Value :"+v);
    }

    public static void main(String[] args) {
        GenericConstructor my1 = new GenericConstructor(10);
        GenericConstructor my2 = new GenericConstructor(23.5F);
        my1.show();
        my2.show();
    }

}
