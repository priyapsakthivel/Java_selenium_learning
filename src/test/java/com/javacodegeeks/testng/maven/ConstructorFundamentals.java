package com.javacodegeeks.testng.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class  ConstructorFundamentals {


    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        ConstructorFundamentals constructorFundamentals = new ConstructorFundamentals(driver);
    }

    //Constructor should have same as class name
    //Default Constructor - Form of class
    //Class can have multiple constructors too
    //Constructor should not have return type
    public ConstructorFundamentals(WebDriver driver){
        System.out.println("Im default");
    }


    public void helloAll(){
        System.out.println("im method");
    }

}
