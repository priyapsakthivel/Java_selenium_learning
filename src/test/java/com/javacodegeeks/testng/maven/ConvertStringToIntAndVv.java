package com.javacodegeeks.testng.maven;

public class ConvertStringToIntAndVv {
    public static void main(String[] args) {
        String name = "1234";
        int numbers=1234567890;

        //covert int to string
        String numchanged=Integer.toString(numbers);
        System.out.println(numchanged);

        //covert string to int
        int namechanged=Integer.parseInt(name);
        System.out.println(namechanged);

    }
}
