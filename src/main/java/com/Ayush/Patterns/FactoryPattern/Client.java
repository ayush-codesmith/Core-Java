package com.Ayush.Patterns.FactoryPattern;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car tata = carFactory.getCar("TATA");
        tata.assemble();

        Car truck = carFactory.getCar("Truck");
        truck.assemble();

        Car suv = carFactory.getCar("SUV");
        suv.assemble();
    }


}
