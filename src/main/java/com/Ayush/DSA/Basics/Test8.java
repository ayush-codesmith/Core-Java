package com.Ayush.DSA.Basics;

public class Test8 {
//    Check if a number is a power of another number
    public static boolean checkP(int x ,int y){

        for (int i=y;i>=1;i/=x){ // now this lopp run in reverse order like untile it 1
        if (i%x==0){
            return true ;
        }
        }
       return false;
    }
    public static void main(String[] args) {
        System.out.println(checkP(10,3));
    }
}
