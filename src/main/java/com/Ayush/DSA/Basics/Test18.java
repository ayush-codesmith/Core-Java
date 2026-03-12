package com.Ayush.DSA.Basics;

public class Test18 {
    public static void binary(int n){
      StringBuilder binary = new StringBuilder();
        while (n>0){
        int bit = n%2;
          binary.append((char) ('0'+bit));
            n/=2;
        }
        System.out.println(binary.reverse());
    }
    public static void main(String[] args) {
        binary(12);
    }
}
