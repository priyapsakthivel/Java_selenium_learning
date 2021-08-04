package com.javacodegeeks.testng.maven;

public class ClassA implements InterfaceA{

    public String a;

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.helloAll();
    }

    @Override
    public void add(Object e) {
    }

    public void helloAll(){
        System.out.println(a);

    }
}

