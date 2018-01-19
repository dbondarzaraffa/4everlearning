package steps;

import base.BaseUtil;
import base.RandomGenerator;

import cucumber.api.PendingException;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil{

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }





    @Given("^I go to the 'Login' page$")
    public void iGoToThePage() throws Throwable {
        base.Driver.navigate().to("http://dashboard.zaraftesta.4everlearning.local.zaraffasoft.com/auth");

        System.out.println("I go to the 'Login' page.");
    }




    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        //Create an ArrayList
        List<User> users = new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        LoginPage page = new LoginPage(base.Driver);

        for (User user: users) {
            page.login(user.username, user.password);
        }

        System.out.println("I enter login and password.");
    }




    @And("^I click the 'Sign In' button$")
    public void iClickTheButton() throws Throwable {
        LoginPage loginPage = new LoginPage(base.Driver);
        loginPage.clickSignInButton();

        System.out.println("I click the 'Sign In' button.");
    }




    @Then("^I should see the 'Avatar' picture$")
    public void iShouldSeeThePicture() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.id("My_account")).isDisplayed(),true);

        System.out.println("I'm logged in and see the 'Avatar' on the upper right corner.");
    }




    @Then("^I should see the 'Incorrect login or password' text on the top of the 'Login' form$")
    public void iShouldSeeTheIncorrectLoginOrPasswordTextOnTheTopOfTheLoginForm() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector(".FormTittle.FormTittle__error")).isDisplayed(),true);
        Assert.assertEquals("Incorrect login or password",base.Driver.findElement(By.cssSelector(".FormTittle.FormTittle__error")).getText());

        System.out.println("I should see the 'Incorrect login or password' text on the top of the 'Login' form.");
    }




    @Then("^I should see the 'The field is required' text on the top of both fields$")
    public void iShouldSeeTheTheFieldIsRequiredTextOnTheTopOfBothFields() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='username'] + .control-label + .input-container__error")).isDisplayed(),true);
        Assert.assertEquals("The field is required",base.Driver.findElement(By.cssSelector("[name='username'] + .control-label + .input-container__error")).getText());

        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='password'] + .control-label + .input-container__error")).isDisplayed(),true);
        Assert.assertEquals("The field is required",base.Driver.findElement(By.cssSelector("[name='password'] + .control-label + .input-container__error")).getText());


        System.out.println("I should see the 'The field is required' text on the top of both fields.");
    }




    @And("^I enter the correct password and user name with SPACE$")
    public void iEnterTheCorrectPasswordAndUserNameWithSPACE(DataTable table) throws Throwable {
        //Create an ArrayList
        List<User> users = new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        LoginPage page = new LoginPage(base.Driver);

        for (User user: users) {
            page.login(user.username, user.password);
        }
        System.out.println("I enter the correct password and user name with SPACE");
    }




    @Then("^I should see the 'Whitespaces are inadmissible' text over the 'Password' field$")
    public void iShouldSeeTheWhitespacesAreInadmissibleTextOverThePasswordField() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector(".input-container__error")).isDisplayed(),true);
        Assert.assertEquals("Whitespaces are inadmissible",base.Driver.findElement(By.cssSelector(".input-container__error")).getText());

        System.out.println("I should see the 'Whitespaces are inadmissible' text over the 'Password' field");
    }




    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }

}
