package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import pages.components.AppBar;

public class HomePage extends BasePage{
    public HomePage() {
        appBar = new AppBar();
    }

    private AppBar appBar;
    private final By babyDotsViewLocator = MobileBy.id("dots");
    private final By fabLocator = MobileBy.id("sd_main_fab");

    public AppBar appBar() {
        return appBar;
    }
    public boolean babyDotsViewIsDisplayed(){
        return isDisplayed(babyDotsViewLocator);
    }

}
