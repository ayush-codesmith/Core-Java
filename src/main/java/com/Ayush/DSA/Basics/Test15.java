package com.Ayush.DSA.Basics;

public class Test15 {
    // but here the loop iteration is depend on n the so the Time Complixity is O(n) and space is O(1)
    public static boolean checkperfect(int n){
        int sum=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }

    public static boolean Optimize(int n){
        int sum =1;
        // we can reduce the loops Iterations
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                if (i*i!=n){
                    sum+=i+n/i;  // we are just add noranl divisor we we are avoiding it's pair so that's whay we ar ralso ading it's pair
                }else {
                    sum+=i; // this avoid double counting
                }
            }
        }
        return sum==n && n!=1;
    }

    public static void main(String[] args) {
//        System.out.println(checkperfect(15)); // 1+3+5=9 false
//        System.out.println(checkperfect(6)); // 1+2+3=6 true

        System.out.println(Optimize(15));

    }
}
