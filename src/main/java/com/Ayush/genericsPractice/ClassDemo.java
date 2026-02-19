package com.Ayush.genericsPractice;

public class ClassDemo<T> {

    private T age;

    public ClassDemo(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}
