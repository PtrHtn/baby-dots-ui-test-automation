package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class AppLaunchStepdefs {
    @When("an app is at the Baby Dots home screen")
    public void anAppIsAtTheBabyDotsHomeScreen() {
        Assert.assertTrue(new HomePage().appBar().titleIsDisplayed());
        Assert.assertTrue(new HomePage().appBar().soundIconIsDisplayed());
        Assert.assertTrue(new HomePage().appBar().lockIconIsDisplayed());
        Assert.assertTrue(new HomePage().appBar().moreOptionsMenuIconIsDisplayed());
        Assert.assertTrue(new HomePage().babyDotsViewIsDisplayed());
        Assert.assertTrue(new HomePage().fabIsDisplayed());
    }

    @Then("title {string} is shown on the screen")
    public void titleIsShownOnTheScreen(String title) {
        Assert.assertEquals(new HomePage().appBar().getTitle(), title);
    }
}
