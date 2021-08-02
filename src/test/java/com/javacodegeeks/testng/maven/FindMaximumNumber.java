package com.javacodegeeks.testng.maven;

public class FindMaximumNumber {
    public static void main(String[] args) {
        FindMaximumNumber forloop = new FindMaximumNumber();
        forloop.looping();
    }

    public void looping() {
        int a[] = {1889, 2, 3, 4, 5, 398789, 3, 3, 32, 32, 32, 23, 32, 32, 3232};
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > num) {
                num = a[i];
            }
        }
        System.out.println(num);
    }
}
