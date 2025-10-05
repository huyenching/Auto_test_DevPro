package Day3_HuyenChinh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class bai2_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement clickElement = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
        clickElement.click();
        Thread.sleep(5000);

        WebElement clickcheckBox = driver.findElement(By.xpath("(//li[@class='btn btn-light '])[2]"));
        clickcheckBox.click();
        Thread.sleep(5000);

        WebElement clicktogglehome = driver.findElement(By.xpath("//button[@title='Toggle']"));
        clicktogglehome.click();
        Thread.sleep(5000);

        //span[text()='Desktop']/ancestor::span/button[@title='Toggle']

        WebElement clciktoggledesktop = driver.findElement(By.xpath("//span[text()='Desktop']/ancestor::span/button[@title='Toggle']"));
        clciktoggledesktop.click();
        Thread.sleep(5000);
        WebElement clickcommand = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[4]"));
        clickcommand.click();
        Thread.sleep(5000);

        driver.close();
    }
}
