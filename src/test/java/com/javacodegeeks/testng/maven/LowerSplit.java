package com.javacodegeeks.testng.maven;

public class LowerSplit {
    public static void main(String[] args) {

        String name = "theNameIsMohanRaj";
        String[] cut = name.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])");
        System.out.println(cut.length);
    }
}

