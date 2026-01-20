package com.Ayush.generics_in_Java;

public class MultipleGenericClass <T,U>{
    T obj1;
    U obj2;
    MultipleGenericClass(T obj1, U obj2){
        this.obj1=obj1;
        this.obj2=obj2;

    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
    public static void main(String[] args) {
       MultipleGenericClass<Integer,String> myObj1 = new MultipleGenericClass<Integer, String>(1,"Ayush");
       MultipleGenericClass<String ,String > myObj2 = new MultipleGenericClass<String, String>("1","Arman");
       myObj1.print();
       myObj2.print();










































    }
}
