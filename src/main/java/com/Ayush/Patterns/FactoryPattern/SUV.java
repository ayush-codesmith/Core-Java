package com.Ayush.Patterns.FactoryPattern;

public class SUV implements Car{
    @Override
    public void assemble() {
        System.out.println("SUV -- assembly");
    }
}
