package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import stepdefinition.SharedSD;

public class FreelyAutoComplete extends BasePage {
    private By topSearchBar = By.xpath("//input[@id='aa-search-input']");
    private By searchResult = By.xpath("//*[@class='aa-dataset-1']");

    public void enterTopSearch(){

        sendText(topSearchBar,"ios");

    }

    public void searchResultDisplay(){
        waitForElement(searchResult);
        boolean searchResults = SharedSD.getDriver().findElement(searchResult).isDisplayed();
        Assert.assertTrue(searchResults);

    }
}

// //*[@class='aa-dataset-1']
