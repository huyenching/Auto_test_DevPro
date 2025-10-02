import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class bai4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement clickhome = driver.findElement(By.xpath("//span[text()='Home']/ancestor::label//span[@class='rct-checkbox']"));
        clickhome.click();
        Thread.sleep(5000);

        WebElement checkboxdownloads = driver.findElement(By.xpath("//span[text()='Downloads']/parent::label//span[@class='rct-checkbox']"));
        checkboxdownloads.click();
        Thread.sleep(5000);
        driver.close();
    }
}
