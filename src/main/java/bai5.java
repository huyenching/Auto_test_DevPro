import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class bai5 {
    public static void main(String args[]) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        Thread.sleep(5000);


        driver.close();

    }
}
