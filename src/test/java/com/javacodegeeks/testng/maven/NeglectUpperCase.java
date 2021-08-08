package com.javacodegeeks.testng.maven;

public class NeglectUpperCase {
    public static void main(String[] args) {
        String upperCase="MyTeacherMohan";
        char[] array=upperCase.toCharArray();
        String uppercase1=upperCase.toUpperCase();
        for(int i =0;i<array.length;i++) {
            char element=array[i];
            if (element.equals(uppercase1)) {
                continue;
            }
        }
        System.out.println();
    }
}
