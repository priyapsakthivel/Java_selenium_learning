package com.javacodegeeks.testng.maven;

//find if vowel is present

public class NoOfOccurrence {
    public static void main(String[] args) {

        String a = "shrgfddgffgd";
        String[] array = a.split("");
        int count=0;
        for (String s : array) {
           if(s.contains("d")){
               count++;
           }
        }
        System.out.println(count);


    }
}
