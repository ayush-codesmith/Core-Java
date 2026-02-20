package com.Ayush.Patterns.FactoryPattern;

public class Truck implements Car{

    @Override
    public void assemble() {
        System.out.println("Truck-- Assembly");
    }
}
