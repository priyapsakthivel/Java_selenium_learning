package com.javacodegeeks.testng.maven;

public class Testing {
    public static void main(String[] args) {
        int[] arr = {1, 12, 321, 123, 321, 123543233, 2123454, 322134, 3212343, 212343};
        int count = arr[0];
        int temp =arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<count){
                temp=count;
                count=arr[i];
            }
            else if(arr[i]>temp && temp>count) {
                temp=arr[i];
            }
        }
        System.out.println("second largest :" + temp + "  &" + "largest number :" + count);
        }
    }
