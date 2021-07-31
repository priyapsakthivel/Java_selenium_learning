package com.javacodegeeks.testng.maven;

public class HelloWorld {

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld(1,"");
        boolean a = helloWorld.addNumbers(2,3);
        System.out.println(a);
    }


    public boolean addNumbers(int a , int b){
        int c = a+b;
        return true;
    }


    public HelloWorld(int name,String age){
        System.out.println(name);
    }

    //void method
    //no return types
    public void helloWorld(){

    }

    //Return type methods
    public String helloString(){
        System.out.println("im string");
        return "asda";
    }

    //return type with param
    public String helloOAram(String a, int b){
        return "";
    }

    //static methods
    public static void helloStatic(){

    }

    //static methods with param and return type
    //return type and return value should be of same type
    //return type has no association with parameter
    //Object is the super class
    public static Integer helloStatic(Object b){
        return (Integer) b;
    }

    //String,Double,Integer,Long,Boolean,Float - wrapper classes
    //String,int,float,double,boolean,long - primitive data type
    String a = " Mohan";
    int m = 1;
    long ap = 1L;
    float am = 21f;
    double aq= 21.01;




}