package com.javacodegeeks.testng.maven;

public class Forloop {
    public static void main(String[] args) {
        Forloop forloop= new Forloop();
        forloop.looping();
    }
    public void looping(){
       for (int i=1;i<=10;i++) {
           for (int j = 1; j <= 10; j++) {
               System.out.println(j * i);
           }
           System.out.print(i* 1);
       }
    }
}
