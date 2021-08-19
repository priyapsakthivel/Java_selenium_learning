package com.javacodegeeks.testng.maven;

import java.util.Scanner;

public class ExamPD1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();

        if(num%2==0){
            System.out.println("its even");
        }
        else {
            System.out.println("its odd");
        }
    }
}
