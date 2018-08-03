package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;

public class FreelyInvalidRegistration extends BasePage {
    private By nameTextField = By.name("username");
    private By emailTextField = By.name("email");
    private By pwdTextField = By.name("password");
    private By submitBtn = By.xpath("//button[contains(text(),'Submit')]");


    public void enterName(String arg1){

        sendText(nameTextField, arg1);
    }

    public void enterEmail(String arg2){
        sendText(emailTextField,arg2);


    }

    public void enterPwd(String arg3){
        sendText(pwdTextField,arg3);
    }

    public void clickonSubmit(){
        clickOn(submitBtn);
    }

}
