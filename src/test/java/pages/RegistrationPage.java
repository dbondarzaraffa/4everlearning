package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends BaseUtil {

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }




    @FindBy(how = How.NAME, using = "name")
    public WebElement nameField;

    @FindBy(how = How.NAME, using = "username")
    public WebElement userNameField;

    @FindBy(how = How.NAME, using = "password")
    public WebElement passwordField;

    @FindBy(how = How.NAME, using = "subdomain")
    public WebElement subdomainField;

    @FindBy(how = How.NAME, using = "email")
    public WebElement emailField;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement registerButton;








    public void login(String userName, String passWord) {
//        CharSequence uN = new String(userName);
        userNameField.sendKeys(userName);
        passwordField.sendKeys(passWord);
//        subdomainField.sendKeys(subdomain);
//        emailField.sendKeys(email);
    }

    public void clickSignInButton() {
        registerButton.click();
    }


}
