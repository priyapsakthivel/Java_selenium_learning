package com.javacodegeeks.testng.maven;

public class AugTwentyOne {
    public static void main(String[] args) {
        String name="qwertasaayuipkaaaajhgfdsaqwertaaaayuiopasdfghjkl";
        String[]namearray=name.split("");
        int count=0;
        for (int i = 0; i < namearray.length; i++) {
            if (namearray[i].contains("a")||namearray[i].contains("e")||namearray[i].contains("i")||namearray[i].contains("o")||namearray[i].contains("u")){
                count++;
                System.out.println("the String has "+count+"numbers of vowels");
            }
            else{
                System.out.println("the above string has no vowels");
            }
        }
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
/*
String name="qwertasaayuipkaaaajhgfdsaqwertaaaayuiopasdfghjkl";
    String[]namearray=name.split("");
    int count=0;
        for (int i = 0; i < namearray.length; i++) {
        if (namearray[i].contains("a")){
        count++;
        }
        }System.out.println(count);*/
