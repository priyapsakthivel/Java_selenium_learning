package Selenium_easy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Selenium_one {
    public static void main(String[] args) {
        File file = new File("P:\\Webdrivers\\edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }
}
