package com.javacodegeeks.testng.maven;

import java.util.Scanner;

public class AugTwentyTwo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        int div=scanner.nextInt();

    int reminder=num%div;
    System.out.println(reminder);
    }
}

/*
    int num=12;
    if (num%2==0){
            System.out.println("its even");
            }
            else{
            System.out.println("its odd");
            }
*/

/*
    int []num={1,1,2,2,333,1231,3,2};
    int first=0;
    int second=0;
        for (int i = 0; i < num.length; i++) {
        if(num[i]>first){
        second=first;
        first=num[i];
        }
        else if (num[i]>second){
        second=num[i];

        }
        }
        System.out.println("first="+first);
        System.out.println("second="+second);*/
