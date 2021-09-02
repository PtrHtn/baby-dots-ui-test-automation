package managers;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class DesiredCapsManager {

    public DesiredCapabilities getDesiredCapabilities() throws IOException {

        String appPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "apks" + File.separator + "babydots-v1.5.1-debug.apk";
        DeviceCapsManager deviceCapsManager = new DeviceCapsManager();
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.APP, appPath);
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, deviceCapsManager.getUDID());

        return desiredCapabilities;
    }

}
