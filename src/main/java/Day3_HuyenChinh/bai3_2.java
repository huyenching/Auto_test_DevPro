package Day3_HuyenChinh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai3_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement clickAlertsandframe = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]"));
        clickAlertsandframe.click();
        Thread.sleep(5000);
// lỗi k click vào frams được
        WebElement clickframes = driver.findElement(By.xpath("//span[text()='Frames']"));
        clickframes.click();
        Thread.sleep(5000);

        driver.quit();
    }
}
