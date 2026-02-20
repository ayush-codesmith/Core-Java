package com.Ayush.Patterns.FactoryPattern;

class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

class Sheep implements Animal{

    @Override
    public void sound() {
        System.out.println("Baa");
    }
}
class FactoryA{
    public static Animal getProduct(String name){
        if (name==null){
            return null;
        }
        if (name.equalsIgnoreCase("Dog")){
            return new Dog();
        }
       else if (name.equalsIgnoreCase("Sheep")){
            return new Sheep();
        }
       return null;
    }
}



public class ClientA {
    public static void main(String[] args) {
        Animal dog = FactoryA.getProduct("Dog");
        dog.sound();

        Animal sheep = FactoryA.getProduct("Sheep");
        sheep.sound();

    }
}
