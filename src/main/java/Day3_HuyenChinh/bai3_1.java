package Day3_HuyenChinh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class bai3_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement clickAlertsandframe = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]"));
        clickAlertsandframe.click();
        Thread.sleep(5000);

        WebElement clickalters = driver.findElement(By.xpath("//span[text()='Alerts']"));
        clickalters.click();
        Thread.sleep(5000);

        WebElement clickbuttonseealter = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickbuttonseealter.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert thường: " + alert.getText());
        alert.accept();

//        WebElement clickbuttonwait = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//        clickbuttonwait.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        alert = driver.switchTo().alert();
//        System.out.println("Alert sau 5s: " + alert.getText());
//        alert.accept();



        driver.close();

    }
}
