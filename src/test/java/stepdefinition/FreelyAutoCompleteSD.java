package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.FreelyAutoComplete;
import org.testng.Assert;

public class FreelyAutoCompleteSD {
    private FreelyAutoComplete autoComplete = new FreelyAutoComplete();
    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Threely Starter Template","Invalid Homepage");
    }

    @When("^I search on top search bar with text \"([^\"]*)\"$")
    public void i_search_on_top_search_bar_with_text(String arg1) throws Throwable {
        autoComplete.enterTopSearch();
    }

    @Then("^I verify \"([^\"]*)\" as displayed result$")
    public void i_verify_as_displayed_result(String arg1) throws Throwable {
        autoComplete.searchResultDisplay();
    }

}
