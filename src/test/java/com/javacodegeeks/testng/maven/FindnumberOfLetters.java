package com.javacodegeeks.testng.maven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindnumberOfLetters {
    public static void main(String[] args) {
        FindnumberOfLetters forloop = new FindnumberOfLetters();
        forloop.looping();
    }

    //Find how many occurances to letter i in the word
    public void looping() {

        String name[] = {"dswqadsdas","dsadassa"};

      List<String> strinList = new ArrayList<>();
      strinList.add("sasa");
      strinList.add("sasa");
      strinList.add("sasdasdasa");
      strinList.add("dsc");
      strinList.add("saccxsa");
      strinList.add("saqwsa");

        Map<String,String> stringStringMap = new HashMap<>();
        stringStringMap.put("hello","mohan");
        stringStringMap.put("hello1","mohan");
        stringStringMap.put("hello2","mohan");
        stringStringMap.put("hello3","mohan");
        stringStringMap.put("hello4","mohan");
        stringStringMap.put("hello5","mohan");


    //For loop - Only loops which will give you index (position) | uses array index | No dependency
    //Enhanced for - No index , but simple loop | uses array alone. | Dependency needs an array or a list
    //Java 8 - Foreach - Most powerful loop | No index | uses stream. |  Dependency needs only a list object


        for (String i : strinList) {
            System.out.println(i);
        }


        stringStringMap.forEach((key, value) -> {
            System.out.println(key+ "" +value);
        });

        stringStringMap.get("hello3");


    }
}
