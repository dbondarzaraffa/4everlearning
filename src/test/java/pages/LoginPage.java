package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {
/*
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @FindBy(how = How.NAME, using = "username")
    public WebElement fieldUserName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement fieldUserPassword;

//    @FindBy(how = How.XPATH, using = ".//*[@id='root']/div/div[2]/div/form/div[3]/div/button")
    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement btnSignIn;



    public void Login(String userName, String passWord) {
//        CharSequence uN = new String(userName);
        fieldUserName.sendKeys(userName);
        fieldUserPassword.sendKeys(passWord);
    }

    public void ClickSignInButton() {
        btnSignIn.submit();
    }

*/
}