package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_Driver {

    static ChromeOptions options;
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");

        //System.setProperty java uygulamarinda sistem özelliklerini ayarlamak icin kullanilir.
        //Bu method ile class'imiza webdriver'in fiziki yerini belirtiriz
        //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz.


        System.out.println(System.getProperty("chromeDriver"));
        //getProperty methodu ile "key degerini" girerek "value"ya ulasabilirim

        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://amazon.com");


        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://techproeducation.com"); //get() methodu ile adresini belirttigimiz sayfaya gideriz

    }
}
