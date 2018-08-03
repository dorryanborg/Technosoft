package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.FreelyHomepage;
import framework.web_pages.FreelyLogin;

public class FreelyLoginSD {
    private FreelyHomepage freelyHomepage = new FreelyHomepage();
    private FreelyLogin freelyLogin = new FreelyLogin();
    @Given("^User is on the Threely login page$")
    public void user_is_on_the_Threely_login_page() throws Throwable {
        freelyHomepage.clickOnSignInButton();

    }

    @When("^I enter username as “<user>” and password as “<password>”$")
    public void i_enter_username_as_user_and_password_as_password() throws Throwable {

        freelyLogin.enterEmail();
        freelyLogin.enterPassword();


    }

    @And("^I click on submit button$")
    public void i_click_on_submit_button() throws Throwable {
        freelyLogin.clickOnSubmit();

    }
    @Then("^I verify logout button is displayed$")
    public void i_verify_logout_button_is_displayed() throws Throwable {
        freelyLogin.clickOnAvatar();
        freelyLogin.logOutLinkIsDisplayed();

    }
}
