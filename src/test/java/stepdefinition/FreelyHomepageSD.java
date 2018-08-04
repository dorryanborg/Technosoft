package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.web_pages.FreelyHomepage;
import org.testng.Assert;

public class FreelyHomepageSD {

    FreelyHomepage freelyHomepage=new FreelyHomepage();

    @Given("^I am on home page of Threely$")
    public void i_am_on_home_page_of_Threely() throws Throwable {
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Threely Starter Template","Invalid Homepage");
    }

    @Then("^I verify (.+) total post is displayed$")
    public void i_verify_total_post_is_displayed(int num) throws Throwable {
        freelyHomepage.VefifyPosts(67);



    }
    @And("^I verify all post has price tag$")
    public void i_verify_all_post_has_price_tag() throws Throwable {
        freelyHomepage.PostPriceTag();

    }

    @And("^I verify all post has title$")
    public void i_verify_all_post_has_title() throws Throwable {
        freelyHomepage.PostTitle();

    }

    @And("^I verify all post has displayed image$")
    public void i_verify_all_post_has_displayed_image() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
