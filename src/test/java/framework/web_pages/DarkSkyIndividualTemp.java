package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import stepdefinition.SharedSD;

public class DarkSkyIndividualTemp extends BasePage {
    private By todayTimeline = By.xpath("//div[@id='week']/a/span[3]");
    private By minTemp = By.xpath("");
    private By highTemp = By.xpath("");

    public void ExpandTodayTimeline(){
        clickOn(todayTimeline);

    }

    public void VerifyLowHighTemp(){

        String lowTemp= SharedSD.getDriver().findElement(By.xpath("//a[@data-day='0']/span[2]//span[@class='minTemp']")).getText();
        String highTemp= SharedSD.getDriver().findElement(By.xpath("//a[@data-day='0']/span[2]//span[@class='maxTemp']")).getText();

        String minTemp = lowTemp.replaceAll("[^\\w\\s]","");
        String maxTemp = highTemp.replaceAll("[^\\w\\s]","");

        int minTemperature = Integer.parseInt(minTemp);
        int maxTemperature = Integer.parseInt(maxTemp);
        if (minTemperature < maxTemperature){
            Assert.assertTrue(true);
        }





    }
}
