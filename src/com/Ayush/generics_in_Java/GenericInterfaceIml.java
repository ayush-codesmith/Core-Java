package com.Ayush.generics_in_Java;

public class GenericInterfaceIml <T extends Comparable<T>> implements GenericWithInterface<T>{

  T[] values;
  GenericInterfaceIml(T[] obj){
      values=obj;
    }

    T max(){

    }
}
