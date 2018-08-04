package framework.mobile_pages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class IonicFilterOption extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc = 'options ']")
    private MobileElement filterOption;

    @AndroidFindBy(xpath = "(//android.view.View)[7]")
    private MobileElement angularOption;

    @AndroidFindBy(xpath = "(//android.view.View)[10]")
    private MobileElement communicationOption;

    @AndroidFindBy(xpath = "(//android.view.View)[13]")
    private MobileElement designOption;

    @AndroidFindBy(xpath = "(//android.view.View)[16]")
    private MobileElement documentationOption;

    @AndroidFindBy(xpath = "(//android.view.View)[19]")
    private MobileElement foodOption;

    @AndroidFindBy(xpath = "(//android.view.View)[22]")
    private MobileElement ionicOption;

    @AndroidFindBy(xpath = "(//android.view.View)[25]")
    private MobileElement navigationOption;

    @AndroidFindBy(xpath = "(//android.view.View)[28]")
    private MobileElement servicesOption;

    @AndroidFindBy(xpath = "(//android.view.View)[31]")
    private MobileElement toolingOption;

    @AndroidFindBy(xpath = "(//android.view.View)[34]")
    private MobileElement workshopOption;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Reset All Filters ']")
    private MobileElement resetFilterBtn;




    public void TapOnFilterOptionBtn(){
        tapOn(filterOption);
    }

    public void TapOnAngularOption(){
        tapOn(angularOption);
    }

    public void TapOnResetFilterBtn(){
        tapOn(resetFilterBtn);
    }

    public void VerifyAllOptionsEnabled(){
        Assert.assertTrue(communicationOption.isEnabled());
        Assert.assertTrue(designOption.isEnabled());
        Assert.assertTrue(documentationOption.isEnabled());
        Assert.assertTrue(foodOption.isEnabled());
        Assert.assertTrue(ionicOption.isEnabled());
        Assert.assertTrue(navigationOption.isEnabled());
        Assert.assertTrue(servicesOption.isEnabled());
        Assert.assertTrue(toolingOption.isEnabled());
        Assert.assertTrue(workshopOption.isEnabled());
    }

}
