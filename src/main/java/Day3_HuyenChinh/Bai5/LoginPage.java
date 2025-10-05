package Day3_HuyenChinh.Bai5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By usernameField = By.id("userName");
    By passwordField = By.id("password");
    By loginButton   = By.id("login");
    By welcomeText   = By.id("userName-value");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void login(String username, String password) throws InterruptedException {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        Thread.sleep(5000);

    }
    public String getWelcomeText() {
        return driver.findElement(welcomeText).getText();

    }

}
