package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public static final By USERNAME_INPUT = By.xpath("//*[@data-test='username']");
    public static final By PASSWORD_INPUT = By.xpath("//*[@data-test='password']");

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    @Override
    void waitForPageOpened() {

    }

    /**
     * Login to the site
     * @param username
     * @param password
     */
    public ProductsPage login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        return new ProductsPage(driver);
    }

    /**
     * Open login page
     */
    public LoginPage openPage() {
        openPage(SAUCE_DEMO_URL);
        return this;
    }
}
