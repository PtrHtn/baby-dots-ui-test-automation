package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import managers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private final AndroidDriver<?> driver;
    private static final long WAIT_TIME = 30;

    public BasePage() {
        this.driver = new DriverManager().getDriver();
    }

    private void waitForVisibilityOf(MobileElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
            wait.until(ExpectedConditions.visibilityOf(element));
        }catch (Exception exception) {
            System.out.println("Something went wrong in waitForVisibilityOf method: " + exception);
        }
    }

    private void waitForVisibilityOf(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }catch (Exception exception) {
            System.out.println("Something went wrong in waitForVisibilityOf method: " + exception);
        }
    }

    private String getAttributeOf(MobileElement element, String attribute) {
        waitForVisibilityOf(element);
        return element.getAttribute(attribute);
    }

    private String getAttributeOf(By locator, String attribute) {
        waitForVisibilityOf(locator);
        return driver.findElement(locator).getAttribute(attribute);
    }

    protected boolean isDisplayed(By parentLocator, By childLocator, int nthChildLocator){
        MobileElement element = (MobileElement) driver.findElement(parentLocator).findElements(childLocator).get(nthChildLocator);
        waitForVisibilityOf(element);
        return Boolean.parseBoolean(getAttributeOf(element, "displayed"));
    }

}
