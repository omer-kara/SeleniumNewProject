package day01tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.Set;

public class C03_GetMethods {

    public static void main(String[] args) {
        System.getProperty("edgeDriver", "src/resources/drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
        driver.close();
    }
}
