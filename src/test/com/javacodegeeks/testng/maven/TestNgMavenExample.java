package com.javacodegeeks.testng.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class TestNgMavenExample {

	WebDriver webDriver;
	JavascriptExecutor jse;

	@BeforeTest
	public void initializeDriver(){
		File file = new File("P:/Webdrivers/msedgedriver.exe");
		System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.setCapability("headless","true");
		webDriver = new EdgeDriver(edgeOptions);
		jse = (JavascriptExecutor)webDriver;
	}


	@Test
	public void exampleOfTestNgMaven() {
		webDriver.get("http://www.google.com");
		webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("How to calm a girl" + Keys.ENTER);
	}

}
