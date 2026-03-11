package com.Ayush.DSA.Basics;

public class Test10 {

    static class Points{
        int x,y;
        public Points(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    public static boolean Overelap(Points l1, Points r1 , Points l2 , Points r2){
        // horizontal Check
        if (l1.x>r2.x || l2.x>r1.x)
            return false;
        // Vertical check
        if (r1.y>l2.y || r2.y>l1.y)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Points l1 = new Points(0,10);
        Points r1 = new Points(10,0);
        Points l2 = new Points(5,5);
        Points r2 = new Points(15,0);
        System.out.println(Overelap(l1,r1,l2,r2));
    }
}
