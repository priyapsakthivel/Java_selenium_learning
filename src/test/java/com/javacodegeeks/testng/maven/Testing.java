package com.javacodegeeks.testng.maven;

public class Testing {
    public static void main(String[] args) {
        String vow = "qwertyuiopasdfghjklzxcvbnmqwertyuioauisdfghjk";
        String[] arr = vow.split("");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("a") || arr[i].contains("e") || arr[i].contains("i") || arr[i].contains("o") || arr[i].contains("u")) {
                count++;
            }
        } System.out.println("it contains vowels:" + count);

        System.out.println("total number of letters: "+vow.length());

    }
}
