package pages;



import base.BaseUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class LoginPage extends BaseUtil{

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }


    @FindBy(how = How.NAME, using = "username")
    public WebElement userNameField;

    @FindBy(how = How.NAME, using = "password")
    public WebElement passwordField;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement signInButton;




    public void login(String userName, String passWord) {
//        CharSequence uN = new String(userName);
        userNameField.sendKeys(userName);
        passwordField.sendKeys(passWord);
    }

    public void clickSignInButton() {
        signInButton.click();
    }



}