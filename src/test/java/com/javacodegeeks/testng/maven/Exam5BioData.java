package com.javacodegeeks.testng.maven;

import java.util.List;

public class Exam5BioData {
    private String name;
    private int age;
    private String gender;
    private List<Parents> parents;


    public List<Parents> getParents() {
        return parents;
    }

    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
