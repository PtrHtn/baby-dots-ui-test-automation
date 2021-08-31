package managers;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

public class AppiumManager {

    private static AppiumDriverLocalService appiumServer = null;


    public AppiumDriverLocalService getAppiumServer() {
        return appiumServer;
    }

    public void setAppiumServer(AppiumDriverLocalService appiumServer2) {
        appiumServer = appiumServer2;
    }

    public void startAppiumServer() {

        AppiumDriverLocalService appiumDriverLocalService = AppiumDriverLocalService.buildDefaultService();
        appiumDriverLocalService.start();

        if (!appiumDriverLocalService.isRunning()) {
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server didn't start. ABORT!!!");
        }
        appiumDriverLocalService.clearOutPutStreams();
        setAppiumServer(appiumDriverLocalService);
    }

}
