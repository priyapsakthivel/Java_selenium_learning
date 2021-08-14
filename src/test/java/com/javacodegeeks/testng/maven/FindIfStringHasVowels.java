package com.javacodegeeks.testng.maven;

public class FindIfStringHasVowels {
    public static void main(String[] args) {
        String voweltype="qwertyuiopoiuytrsasdfghjklmnbvcxz";
        int count=0;
        for (int a = 0; a <voweltype.length() ; a++) {
            if (voweltype.contains("a")){
                count++;
            }
        }System.out.println(count);
    }
}
