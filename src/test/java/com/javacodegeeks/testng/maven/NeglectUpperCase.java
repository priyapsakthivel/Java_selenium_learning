package com.javacodegeeks.testng.maven;

public class NeglectUpperCase {
    public static void main(String[] args) {
        String upperCase="MyTeacherMohan";
        char[] array=upperCase.toCharArray();
        String value = "";
        for(int i =0;i<array.length;i++) {
            char element=array[i];
            if(Character.isLowerCase(element)){
                value =  value.concat(String.valueOf(element));
          }
        }
        System.out.println(value);
    }
}
