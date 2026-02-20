package com.Ayush.Patterns.FactoryPattern;

public class CarFactory {
    public Car getCar(String carType){
        if (carType==null){
            return null;
        }
        if (carType.equalsIgnoreCase("SUV")){
            return new SUV();
        }
      else   if (carType.equalsIgnoreCase("Truck")){
            return new Truck();
        }
       else if (carType.equalsIgnoreCase("TATA")){
            return new TATA();
        }
       return null;
    }
}
