package Day3_HuyenChinh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class bai2_2 {
    public static void main(String args[]) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement clickElement = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
        clickElement.click();
        Thread.sleep(5000);

        WebElement clickradiobutton = driver.findElement(By.xpath("(//li[@class='btn btn-light '])[3]"));
        clickradiobutton.click();
        Thread.sleep(5000);

        WebElement radioimpressive = driver.findElement(By.xpath("//label[text()='Impressive']/ancestor::div//label[@for='impressiveRadio']"));
        radioimpressive.click();
        Thread.sleep(5000);

        WebElement radioYes2 = driver.findElement(By.xpath(" //input[@id='yesRadio']/following-sibling::label[@for='yesRadio']"));
        radioYes2.click();
        Thread.sleep(5000);

        driver.close();

    }
}
