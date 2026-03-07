package com.Ayush.DSA.Basics;

public class Test2 {
//    Given a number n, we need to print its table

    public static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }

    //Given a positive integer n, find the sum of the first n natural numbers.
    public static int naturalN(int n){
        // logic if n =3 so 1+2+3=6
        int sum = 0 ;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static int naturalNO(int n){
        return n*(n+1)/2 ;// herer only 3 steps no matter what is input n
    }

    //Reverse a number
    public static void reverseN(int n){
        int reverse = 0;
        while (n!=0){
            reverse = reverse*10 + (n%10);
            n=n/10;

        }
        System.out.println(reverse);
    }

//    Given a positive integer n, we have to find the sum of squares of first n natural numbers.

    public static void squareN(int n){
        // n = 2 so now from 1^2 + 2 ^2 = 5
        int square =0;
        for (int i=1;i<=n;i++){
            square+=i*i;
        }
        System.out.println(square);

    }


    public void sawpN(int a, int b){
        // input a=2 , b=9
        int temp = a; // 2
        a=b;//9
        b=temp; //2
        System.out.println(a+ " " +b);
    }

    public static int squarNO(int n){
        return n*(n+1)*(2*n+1)/6;
    }

    public static void main(String[] args) {



   Test2 test2 = new Test2();
   test2.sawpN(2,9); // steps are constandt so TC O(1) SC is O(1)

























//        //table(2);
//       // System.out.println(naturalN(3)); // so the lop run on n we don't have fix Iteration O(n) // 6
//       // System.out.println(naturalNO(1000)); // now only 3 steps happen not 1000 so TC is O(1) and SC O(1)
////        squareN(2)
//        System.out.println(squarNO(2)); // now we have constant steps so TC is O(1) and SC is O(1)
    }
}
