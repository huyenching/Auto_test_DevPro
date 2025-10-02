import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");
        Thread.sleep(5000);
        WebElement moved = driver.findElement(By.xpath("//a[text()='Moved']"));
        moved.click();
        Thread.sleep(5000);

        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();
        Thread.sleep(5000);


        WebElement homeemvt4 = driver.findElement(By.xpath("//a[text()='Home']/parent::p//following-sibling::p/a[text()='Home' and 'EmVt4']"));
        homeemvt4.click();
        Thread.sleep(5000);




        driver.close();
    }
}
