package framework.mobile_pages;

import framework.MobileBasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;



public class IonicSplashScreen extends MobileBasePage {
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    private MobileElement splashScreen;

    public void VerifySplashScreen(){
        Assert.assertTrue(splashScreen.isDisplayed());
    }


    //new TouchAction(driver).press(startx, starty).waitAction(duration).moveTo(endx, endy).release().perform();

    public void SwipeScreen(int startx, int starty, int endx, int endy){






    }
}
