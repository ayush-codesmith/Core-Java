package com.Ayush.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferences2 {
    MethodReferences2(){
        System.out.println("We create Object of this class using Functional Interface !!");
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ayush");
        list.add("Karan");
        list.add("Prakash");
        list.add("Arman");
//        list.stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//        ListIterator<String> stringListIterator = list.listIterator();
//       while (stringListIterator.hasNext()){
//           System.out.println(stringListIterator.next().toUpperCase(Locale.ROOT));

       //}

        //list.forEach(n-> System.out.println(n.toUpperCase(Locale.ROOT)));
        // below we create object of this class using Functional Interface
        Supplier<MethodReferences2> obj = MethodReferences2::new;
        obj.get();
    }
}
