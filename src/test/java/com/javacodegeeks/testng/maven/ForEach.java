package com.javacodegeeks.testng.maven;

//Find  largest even number
public class ForEach {
    public static void main(String[] args) {


        int[] a = {100, 2, 3, 1000, 61, 2401,2400,88, 1001, 251, 260, 420};
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max && a[i] % 2 == 0) {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
