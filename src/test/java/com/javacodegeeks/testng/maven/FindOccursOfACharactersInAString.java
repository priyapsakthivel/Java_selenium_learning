package com.javacodegeeks.testng.maven;

import java.util.HashMap;
import java.util.Map;

public class FindOccursOfACharactersInAString {
    public static void main(String[] args) {
        String length="qwertyuiolkjhgfdsazXCVBNJKLPOI8U7Y6T5REWQWERTYUIOLMNBVCX";
        String[]array= length.split("");
         int count=0;
         for (int i=0;i<array.length;i++) {
             if (array[i].contains("e")) {
               count++;
             }
         }  System.out.println("we got e "+count+" times");

    }
}
