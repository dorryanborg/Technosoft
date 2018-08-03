package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.List;

public class FreelyHomepage extends BasePage {
    private By SignInButton = By.xpath("//a[contains(text(),'Sign In')]");
    private By SignUpButton = By.xpath("//a[contains(text(),'Join')]");
    private By posts = By.xpath("//*[@class='gig-card']");
    private By postPriceTag = By.xpath("//*[@class='gig-card']/h3");
    private By postTitle = By.xpath("//*[@class='gig-card']/h4");
    private By postImage = By.xpath("//*[@class='gig-card']//img");



    public void clickOnSignInButton(){
        clickOn(SignInButton);
    }

    public void clickOnSignUpButton(){
        clickOn(SignUpButton);
    }

    public int TotalPost() {


        List<WebElement> list = SharedSD.getDriver().findElements(posts);
        int postSize= list.size();
        return postSize;
    }

    public void VefifyPosts(int expectedNum) {
        Assert.assertEquals(TotalPost(), expectedNum);
    }


    public void PostPriceTag(){
        List<WebElement> list = SharedSD.getDriver().findElements(postPriceTag);
        for (WebElement element:list) {

            Assert.assertTrue(element.getText().startsWith("$"));

            }

    }

    public void PostTitle(){
        List<WebElement> list = SharedSD.getDriver().findElements(postTitle);
        for (WebElement element:list) {

            String str = element.getText();
            Assert.assertTrue(str.matches("^[a-z]+$"));


        }

    }

    public void PostImage(){
        List<WebElement> list = SharedSD.getDriver().findElements(postImage);
        for (WebElement element:list) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

}


