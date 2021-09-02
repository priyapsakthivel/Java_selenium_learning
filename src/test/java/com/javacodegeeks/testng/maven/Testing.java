package com.javacodegeeks.testng.maven;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
        Testing testing = new Testing();
        testing.oddEven(num);
    }
    }

    public Integer oddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "is an even number");
        } else {
            System.out.println(num + "is an odd number");
        }
        return 0;
    }
}
