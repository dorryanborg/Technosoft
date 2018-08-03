package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.DarkSkyTimeMachine;
import org.testng.Assert;

public class DarkSkyTimeMachineSD {
    DarkSkyTimeMachine timeMachine = new DarkSkyTimeMachine();
    @Given("^I am on  Darksky home page$")
    public void i_am_on_Darksky_home_page() throws Throwable {
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Dark Sky - 260 Broadway, New York City, NY","Invalid website");
    }

    @When("^I click on Time Machine$")
    public void i_click_on_Time_Machine() throws Throwable {

        timeMachine.ClickOnTimeMachine();
    }

    @Then("^I verify date is selected to todays date$")
    public void i_verify_date_is_selected_to_todays_date() throws Throwable {
        timeMachine.VerifyTodayDate();
    }

}
