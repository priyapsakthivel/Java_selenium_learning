package com.javacodegeeks.testng.maven;

public class FindLargestNumberInArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 67, 8, 900000000, 10000};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > count) {
                count = array[i];
            }
        }
        System.out.println(count);
    }
}
