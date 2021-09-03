package com.javacodegeeks.testng.maven;

public class AugTwentyFive {
    public static void main(String[] args) {
    AugTwentyFive obj = new AugTwentyFive();
    obj.name();
    obj.age();
    }

    @Override
    public String name() {
        System.out.println("Adhi");
        return "";
    }
    @Override
    public int age() {
        System.out.println(5);
        return 0;
    }
}
