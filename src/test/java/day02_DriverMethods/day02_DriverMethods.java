package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class day02_DriverMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("edgeDriver", "src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        System.out.println("Sayfa konumu:  " + driver.manage().window().getPosition());
        System.out.println("Sayfa boyutu: "+driver.manage().window().getSize());


        driver.manage().window().maximize();    //Acilan browser'i maximize yapar
        driver.get("https://techproeducation.com");
        System.out.println("Sayfa konumu:  " + driver.manage().window().getPosition());
        System.out.println("Sayfa boyutu: "+driver.manage().window().getSize());

        driver.manage().window().minimize();    //Sayfayi asagiya indirecek
        Thread.sleep(3000);

        driver.manage().window().fullscreen();  //Tam ekran yapar
        System.out.println("Sayfa konumu:  " + driver.manage().window().getPosition());
        System.out.println("Sayfa boyutu: "+driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(50,50)); //Istediginiz konuma getirir

        driver.manage().window().setSize(new Dimension(600,600));   //Istediginiz size'a getirir
        driver.close();
    }
}
