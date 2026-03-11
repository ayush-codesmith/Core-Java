package com.Ayush.DSA.Basics;
//Given n, count all 'a' and 'b' that satisfy the condition a^3 + b^3 = n. Where (a, b) and (b, a) are considered two different pairs
public class Test12 {
    public int count(int n){
        int count =0;
        for (int i=1;i<=n;i++){
            for (int j=0;j<=n;j++){
                if (i*i*i+j*j*j==n){
                    count++;
                }
            }
        }
        return count;

    }

    public static int Optimize(int n){
        int count =0;
    for (int i=1;i<=Math.cbrt(n);i++){
        int cb = i*i*i;
        int diff = n-cb;
        int cbDiff = (int) Math.cbrt(diff);
        if (cbDiff*cbDiff*cbDiff==diff)
        count++;
    }
    return count;
    }
    public static void main(String[] args) {
//        Test12 test12 = new Test12();
//        int count = test12.count(9);
//        System.out.println(count);
//
//        System.out.println(Math.cbrt(27));
        System.out.println(Optimize(9));
    }
}
