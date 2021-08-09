package com.javacodegeeks.testng.maven;

//check 45 repetation
//check all the numbers which repeats
//check the count of each element in array

import java.util.HashMap;
import java.util.Map;

public class MaxNumberArray {
    public static void main(String[] args) {
        int [] intArray={45,2,3,4,6,7,45,45,6,5};
        int count=0;
        char ch = (char) intArray[count];
        Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
        for(Character key:charCounter.keySet(charCounter)
        {
            System.out.println(key+""+charCounter.get(key));
        }

    }
}
