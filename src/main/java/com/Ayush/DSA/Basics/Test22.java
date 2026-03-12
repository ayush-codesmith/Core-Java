package com.Ayush.DSA.Basics;

import java.util.Scanner;

public class Test22 {
    //Day of week
    // so we are consedering 1 jan 1970 = thursday
    //Step1 : we check leap year
    public static boolean isLeap(int years){
        if (years%400==0) return true;
        if (years%100==0) return false;
        return years%4==0;
    }
    public static int findDays(int d, int m, int y){
        // so the plan is first to calculate the total numbers
        // create 1 variable
        int totalDays=0;

        // first we calculate years
        for (int i=1970;i<y;i++){
            if (isLeap(i)){
                totalDays += 366;
            }else {
                totalDays+=365;
            }
        }
        // now months
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i=0;i<m-1;i++){
            totalDays+=monthDays[i];
        }
        //we also check if there is any leap day
        if (m>2 && isLeap(y)){
            totalDays +=1;
        }
        // now we add days
        totalDays+=d-1;  //why -1 because we alrady take 1 refferance
        // main logi
        int dayIndex = (totalDays+4)%7;

        return dayIndex;

    }

    public static void main(String[] args) {
        int d = 13;
        int m =3;
        int y=2026;


        switch (findDays(d, m, y)) {

            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid");
        }
    }

}
