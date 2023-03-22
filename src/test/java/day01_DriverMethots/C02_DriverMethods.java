package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("edgeDriver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com");

        //Sayfa basligini konsola yazdiriniz
        System.out.println(driver.getTitle());

        //Sayfanin Url'ini yazdiriniz
        System.out.println("Sayfanin Url'si  = " + driver.getCurrentUrl());

        //Sonra techproeducation sayfasina gidiniz
        driver.get("https://techproeducation.com");

        //Sayfa basligini konsola yazdiriniz
        System.out.println(driver.getTitle());

        //Sayfanin Url'ini yazdiriniz
        System.out.println("Sayfanin Url'si  =" + driver.getCurrentUrl());

        //Sayfanin windowHandle degerini yazdiriniz
        System.out.println(driver.getWindowHandle());  //Essiz bir kod verir. sayfalar arasi gecis icin kullanilacak

        //
    }
}
