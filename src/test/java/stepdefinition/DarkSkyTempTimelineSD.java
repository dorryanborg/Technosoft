package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.web_pages.DarkSkyTempTimeline;
import org.testng.Assert;

public class DarkSkyTempTimelineSD {
    DarkSkyTempTimeline tempTimeline = new DarkSkyTempTimeline();
    @Given("^I am on Darksky home page$")
    public void i_am_on_Darksky_home_page() throws Throwable {
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Dark Sky - 260 Broadway, New York City, NY","Invalid website");
    }

    @Then("^I verify timeline is displayed with two hours incremented$")
    public void i_verify_timeline_is_displayed_with_two_hours_incremented() throws Throwable {
        tempTimeline.VerifyTempTimeline();

    }

}
