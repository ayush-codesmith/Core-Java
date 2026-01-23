package com.Ayush.collection.list.arraylist;

import java.util.ArrayList;

public class Operation {
    public static void main(String[] args) {
        ArrayList<StudentData> list = new ArrayList<>();
        list.add(new StudentData("Ayush",3.3));
        list.add(new StudentData("Karan",9.0));
        list.add(new StudentData("Prajwl",3.8));
        list.add(new StudentData("Aryan",3.5));
    // Ascending order
//        list.sort((a,b)->{
//            if (a.getCgpa()- b.getCgpa()>0){
//                return 1;
//            }else if (a.getCgpa()- b.getCgpa()<0){
//                return -1;
//            }else {
//                return 0;
//            }
//        });
        // descending order
        list.sort((a,b)->{
            if (b.getCgpa()- a.getCgpa()>0){
                return 1;
            }else if (b.getCgpa()- a.getCgpa()<0){
                return -1;
            }else {
                return 0;
            }
        });
       for (StudentData a : list){
           System.out.println(a.getName()+": "+a.getCgpa());
       }
    }
}
