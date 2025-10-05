package Day2_HuyenChinh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement clickElement = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
        clickElement.click();
        Thread.sleep(5000);

        WebElement clickTextBox = driver.findElement(By.xpath("//span[text()='Text Box']"));
        clickTextBox.click();
        Thread.sleep(5000);



        WebElement fullname = driver.findElement(By.xpath("//input[@id ='userName']"));
        fullname.sendKeys("Huyền Chinh");
        Thread.sleep(5000);
        WebElement email = driver.findElement(By.xpath("//input[@id ='userEmail']"));
        email.sendKeys("huyenchinh@gmail.com");
        Thread.sleep(5000);
        WebElement currentaddress = driver.findElement(By.xpath("//textarea[@id ='currentAddress']"));
        currentaddress.sendKeys("Hà Nội");
        Thread.sleep(5000);
        WebElement permanentaddress = driver.findElement(By.xpath("//textarea[@id ='permanentAddress']"));
        permanentaddress.sendKeys("Thái Bình");



        WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
        button.click();
        Thread.sleep(5000);


        driver.close();
    }

}
