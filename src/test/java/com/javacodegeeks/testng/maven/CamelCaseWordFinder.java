package com.javacodegeeks.testng.maven;

public class CamelCaseWordFinder {
    public static void main(String[] args) {

        String name = "theNameIsMohanRajThisIsPriyaDarshini";
        char nameArr[] = name.toCharArray();
        int count = 1;
        for (int i = 0; i < nameArr.length; i++) {
           if(Character.isUpperCase(nameArr[i])){
               count++;
           }

        }
        System.out.println(count);

    }
}

