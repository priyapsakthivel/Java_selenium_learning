package com.javacodegeeks.testng.maven;

public class ForLoopTwoAndThree {
    public static void main(String[] args) {
        ForLoopTwoAndThree forLoopTwoAndThree= new ForLoopTwoAndThree();
        for(int i=1;i<=12;i++){
            int two=i*2;
            System.out.println(i+"*2="+two);
            for (int j=1;j<=12;j++){
                int three= j*3;
                System.out.print(j+"*3="+three);
            }
        }
    }
}
