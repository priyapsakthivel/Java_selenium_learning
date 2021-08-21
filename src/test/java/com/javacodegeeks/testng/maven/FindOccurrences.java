package com.javacodegeeks.testng.maven;

//String a ="iammohanraj";
//find the occurrences of each word and its count

import java.util.HashMap;

public class FindOccurrences {

    public static void main(String[] args) {
        String a= "Mjdabdaaabkadgbkdkhds";
        String[] strArr = a.split("");
        HashMap<String,Integer> hashMap = new HashMap();


        for (String s : strArr) {
            if(hashMap.containsKey(s)){
                int m = hashMap.get(s);
                hashMap.put(s,m++);
            }else{
                hashMap.put(s,1);
            }
        }

        System.out.println(hashMap);


    }
}
