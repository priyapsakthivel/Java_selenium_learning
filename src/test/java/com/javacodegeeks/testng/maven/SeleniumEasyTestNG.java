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
    public WebDriver launchDriver() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "P:\\Webdrivers\\edgedriver.exe");
        driver = new EdgeDriver();
        return driver;

    }

    @Test
    public WebDriver seleniumOne(WebDriver launch) throws InterruptedException {
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
    @Test
    public WebDriver seleniumTwo(WebDriver seleniumOne) throws InterruptedException {
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("scrollTo(0,300)");

        driver.findElement(By.id("sum1")).sendKeys("12345");
        driver.findElement(By.id("sum2")).sendKeys("23456");
        Thread.sleep(300);
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        String totalSum=driver.findElement(By.id("displayvalue")).getText();
        System.out.println(totalSum);
        Thread.sleep(500);
        return driver;

    }
    @Test
    public WebDriver seleniumThree(WebDriver seleniumOne) throws InterruptedException {
        driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
        driver.findElement(By.id("from")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")).click();
        Thread.sleep(500);
        driver.findElement(By.id("to")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a")).click();

        return driver;
    }


    }
