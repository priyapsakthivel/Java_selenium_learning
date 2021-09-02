package com.javacodegeeks.testng.maven;

public class Testing {
    public static void main(String[] args) {
        int[]arr={2222,1,22,33,11112,34432,1234,1321,12322};
        int count=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<count){
                count=arr[i];
            }
        }
        System.out.println(count);
    }
}
