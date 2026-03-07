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

    public static boolean Optimize(int x, int y){
        if (y==1){
            return true;
        }
        if (x==1)
            return y==1;

        while (y>1){
            if (y%x!=0){
                return false;
            }
            y/=x;
        }
        return true;
    }
    public static void main(String[] args) {
        //System.out.println(checkP(3,10));
        System.out.println(Optimize(3,10));
    }
}
