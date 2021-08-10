package com.javacodegeeks.testng.maven;

//check 45 repetation
//check all the numbers which repeats
//check the count of each element in array

import java.util.HashMap;
import java.util.Map;

public class MapFundamental {
    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(45,1);
        map.put(1,1);
        map.put(45,2);
        map.put(1,3);

        System.out.println(map);

        Integer a = map.get(45);
        Integer b = map.get(45121);

        System.out.println(a);
        System.out.println(b);

    }
}
