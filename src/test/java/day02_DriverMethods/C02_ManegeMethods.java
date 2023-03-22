package day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_ManegeMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //implicitlyWait==> dolayli olarak bekleme
        //Not: Sayfadaki her bir webelement icin max 20 saniye bekler

        //driver.close(); ==>Sadece calisan browseri kapatir
        //driver.quit();  ==>acik olan tum browserleri kapatir

        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        driver.get("https://youtube.com");
        String actulaTitle = driver.getTitle(); //Gercek baslik
        String expectedTitle = "youtube";       //Beklenen baslik
        if(actulaTitle.equals(expectedTitle)){
            System.out.println("TEST PASSSED");

        }else{
            System.out.println("TEST FAILD Gercek Baslik: " + actulaTitle);
        }
        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String beklenenKelime = "youtube";
        if (actualUrl.contains(beklenenKelime)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILD Gercek Url: " + actualUrl);
        }
        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        //Youtube sayfasina geri donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Amazon sayfasina donun
        driver.navigate().forward();
        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa  doğru başlığı(Actual Title) yazdırın.

        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Faild Gercek Baslik: " + actualTitle);
        }
        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın

        String actualUrl1 = driver.getCurrentUrl();
        String beklenenUrl = "https://www.amazon.com/";
        if (actualUrl1.equals(beklenenUrl)){
            System.out.println("TESD PASSED");
        }else {
            System.out.println("TESDT FAILD Gercek Url: " + actualUrl1);
        }

        //Sayfayi kapatin
        driver.close();
    }
}
