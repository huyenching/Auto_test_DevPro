package Day3_HuyenChinh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class bai4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement clickAlertsAndFrame = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]"));
        clickAlertsAndFrame.click();
        Thread.sleep(3000);

        WebElement clickBrowserWindows = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        clickBrowserWindows.click();
        Thread.sleep(3000);

        String mainWindow = driver.getWindowHandle();


        WebElement clickNewTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
        clickNewTab.click();
        Thread.sleep(2000);

        // Lấy tất cả các tab hiện có
        Set<String> allWindows = driver.getWindowHandles();

        // Chuyển sang tab mới
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        WebElement sampleText = driver.findElement(By.id("sampleHeading"));
        System.out.println("Nội dung trong tab mới là: " + sampleText.getText());
        Thread.sleep(2000);

        driver.close();

        driver.switchTo().window(mainWindow);
        System.out.println("Tiêu đề trang chính là: " + driver.getTitle());

        Thread.sleep(2000);
        driver.quit();
    }
}
