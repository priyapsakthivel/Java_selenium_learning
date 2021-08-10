package com.javacodegeeks.testng.maven;

public class Calculator {
    public static void main(String[] args) {
       int a=10;
       int b=10;
       Calculator calculator= new Calculator();
        System.out.println(calculator.add(a,b));
       calculator.sub(a,b);
       calculator.multi(a,b);
       calculator.div(a,b);
    }
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int multi(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
