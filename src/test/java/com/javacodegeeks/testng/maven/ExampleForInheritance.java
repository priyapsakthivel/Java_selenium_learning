package com.javacodegeeks.testng.maven;

public class ExampleForInheritance {
    public static void main(String[] args) {
        ExampleForInheritance example= new ExampleForInheritance();
        example.name();
        ExampleForInheritanceChild child = new ExampleForInheritanceChild();
        child.age();
    }

    public void name() {
        System.out.println("i am parent ");

    }
}
