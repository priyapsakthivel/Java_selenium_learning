package Selenium_easy;

import javafx.scene.control.ScrollToEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Selenium_one {
    public static void main(String[] args) throws InterruptedException {
        File file = new File("P:\\Webdrivers\\edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        JavascriptExecutor jse= (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,200)");
        driver.findElement(By.id("user-message")).sendKeys("alphabets");
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
        String content=driver.findElement(By.id("display")).getText();
        System.out.println(content);
        Thread.sleep(500);
        jse.executeScript("scrollTo(0,300)");
        driver.findElement(By.id("sum1")).sendKeys("12345");
        driver.findElement(By.id("sum2")).sendKeys("23456");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        String totalSum=driver.findElement(By.id("displayvalue")).getText();
        System.out.println(totalSum);
        Thread.sleep(5000);
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        Thread.sleep(200);
        driver.findElement(By.id("isAgeSelected")).click();
        String msg_displayed= driver.findElement(By.id("txtAge")).getText();
        System.out.println(msg_displayed);
    }
}
