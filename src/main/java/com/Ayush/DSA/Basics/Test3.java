package com.Ayush.DSA.Basics;

public class Test3 {
                            //   13      4
    public static int checkN(int n , int m){
       int q = n/m;  // 3
       int n1 = q*m; // candidate 1  n1=12
        int n2;

        if (n*m>0){ // + or - valuse
            n2 = m * (q+1); // second candidate n2 =16
        }else {
            n2 = m*(q-1); // to handle negative closest
        }
                    //13-12=1 <     13-16=3
        if (Math.abs(n-n1)<Math.abs(n-n2)){
            return n1; // it will print n1 =12
        }

        return n2; // n2=16

    }
    public static void main(String[] args) {
        System.out.println(checkN(13,4)); // n1
        // the steps are constant so time complixty is O(1) and SC is O(1).
    }
}
