package com.Ayush.Patterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionAttack {

    // Reflection Attack.
    public static void main(String[] args) {
        SingletonDemo instance1 = SingletonDemo.getInstance();
        SingletonDemo  instance2 = null;

        try {
            Constructor<SingletonDemo> constructor = SingletonDemo.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance2 = constructor.newInstance();
            System.out.println("The Hashcode 1 :"+instance1.hashCode());
            System.out.println("The Hashcode 2 :"+instance2.hashCode());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
