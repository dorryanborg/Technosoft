package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DarkSkyTimeMachine extends BasePage {

    private By timeMachineButton= By.xpath("//a[contains(text(),'Time Machine')]");



    public void ClickOnTimeMachine(){
        clickOn(timeMachineButton);
    }

    public void VerifyTodayDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd");
        Date today = Calendar.getInstance().getTime();
        String date = dateFormat.format(today);

        WebElement todayDate= SharedSD.getDriver().findElement(By.xpath("//td[@class='is-today']"));
        if (date.equals(todayDate)){
            Assert.assertTrue(true);
        }


        }
    }

