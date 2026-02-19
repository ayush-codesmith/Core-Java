package com.Ayush.collection.list.arraylist;

public class StudentData {
    private String name;
    private double Cgpa;
    StudentData(String name,double cgpa){
        this.name=name;
        this.Cgpa=cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return Cgpa;
    }
}
