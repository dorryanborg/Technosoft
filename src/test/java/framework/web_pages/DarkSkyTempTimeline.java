package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DarkSkyTempTimeline extends BasePage {



    public void VerifyTempTimeline(){

        DateFormat dateFormat = new SimpleDateFormat("h");
        Date today = Calendar.getInstance().getTime();
        String date = dateFormat.format(today);

        List<WebElement> hours = SharedSD.getDriver().findElements(By.xpath("//div[@id='timeline']//div[@class='hours']//following::span[@class='hour']/span[2]"));
             for (WebElement ele:hours) {
           String newHour =  ele.getText().replaceAll("[^\\w\\s]","");
           int newHours = Integer.parseInt(newHour);


        }


        }
        }


