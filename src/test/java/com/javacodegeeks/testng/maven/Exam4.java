package com.javacodegeeks.testng.maven;

//write a program to find if a number is odd or even
// If even return true
// if odd  return false
// print this true or false after returning the value

public class Exam4 {
    public static void main(String[] args) {
        Exam4.print2Tables();
    }

    //    return has the capability to even stop loops
    public static void print2Tables() {
        int m[] = {1, 2, 3, 4, 56, 66, 65, 454, 5454};
        for (int i = 1; i < m.length; i++) {
            System.out.println(m[m.length - i]);
        }
    }
}
