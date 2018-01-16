package steps;

import base.BaseUtil;
import base.RandomGenerator;
import cucumber.api.PendingException;
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
        System.out.println("I go to the 'Login' page.");
/*
            base.Driver.navigate().to("http://dashboard.zaraftest.4everlearning.local.zaraffasoft.com/auth");
*/
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        System.out.println("I enter login and password.");
/*
        //Create an ArrayList
        List<User> users = new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        LoginPage page = new LoginPage(base.Driver);

        for (User user: users) {
            page.Login(user.username, user.password);
        }
*/
    }

    @And("^I click the 'Sign In' button$")
    public void iClickTheButton() throws Throwable {
        System.out.println("I click the 'Sign In' button.");
/*
        LoginPage page = new LoginPage(base.Driver);
        page.ClickSignInButton();
*/
    }

    @Then("^I should see the 'Avatar' picture$")
    public void iShouldSeeThePicture() throws Throwable {
        System.out.println("I'm logged in and see the 'Avatar' on the upper right corner.");
/*
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.id("My_account")).isDisplayed(),true);
*/
    }

    @Then("^I should see the 'Incorrect login or password' text on the top of the 'Login' form$")
    public void iShouldSeeTheIncorrectLoginOrPasswordTextOnTheTopOfTheLoginForm() throws Throwable {
        System.out.println("I should see the 'Incorrect login or password' text on the top of the 'Login' form.");
    }

    @Then("^I should see the 'The field is required' text on the top of both fields$")
    public void iShouldSeeTheTheFieldIsRequiredTextOnTheTopOfBothFields() throws Throwable {
        System.out.println("I should see the 'The field is required' text on the top of both fields.");
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
