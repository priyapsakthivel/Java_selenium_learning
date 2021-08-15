package com.javacodegeeks.testng.maven;

import java.util.Scanner;

public class PrintOddOrEven {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        if (number%2==0){
            System.out.println(number+ "  its and even number" );
        }
        else {
            System.out.println(number+ "  its a odd number");
        }
    }
}
