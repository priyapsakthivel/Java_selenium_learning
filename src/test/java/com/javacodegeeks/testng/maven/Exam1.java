package com.javacodegeeks.testng.maven;

//write a program for addition of 2 number and subraction of 2 numbers
//Note: don't use scanner , hardcode the values for now
//have 2 separate methods to perform this function
//program should only have 2 sys out
//Comments : Format the code always , overall good with time given
public class Exam1 {

    public static void main(String[] args) {
        Exam1 exam1 = new Exam1();
        int a = exam1.add(12, 13);
        int b = exam1.sub(23, 12);
        System.out.println(a);
        System.out.println(b);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
