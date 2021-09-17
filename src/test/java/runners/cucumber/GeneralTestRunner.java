package runners.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import managers.AppiumManager;
import managers.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        plugin = {"pretty"
                , "html:target/General/cucumber-default-html-report.html"
                , "summary"
        }
        , features = {"classpath:features"}
        , glue = {"classpath:step_definitions"}
        , monochrome = true
        , tags = "@SmokeTest"
)

public class GeneralTestRunner extends AbstractTestNGCucumberTests {

//    @BeforeSuite
    @BeforeClass
    public void beforeSuite() throws Exception {

        new AppiumManager().startAppiumServer();
        new DriverManager().initializeDriver();
    }

//    @AfterSuite
    @AfterClass
    public void afterClass(){
        // driver must be stopped first
        DriverManager driverManager = new DriverManager();
        if (driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        // appium server can only be stopped successfully after the driver was stopped
        AppiumManager appiumManager = new AppiumManager();
        if (appiumManager.getAppiumServer() != null){
            appiumManager.getAppiumServer().stop();
            appiumManager.setAppiumServer(null);
        }
    }


}
