package com.javacodegeeks.testng.maven;

//sum all numbers in array

public class Exam10 {
    public static void main(String[] args) {

        int a[] ={1, 2, 3, 4, 5, 5, 54, 5, 546565, 6};
        int num = 0;
        for (int i : a) {
            num = num+i;
        }
        System.out.println(num);


    }
}
