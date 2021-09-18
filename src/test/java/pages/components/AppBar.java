package pages.components;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import pages.BasePage;

public class AppBar extends BasePage {

    private final By toolbarLocator = MobileBy.id("toolbar");
    private final By appTitleLocator = MobileBy.className("android.widget.TextView");
    private final By soundIconLocator = MobileBy.id("menu_sound");
    private final By lockIconLocator = MobileBy.id("menu_lock");


    public boolean titleIsDisplayed(){
        return isDisplayed(toolbarLocator, appTitleLocator, 0);
    }


    public String getTitle() {
        return getTextOf(toolbarLocator, appTitleLocator, 0);
    }
    public boolean soundIconIsDisplayed(){
        return isDisplayed(soundIconLocator);
    }


}
