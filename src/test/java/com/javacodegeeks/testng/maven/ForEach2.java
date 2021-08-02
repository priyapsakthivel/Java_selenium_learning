package com.javacodegeeks.testng.maven;

//Find  largest even number
public class ForEach2 {
    public static void main(String[] args) {
      int a[]={1,2,3,4,5,6,15,19};
       int evensum=0;
       int oddsum=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                evensum=a[i]+evensum;
            }else{
                oddsum=a[i]+oddsum;
            }
        }
        System.out.println("evensum ="+evensum);
        System.out.println("oddsum ="+oddsum);
    }
}
