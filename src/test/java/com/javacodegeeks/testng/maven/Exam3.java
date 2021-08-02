package com.javacodegeeks.testng.maven;

//write a program to find if a number is odd or even
// If even return true
// if odd  return false
// print this true or false after returning the value

public class Exam3 {
    public static void main(String[] args) {
        boolean m = Exam3.print2Tables();
        System.out.println(m);
    }

//    return has the capability to even stop loops
    public static boolean print2Tables() {
        boolean match = false;
        for (int i =1;i<=12;i++){
            System.out.println(i);
            if(i == 15){
                match = true;
                return match;
            }
        }
        return match;
    }
}
