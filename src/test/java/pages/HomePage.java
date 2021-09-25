package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import pages.components.AppBar;

public class HomePage extends BasePage{
    public HomePage() {
        appBar = new AppBar();
    }

    private AppBar appBar;

    private final By babyDotsWindowLocator = MobileBy.id("dots");

    public AppBar appBar() {
        return appBar;
    }
}
