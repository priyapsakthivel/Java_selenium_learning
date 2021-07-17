package com.javacodegeeks.testng.maven;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgMavenExample1 extends TestNgMavenExample{


    @Test
    public void checkWebUrl(){
        System.out.println("hello web url");
    }

    @BeforeClass
    public void imAlsoABeforeClass(){
        System.out.println("im before class in child 1");
    }

    @BeforeClass
    public void imAlsoABeforeClass1(){
        System.out.println("im before class in child 2");
    }


}
