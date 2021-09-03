package managers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

public class DriverManager {
    private AndroidDriver driver = null;


    public AndroidDriver getDriver() {
        return driver;
    }

    public void setDriver(AndroidDriver androidDriver) {
        driver = androidDriver;
    }

    public void initializeDriver() throws IOException {
        URL url = new AppiumManager().getAppiumServer().getUrl();
        DesiredCapabilities desiredCapabilities = new DesiredCapsManager().getDesiredCapabilities();
        driver = new AndroidDriver(url, desiredCapabilities);
    }
}
