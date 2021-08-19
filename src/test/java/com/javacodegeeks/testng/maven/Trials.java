package com.javacodegeeks.testng.maven;

public class Trials {
    public static void main(String[] args) {
        String name= "namnjhwaaaaaaagdgwjkhndlkswxewdxtwfdvxbjsx";
        String []names=name.split("");
        int count=0;
        for (int i = 0; i < names.length; i++) {
            if(names[i].contains("j")){
                count++;
            }
        }
        System.out.println(count);

    }
}
