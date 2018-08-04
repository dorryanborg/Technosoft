package framework.mobile_pages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class IonicSearchEvent extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Search']")
    private MobileElement search;

    @AndroidFindBy(xpath = "(//android.widget.Button)[9]")
    private MobileElement displayedEvent;








    public void enterTextIntoSearch(){
        search.sendKeys("Breakfast");
    }

    public void VerifyDisplayedEvent(){
        Assert.assertTrue(displayedEvent.isDisplayed());
    }

}
