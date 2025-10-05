package Day2_HuyenChinh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai6 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement rowCierra = driver.findElement(By.xpath("//div[text()='Cierra']/following-sibling::div[3]"));
        System.out.println("Email của Cierra la: "+ rowCierra.getText());

        WebElement rowEdit = driver.findElement(By.xpath("//div[text()='Alden']/ancestor::div[@role='row']//span[@title='Edit']"));
        rowEdit.click();
        Thread.sleep(5000);

        driver.close();
    }
}
