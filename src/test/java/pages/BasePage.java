package pages;

import io.appium.java_client.android.AndroidDriver;
import managers.DriverManager;

public class BasePage {
    private final AndroidDriver<?> driver;

    public BasePage() {
        this.driver = new DriverManager().getDriver();
    }
}
