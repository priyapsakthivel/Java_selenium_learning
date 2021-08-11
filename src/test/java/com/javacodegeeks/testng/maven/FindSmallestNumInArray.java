package com.javacodegeeks.testng.maven;

public class FindSmallestNumInArray {
    public static void main(String[] args) {
        int[]array={123456,9876543,11,98765,2,3,4,5,6,7,8,99,123,234567,4567,87654};
        int count= array[0];
        for (int i=0;i<array.length;i++){
             if(array[i]<count){
                 count=array[i];
             }
        }
        System.out.println(count);
    }
}
