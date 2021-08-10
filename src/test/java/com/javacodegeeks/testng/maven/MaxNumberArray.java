package com.javacodegeeks.testng.maven;

//check 45 repetation
//check all the numbers which repeats
//check the count of each element in array

public class MaxNumberArray {
    public static void main(String[] args) {
        int [] intArray={45,2,3,4,6,7,45,45,6,5};
        int count=0;
        for (int i : intArray) {
            if (i==45){
                count++;
            }

        }
        System.out.println(count);


    }
}
