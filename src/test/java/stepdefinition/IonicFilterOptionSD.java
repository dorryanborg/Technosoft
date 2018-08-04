package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobile_pages.IonicFilterOption;
import framework.mobile_pages.IonicMainMenu;

public class IonicFilterOptionSD {
    IonicMainMenu menu = new IonicMainMenu();
    IonicFilterOption filter = new IonicFilterOption();
    @Given("^I am on a home page of the app$")
    public void i_am_on_a_home_page_of_the_app() throws Throwable {
        menu.TapOnSkipButton();
        menu.VerifyHomepage();

    }

    @When("^I click on filter button$")
    public void i_click_on_filter_button() throws Throwable {
        filter.TapOnFilterOptionBtn();

    }

    @And("^I disable \"([^\"]*)\" option$")
    public void i_disable_option(String arg1) throws Throwable {
        filter.TapOnAngularOption();
    }

    @And("^I click on All Reset Filer button$")
    public void i_click_on_All_Reset_Filer_button() throws Throwable {
        filter.TapOnResetFilterBtn();
    }

    @Then("^I verify all options are enabled$")
    public void i_verify_all_options_are_enabled() throws Throwable {
        filter.VerifyAllOptionsEnabled();
    }

}
