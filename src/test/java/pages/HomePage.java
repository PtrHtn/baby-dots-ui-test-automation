package pages;

import pages.components.AppBar;

public class HomePage extends BasePage{
    private AppBar appBar;

    public HomePage() {
        appBar = new AppBar();
    }

    public AppBar appBar() {
        return appBar;
    }
}
