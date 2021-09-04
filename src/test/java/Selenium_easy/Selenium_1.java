package Selenium_easy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class Selenium_1 {
    public static void main(String[]arg){
        Selenium_1 selenium_1= new Selenium_1();
        WebDriver driver_holder=selenium_1.launch();
        selenium_1.table_handle(driver_holder);
    }
    public WebDriver launch(){
        File file= new File("P:\\Webdrivers\\edgedriver.exe");
        System.setProperty("webdriver.edge.driver",file.getAbsolutePath());
        WebDriver driver= new EdgeDriver();
        driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
        driver.manage().window().maximize();
        return  driver;
    }
    public WebDriver table_handle(WebDriver driver_holder){
        WebElement table=driver_holder.findElement(By.xpath("//*[@id=\"myTable\"]/tr[3]/td[4]"));
        table.click();
        System.out.println("table was clicked");
        String word=table.getText();
        System.out.println(word);
        return driver_holder;
    }

}