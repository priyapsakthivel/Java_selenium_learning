package com.javacodegeeks.testng.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgMavenExample {

    // Framework = Scalability
    // One such framework/library is selenium
    // Java - Language , Selenium - Library
    // TestNg is a framework , Scalability


    public WebDriver webDriver;

    @BeforeClass
    public void initDriver(){
        System.out.printf("im first");
        System.setProperty("webdriver.edge.driver", "P:\\Webdrivers\\edgedriver.exe");
        webDriver = new EdgeDriver();
    }

    @Test(priority = 0,groups = "amazon")
    public void verifyProductPrice() {
        webDriver.get("https://www.amazon.in/Simpex-Pocket-4000MAh-Rechargeable-Battery/dp/B08HQS8Q2T/ref=sr_1_1?dchild=1&keywords=simpex+rgb&qid=1626543252&sr=8-1");
        String price = webDriver.findElement(By.id("priceblock_ourprice")).getText();
        Assert.assertEquals(price,"₹4,499.00");
    }

    @Test(priority = 1,groups = "google")
    public void verifyPageUrl() {
        webDriver.get("https://www.google.com/");
        Assert.assertEquals(webDriver.getCurrentUrl(),"https://www.google.com/");
    }

    @AfterTest
    public void byeDriver(){
//        webDriver.quit();
    }
/*
    @Test
    public void childTest(){
        //VMI - Virtual Method Invocation
        //Using casting we can call parent/child method
        TestNgMavenExample testNgMavenExample = new TestNgMavenExample1();
        ((TestNgMavenExample1) testNgMavenExample).initDriver();
    }*/

}
