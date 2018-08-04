package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.FreelyHomepage;
import framework.web_pages.FreelyInvalidRegistration;

public class FreelyInvalidRegistrationSD {
    FreelyHomepage homepage = new FreelyHomepage();
    FreelyInvalidRegistration invalidRegistration = new FreelyInvalidRegistration();
    @Given("^I am on the Registration page$")
    public void i_am_on_the_Registration_page() throws Throwable {
        homepage.clickOnSignUpButton();
    }

    @When("^I enter name as user email as \"([^\"]*)\" password as password$")
    public void i_enter_name_as_user_email_as_password_as_password(String arg1) throws Throwable {
        invalidRegistration.enterName("user");
        invalidRegistration.enterEmail("test.com");
        invalidRegistration.enterPwd("password");

    }

    @And("^I click on the submit button$")
    public void i_click_on_the_submit_button() throws Throwable {
        invalidRegistration.clickonSubmit();
    }

    @Then("^I verify invalid email address$")
    public void i_verify_invalid_email_address() throws Throwable {

    }




}
