package com.javacodegeeks.testng.maven;

import java.util.Scanner;

public class JavaFundamentals {

    String name;
    public final String name1 = "as";
    static String staticName;

    public static void main(String[] args) {
        JavaFundamentals java= new JavaFundamentals();
        java.helloWorld();
        JavaFundamentals.helloWorlds();
        JavaFundamentals.helloWorld1("mohan","priya");
        java.helloWorld2("mohan",10,12.4);
        java.helloWorld1("a","n");
    }

    public void helloWorld(){
        name ="Mohan";
    }

    public static void helloWorlds(){
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        staticName = "Raj";
    }

    public static void helloWorld1(String a , String b){

    }

    public  void helloWorld2(String a , int b, double m){
        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
/////////////
}
