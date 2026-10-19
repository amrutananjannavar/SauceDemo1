package util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	
    private final WebDriverWait wait;

    public WaitUtil(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Username wait
    public WebElement waitForUsername(By locator) {
        return wait.until(
            ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Password wait
    public WebElement waitForPassword(By locator) {
        return wait.until(
            ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Login button wait
    public WebElement waitForLoginButton(By locator) {
        return wait.until(
            ExpectedConditions.elementToBeClickable(locator));
    }

    // Dashboard wait
    public WebElement waitForDashboard(By locator) {
        return wait.until(
            ExpectedConditions.visibilityOfElementLocated(locator));
    }
}



