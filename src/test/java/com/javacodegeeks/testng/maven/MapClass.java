package com.javacodegeeks.testng.maven;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//wait
public class MapClass {
    public static void main(String[] args) {
        MapModel mapModel= new MapModel();
        mapModel.setName("Manohara");
        mapModel.setAge(42);
        mapModel.setEducation("bscPhyscics");

        MapModel mapModel1= new MapModel();
        mapModel1.setName("hara");
        mapModel1.setAge(21);
        mapModel1.setEducation("bscscience");

        MapModel mapModel2= new MapModel();
        mapModel2.setName("Hariharan");
        mapModel2.setAge(12);
        mapModel1.setEducation(new ArrayList<>());

        Map<String,MapModel> objmap=new HashMap<>();
        objmap.put("1",mapModel);
        objmap.put("2",mapModel1);
        objmap.put("3",mapModel2);

        objmap.forEach((k,v)->{
            System.out.println(k);
        });


    }
}
