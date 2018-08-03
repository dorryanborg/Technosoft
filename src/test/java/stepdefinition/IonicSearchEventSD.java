package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobile_pages.IonicMainMenu;
import framework.mobile_pages.IonicSearchEvent;

public class IonicSearchEventSD {
    IonicMainMenu menu = new IonicMainMenu();
    IonicSearchEvent event = new IonicSearchEvent();
    @Given("^I am on homepage of the app$")
    public void i_am_on_homepage_of_the_app() throws Throwable {
        menu.TapOnSkipButton();
        menu.VerifyHomepage();
    }

    @When("^Search for \"([^\"]*)\"$")
    public void search_for(String arg1) throws Throwable {
        event.enterTextIntoSearch();
    }

    @Then("^I verify Event displayed with header, Duration, description$")
    public void i_verify_Event_displayed_with_header_Duration_description() throws Throwable {
        event.VerifyDisplayedEvent();
    }
}
