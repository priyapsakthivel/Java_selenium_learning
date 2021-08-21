package com.javacodegeeks.testng.maven;

public class AugTwentyOne {
    public static void main(String[] args) {
    String name="qwertasaayuipkaaaajhgfdsaqwertaaaayuiopasdfghjkl";
    String[]namearray=name.split("");
    int count=0;
        for (int i = 0; i < namearray.length; i++) {
            if (namearray[i].contains("a")){
                count++;
            }
        }System.out.println(count);
    }
}



/*int count=0;
    int[] num={1234,1,2,3,4,1,5,52,54,987,12};
        for (int i=0;i<num.length;i++){
        if(num[i]>count){
        count=num[i];
        }
        }
        System.out.println(count);*/
/*
int[] num={1234,1,2,3,4,1,5,52,54,987,12};
    int count=num[0];

        for(int i=0;i< num.length;i++){
        if (num[i]<count){
        count=num[i];
        }
        }
        System.out.println(count);*/
