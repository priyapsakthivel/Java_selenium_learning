package com.javacodegeeks.testng.maven;

public class AOccur {
    public static void main(String[] args) {
        int count = 0;
        String name = "sajhsjaksfafsas";
        String[] na = name.split("");
        for (int i = 0; i < na.length; i++) {
            if (na[i].contains("a")) {
                count++;
            }
        }
        System.out.println("count of A:" + count);
    }
}

//no da in call innum work innum pogum