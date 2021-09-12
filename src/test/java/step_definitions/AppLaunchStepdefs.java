package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;

public class AppLaunchStepdefs {
    @Given("an app is at the Baby Dots home screen")
    public void anAppIsAtTheBabyDotsHomeScreen() {
        Assert.assertTrue(new HomePage().appBar().titleIsDisplayed());
    }

    @Then("title {title} is shown on the screen")
    public void titleIsShownOnTheScreen(String title) {
        Assert.assertEquals(new HomePage().appBar().getTitle(), title);
    }
}
