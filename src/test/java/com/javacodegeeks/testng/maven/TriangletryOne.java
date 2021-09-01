package com.javacodegeeks.testng.maven;
public class TriangletryOne{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 10; j >i; j--) {
                System.out.print("*");
            }
        }
    }
}
