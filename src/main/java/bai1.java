import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
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
        Thread.sleep(5000);
        WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));

        driver.close();
    }

}
