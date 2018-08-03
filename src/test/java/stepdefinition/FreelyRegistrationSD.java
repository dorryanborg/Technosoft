package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.FreelyHomepage;
import framework.web_pages.FreelyLogin;
import framework.web_pages.FreelyRegistration;

public class FreelyRegistrationSD {
     FreelyHomepage homepage = new FreelyHomepage();
     FreelyRegistration registration = new FreelyRegistration();
     FreelyLogin freelyLogin = new FreelyLogin();

    @Given("^I am on Registration page$")
    public void i_am_on_Registration_page() throws Throwable {
        homepage.clickOnSignUpButton();

    }

    @When("^I enter name as \"([^\"]*)\" email as \"([^\"]*)\" password as \"([^\"]*)\"$")
    public void i_enter_name_as_email_as_password_as(String arg1,String arg2, String arg3) throws Throwable {
        registration.enterName("testuser");
        registration.enterEmail("test@test.com");
        registration.enterPwd("test12345");


    }

    @And("^I click 'submit' button$")
    public void i_click_submit_button() throws Throwable {
        registration.clickonSubmit();

    }

    @Then("^I am signed-in as a new user$")
    public void i_am_signed_in_as_a_new_user() throws Throwable {
        freelyLogin.clickOnAvatar();
        freelyLogin.logOutLinkIsDisplayed();



    }


}
