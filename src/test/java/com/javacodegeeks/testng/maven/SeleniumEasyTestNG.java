package com.javacodegeeks.testng.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Scanner;

public class SeleniumEasyTestNG {
    public WebDriver driver;

    @BeforeTest
    public void launchDriver(){
        File file = new File("P:\\Webdrivers\\edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
    }

    @Test
    public WebDriver getDriver() throws InterruptedException {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        Scanner scanner=new Scanner(System.in);
        String message= scanner.next();
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,200)");
        driver.findElement(By.id("user-message")).sendKeys("alphabets");
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
        String content=driver.findElement(By.id("display")).getText();
        System.out.println(content);
        Thread.sleep(5000);
        Assert.assertEquals(message,content);
        return driver;
    }
}
