package com.javacodegeeks.testng.maven;

import java.util.Scanner;

public class FindTheReminder {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int reminder=num1%num2;

        System.out.println("reminder of  "+num1 +"and"+  num2 +"is" +reminder);

    }
}