package com.Ayush.generics_in_Java;

public interface GenericWithInterface<T extends Comparable<T>> {
    void min();
    void max();

}
