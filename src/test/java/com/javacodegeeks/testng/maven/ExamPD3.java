package com.javacodegeeks.testng.maven;

public class ExamPD3 {
    public static void main(String[] args) {
        String name = "i am an indian";
        String[] names = name.split("");
        for (int i = 0; i < names.length; i++) {
            String[] vowels = {"a", "e", "i", "o", "u"};
            if (names[i].contains("a") || names[i].contains("e") || names[i].contains("i") || names[i].contains("o") || names[i].contains("u"))
            {
                System.out.println("it contains vowels");
            }
        }
    }
}
