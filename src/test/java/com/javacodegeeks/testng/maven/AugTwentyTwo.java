package com.javacodegeeks.testng.maven;

public class AugTwentyTwo {
    public static void main(String[] args) {
    int []num={1,1,2,2,333,1231,3,2};
    int first=0;
    int second=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>first){
                second=first;
                first=num[i];
            }
            else if (num[i]>second){
                second=num[i];

            }
        }
        System.out.println("first="+first);
        System.out.println("second="+second);
    }
}
