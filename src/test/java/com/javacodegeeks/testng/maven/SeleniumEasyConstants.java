package com.javacodegeeks.testng.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumEasyConstants{
    public WebDriver driver;

    public WebDriver launchDriver() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "P:\\Webdrivers\\edgedriver.exe");
        driver = new EdgeDriver();
    }
}
