package com.javacodegeeks.testng.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GrowwApp {
    public WebDriver driver;

    @BeforeClass
    public void driver_declared(){
        System.setProperty("webdriver.edge.driver","P:\\Webdrivers\\edgedriver.exe");
        driver= new EdgeDriver();
    }

    @Test
    public void testIfInvalidEmailDontPass(WebDriver driver) {
        try {
            driver.get("https://www.groww.in/");
            Thread.sleep(100);
            driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div/div")).click();
            driver.findElement(By.id("login_email1")).sendKeys("qwertyu@sasasasa");
            Thread.sleep(100);
            driver.findElement(By.xpath("//*[@id='lils382InitialLoginScreen']/div[4]/div[2]/div/div")).click();
            WebElement error_mg = driver.findElement(By.xpath("//*[@id='lils382InitialLoginScreen']/div[4]/div[1]/div/div"));
            Assert.assertEquals(error_mg.getText(), "Please enter a valid email address");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
