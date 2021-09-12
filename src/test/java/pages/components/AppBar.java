package pages.components;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import pages.BasePage;

public class AppBar extends BasePage {

    private final By toolbarLocator = MobileBy.id("toolbar");
    private final By titleLocator = MobileBy.className("android.widget.TextView");

    public boolean titleIsDisplayed(){
        return isDisplayed(toolbarLocator, titleLocator, 0);
    }

    public String getTitle() {
        return getTextOf(toolbarLocator, titleLocator, 0);
    }

}
