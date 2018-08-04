package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class FreelyLogin extends BasePage {


    private By emailTextField = By.id("email");
    private By passwordTextField = By.id("password");
    private By submitBtn = By.xpath("//button[contains(text(),'Submit')]");
    private By avatarLink = By.xpath("//img[@class='img-circle']");
    private By logOut = By.xpath("//a[contains(text(),'Logout')]");

    public void enterEmail(){
        sendText(emailTextField,"n12345@test.com");
    }

    public void enterPassword(){
        sendText(passwordTextField,"123456");
    }

    public void clickOnSubmit(){
        clickOn(submitBtn);
    }

    public void clickOnAvatar(){
        actionMoveAndClick(avatarLink);
    }

    public void logOutLinkIsDisplayed(){
        elementIsDisplayed(logOut);
    }
}
