import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriver {
    public static void main(String[] args) {
        System.setProperty("edgeDriver","src/resources/drivers/msedgedriver.exe");

        //System.setProperty java uygulamarinda sistem özelliklerini ayarlamak icin kullanilir.
        //Bu method ile class'imiza webdriver'in fiziki yerini belirtiriz
        //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz.

        System.out.println(System.getProperty("edgeDriver"));
        //getProperty methodu ile "key degerini" girerek "value"ya ulasabilirim

//        WebDriver driver = new EdgeDriver();    //Bos bir browser acar
//        driver.get("https://www.techproeducation.com");//get() methodu ile adresini belirttigimiz sayfaya gideriz
//        System.out.println("Sayfanin basligi = " + driver.getTitle());  //Icinde bulundugumuz sayfanin basligini getirir
//        System.out.println("Sayfa Url'i = " + driver.getCurrentUrl());     //Icinde bulundugumuz sayfanin url'i getirir
        //System.out.println(driver.getPageSource()); //Icinde bulundugumuz sayfanin html kodlarini getirir

    }
}
