package com.javacodegeeks.testng.maven;

import java.util.ArrayList;
import java.util.List;

public class AugTwentyFour{
    public static void main(String[] args) {
    AugMod augMod= new AugMod();
    augMod.setName("Ram");
    augMod.setGender('M');
    augMod.setAge(22);

    AugMod augMod1=new AugMod();
    augMod1.setName("Jannu");
    augMod1.setGender('F');
    augMod1.setAge(20);

    List<AugMod> list = new ArrayList<>();
    list.add(augMod);
    list.add(augMod1);

        for (AugMod listarray:list) {
            System.out.println(listarray.getName());
            System.out.println(listarray.getAge());
            System.out.println(listarray.getGender());
        }

    }

}


/*
        for (int i = 1; i <=10 ; i++) {
                int multi=i*20;
                System.out.println("20 multiples  ----> "+i+"*20="+multi);
                }*/
