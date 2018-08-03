package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.DarkSkyIndividualTemp;
import org.testng.Assert;

public class DarkSkyIndividualTempSD {
    DarkSkyIndividualTemp individualTemp = new DarkSkyIndividualTemp();

    @Given("^I am on the Darksky Home Page$")
    public void i_am_on_the_Darksky_Home_Page() throws Throwable {
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Dark Sky - 260 Broadway, New York City, NY","Invalid website");
    }

    @When("^I expand todays timeline$")
    public void i_expand_todays_timeline() throws Throwable {
        individualTemp.ExpandTodayTimeline();
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void i_verify_lowest_and_highest_temp_is_displayed_correctly() throws Throwable {
        individualTemp.VerifyLowHighTemp();
    }
}
