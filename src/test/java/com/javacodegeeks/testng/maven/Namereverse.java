package com.javacodegeeks.testng.maven;

public class NameReverse {
    public static void main(String[] args) {
        NameReverse forloop = new NameReverse();
        forloop.looping();
    }

    public void looping() {
        String name = "priya";
        String namearray[] = name.split("");
        for (int i = 1; i <= name.length(); i++) {
            int num=name.length()-i;
            System.out.println(namearray[num]);
        }
    }
}
