package com.javacodegeeks.testng.maven;

import java.util.ArrayList;
import java.util.List;

public class Exam5 {
    public static void main(String[] args) {

        Parents parents = new Parents();
        parents.setRelation("Mom");
        parents.setName("Momdasdsadas");
        parents.setAge(12);

        Parents parents1 = new Parents();
        parents1.setRelation("Mom");
        parents1.setName("Momdasdsadas");
        parents1.setAge(12);

        List<Parents> parentsList = new ArrayList<Parents>();
        parentsList.add(parents);
        parentsList.add(parents1);


        Exam5BioData exam5BioData = new Exam5BioData();
        exam5BioData.setName("Priya");
        exam5BioData.setAge(24);
        exam5BioData.setGender("female");
        exam5BioData.setParents(parentsList);

        Exam5BioData exam5BioData1 = new Exam5BioData();
        exam5BioData1.setName("Pr");
        exam5BioData1.setAge(2);
        exam5BioData1.setGender("f");
        exam5BioData1.setParents(parentsList);


        List<Parents> listEmpty = new ArrayList<>();
        Exam5BioData exam5BioData2 = new Exam5BioData();
        exam5BioData2.setName("iya");
        exam5BioData2.setAge(4);
        exam5BioData2.setGender("m");
        exam5BioData1.setParents(parentsList);


        List<Exam5BioData> list = new ArrayList<Exam5BioData>();
        list.add(exam5BioData);
        list.add(exam5BioData1);
        list.add(exam5BioData2);

        for (Exam5BioData looping : list) {
            if (looping.getParents()!=null){
                if(looping.getParents().isEmpty()){
                    for(Parents list2:looping.getParents()){
                        System.out.println(list2.getAge());
                    }
                }
            }
        }

    }

}
