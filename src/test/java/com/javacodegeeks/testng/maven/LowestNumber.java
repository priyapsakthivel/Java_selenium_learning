package com.javacodegeeks.testng.maven;

public class LowestNumber {
    public static void main(String[] args) {
        int []num={1,2,3,3,4,5,6,7,7,7,765432,123};
        int low=0;
        for (int i=0;i<num.length;i++)
        {
            if(num[i]< low && low!=0){

                low=num[i];
            }
        }
        System.out.println(low);
    }
}
