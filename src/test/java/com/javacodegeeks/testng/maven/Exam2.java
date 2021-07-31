package com.javacodegeeks.testng.maven;

//write a program to find if a number is odd or even
// If even return true
// if odd  return false
// print this true or false after returning the value

public class Exam2 {
    public static void main(String[] args) {
        Exam2 exam2 = new Exam2();
        boolean a= exam2.oddEven(12);
        System.out.println(a);
    }

    public boolean oddEven(int a) {
        if (a % 2 != 0) {
            return false;
        }
        return true;
    }
}
