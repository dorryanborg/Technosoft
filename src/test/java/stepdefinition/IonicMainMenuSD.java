package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobile_pages.IonicMainMenu;

public class IonicMainMenuSD {
    IonicMainMenu menu = new IonicMainMenu();
    @Given("^I am on home page of the app$")
    public void i_am_on_home_page_of_the_app() throws Throwable {
        menu.TapOnSkipButton();
        menu.VerifyHomepage();
    }

    @When("^I click on hamburger menu$")
    public void i_click_on_hamburger_menu() throws Throwable {

        menu.TapOnHamburgerMenu();
    }

    @Then("^I verify default main menu bar fields$")
    public void i_verify_default_main_menu_bar_fields() throws Throwable {
        menu.VerifyScheduleLink();
        menu.VerifySpeakersLink();
        menu.VerifyMapsLink();
        menu.VerifyAboutLink();
        menu.VerifyLoginLink();
        menu.VerifySupportLink();
        menu.VerifySignUpLink();
    }
}
