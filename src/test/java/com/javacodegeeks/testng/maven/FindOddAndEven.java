package com.javacodegeeks.testng.maven;

public class FindOddAndEven {
    public static void main(String[] args) {
        FindOddAndEven forloop = new FindOddAndEven();
        forloop.looping();
    }

    public void looping() {
        int a[] = {1, 2, 3, 4, 5, 3, 3, 3, 32, 32, 32, 23, 32, 32, 3232};
        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("its an even number" + a[i]);
            } else {
                System.out.println("its an odd number" + a[i]);
            }
        }
    }
}
