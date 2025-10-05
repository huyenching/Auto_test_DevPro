package Day3_HuyenChinh.Bai5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);

//        WebElement clickAlertsAndFrame = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[6]"));
//        clickAlertsAndFrame.click();
//        Thread.sleep(3000);
//
//        WebElement clicklogin = driver.findElement(By.xpath("//li[@class='btn btn-light active']"));
//        clicklogin.click();
//        Thread.sleep(3000);

        LoginPage loginPage = new LoginPage(driver);
        String username = "HuyenChinh";
        String password = "@Huyenchinh2607";

        loginPage.login(username, password);
        Thread.sleep(5000);
        String result = loginPage.getWelcomeText();
        System.out.println("Kết quả đăng nhập là:  "+ result);
        System.out.println("Tiêu đề sau login la: "+ driver.getTitle());
        Thread.sleep(3000);
        driver.quit();

    }
}
