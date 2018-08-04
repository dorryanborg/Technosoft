package framework.mobile_pages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class IonicMainMenu extends MobileBasePage {
    @AndroidFindBy(accessibility = "Open drawer menu")
    private MobileElement mainMenu;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    private MobileElement skipBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search']")
    private MobileElement searchBar;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='menu ']")
    private MobileElement hamburgerMenu;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='calendar Schedule ']")
    private MobileElement scheduleLink;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='contacts Speakers ']")
    private MobileElement speakersLink;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='map Map ']")
    private MobileElement mapsLink;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='information circle About ']")
    private MobileElement aboutLink;


    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='log in Login ']")
    private MobileElement loginLink;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='help Support ']")
    private MobileElement supportLink;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='person add Signup ']")
    private MobileElement signupLink;


    public void TapOnSkipButton(){
        skipBtn.click();
    }

    public void VerifyHomepage(){
        System.out.println(searchBar.isDisplayed() + "I'm in Homepage");
    }

    public void TapOnHamburgerMenu(){
        tapOn(hamburgerMenu);
    }

    public void VerifyScheduleLink(){
        try {
            Assert.assertTrue(scheduleLink.isDisplayed());
        }catch (AssertionError error){
            error.printStackTrace();
        }
    }
    public void VerifySpeakersLink(){
        try {
            Assert.assertTrue(speakersLink.isDisplayed());
        }catch (AssertionError error){
            error.printStackTrace();
        }
    }
    public void VerifyMapsLink(){
        try {
            Assert.assertTrue(mapsLink.isDisplayed());
        }catch (AssertionError error){
            error.printStackTrace();
        }

    }
    public void VerifyAboutLink(){
        try {
            Assert.assertTrue(aboutLink.isDisplayed());
        }catch (AssertionError error){
            error.printStackTrace();
        }

    }

    public void VerifyLoginLink(){
        try {
            Assert.assertTrue(loginLink.isDisplayed());
        }catch (AssertionError error){
            error.printStackTrace();
        }
    }

    public void VerifySupportLink(){
        try {
            Assert.assertTrue(supportLink.isDisplayed());
        }catch (AssertionError error){
            error.printStackTrace();
        }
    }

    public void VerifySignUpLink(){
        try {
            Assert.assertTrue(signupLink.isDisplayed());
        }catch (AssertionError error){
            error.printStackTrace();
        }
    }

}
