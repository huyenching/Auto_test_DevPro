import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get(" https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement buttondoubleclick = driver.findElement(By.xpath(" //button[@id='doubleClickBtn']"));
        buttondoubleclick.click();
        Thread.sleep(5000);

        WebElement buttonRightclick = driver.findElement(By.xpath(" //button[@id='rightClickBtn']"));
        buttonRightclick.click();
        Thread.sleep(5000);

        WebElement buttonclickme = driver.findElement(By.xpath(" //button[text()='Right Click Me']/parent::div//following-sibling::div/button[text()='Click Me']"));
        buttonclickme.click();
        Thread.sleep(5000);

        driver.close();

    }
}

