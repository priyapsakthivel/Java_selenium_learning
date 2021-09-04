package com.javacodegeeks.testng.maven;

public class Testing1 extends Pyramid{
    public static void main(String[] args) {
        Pyramid pyramid= new Testing1();
        String cars=pyramid.car();
       Object models=pyramid.model("bmw");
        System.out.println(cars+models);

    }
    public String personName(){
        System.out.println("priya");
        return "";
    }
    public int age(){
        System.out.println(546);
        return 0;
    }
}
