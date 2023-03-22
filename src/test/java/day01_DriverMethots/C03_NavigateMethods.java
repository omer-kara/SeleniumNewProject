package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C03_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("edgeDriver", "src/resources/drivers/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        //amazon sayfasina gidelim
        driver.get("https://amazon.com");
        Thread.sleep(3000);

        //Sonra techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");   //get() methodu ile ayni sekilde calisir
        Thread.sleep(3000);

        //techpro sayfa basligini konsola yazdiralim
        System.out.println("Sayfa basligi: "+ driver.getTitle());
        Thread.sleep(3000);

        //tekrar amazon sayfasina geri donelim
        driver.navigate().back();   //Ilk sayfaya doner
        Thread.sleep(3000);

        //Amazon sayfasinin basligini yazdiralim
        System.out.println("Sayfa basligi: " + driver.getTitle());

        //Tekrar Techpro sayfasina geri gidelim
        driver.navigate().forward();
        //son olarak sayfayi yenileyelim ve sayfayi kapatalim
        driver.navigate().refresh();//sayfayi yeniler
        driver.close();//sayfayi kapatir

        //Not: Sayfalar arasi gecisler hizli olacagindan 3 saniye gecisler icin bekletelim
    }
}
