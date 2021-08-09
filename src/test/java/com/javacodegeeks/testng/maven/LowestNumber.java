package com.javacodegeeks.testng.maven;

public class LowestNumber {
    public static void main(String[] args) {
        int []num={11,10,1233,33,214,5,6,17,7,17,765432,1};
        int low=num[0];
        for (int i=1;i<num.length;i++)
        {
            if(num[i]< low){
                low=num[i];
            }
        }
        System.out.println(low);
    }
}
