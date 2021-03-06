package steps;

import base.BaseUtil;
import base.RandomGenerator;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.RegistrationPage;

public class RegistrationStep extends BaseUtil {

    private BaseUtil base;

    public RegistrationStep(BaseUtil base) {
        this.base = base;
    }


    @Given("^I go to the 'Registration' page$")
    public void iGoToTheRegistrationPage() throws Throwable {
        base.Driver.navigate().to("http://app.4everlearning.local.zaraffasoft.com/auth/registration/");
        System.out.println("I go to the 'Registration' page.");

    }

    @And("^I enter the randomly generated valid data to every field for registration$")
    public void iEnterTheRandomlyGeneratedValidDataToEveryFieldForRegistration() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);

        RandomGenerator random = new RandomGenerator();
        String user = random.randomString(10);

        String name = user;
        String username = "AT" + user;
        String subdomain = user;
        String email = "zaraftest+" + user + "@gmail.com";

        registrationPage.nameField.sendKeys(name);
        registrationPage.userNameField.sendKeys(username);
        registrationPage.subdomainField.sendKeys(subdomain);
        registrationPage.emailField.sendKeys(email);

        System.out.println("I enter the randomly generated valid data to every field for registration.");
        System.out.println("Name: " + name + " Username: " + username + " Subdomain: " + subdomain + " Email: " + email);
    }


    @And("^I click the 'Register' button$")
    public void iClickTheRegisterButton() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);

        registrationPage.registerButton.click();

        System.out.println("I click the 'Register' button.");
    }


    @Then("^I see the message about email verification$")
    public void iSeeTheMessageAboutEmailVerification() throws Throwable {

        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector(".whiteBox__text")).isDisplayed(), true);
        Assert.assertEquals("We have sent you a confirmation letter.", base.Driver.findElement(By.cssSelector(".whiteBox__text")).getText());
        Assert.assertEquals("http://app.4everlearning.local.zaraffasoft.com/auth/verification/sent", base.Driver.getCurrentUrl());

        System.out.println("I see the message about email verification.");
    }


    @And("^I enter the randomly generated valid data for registration without 'Name' field$")
    public void iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutNameField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);

        RandomGenerator random = new RandomGenerator();
        String user = random.randomString(10);

        String username = "AT" + user;
        String subdomain = user;
        String email = "zaraftest+" + user + "@gmail.com";

        registrationPage.userNameField.sendKeys(username);
        registrationPage.subdomainField.sendKeys(subdomain);
        registrationPage.emailField.sendKeys(email);

        System.out.println("I enter the randomly generated valid data for registration without 'Name' field.");
        System.out.println("Username: " + username + " Subdomain: " + subdomain + " Email: " + email);
    }


    @Then("^I should see the 'The field is required' text on the top of 'username', 'subdomain', 'email' fields$")
    public void iShouldSeeTheTheFieldIsRequiredTextOnTheTopOfUsernameSubdomainEmailFields() throws Throwable {

        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='username'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("The field is required", base.Driver.findElement(By.cssSelector("[name='username'] + .control-label + .input-container__error")).getText());

        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='subdomain'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("The field is required", base.Driver.findElement(By.cssSelector("[name='subdomain'] + .control-label + .input-container__error")).getText());

        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='email'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("The field is required", base.Driver.findElement(By.cssSelector("[name='email'] + .control-label + .input-container__error")).getText());

        System.out.println("I should see the 'The field is required' text on the top of 'username', 'subdomain', 'email' fields.");
    }


    @And("^I enter incorrect characters to the 'Name' field and the error message is displayed$")
    public void iEnterIncorrectCharactersToTheNameFieldAndTheErrorMessageIsDisplayed() throws Throwable {
        System.out.println("I enter incorrect characters to the 'Name' field and the error message 'Use only: A-Z, a-z or “space” symbols' is displayed");
    }

    @And("^I enter only one character to the 'Name' field$")
    public void iEnterOnlyOneCharacterToTheNameField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        registrationPage.nameField.sendKeys("w");

        System.out.println("I enter only one character to the 'Name' field");
    }

    @And("^The error message about number of characters should be displayed over the 'Name' field$")
    public void theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheNameField() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='name'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("Length should be from 2 to 100", base.Driver.findElement(By.cssSelector("[name='name'] + .control-label + .input-container__error")).getText());

        System.out.println("The error message 'Length should be from 2 to 100' should be displayed over the 'Name' field");
    }


    @And("^I enter incorrect characters to the 'Name' field$")
    public void iEnterIncorrectCharactersToTheNameField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        registrationPage.nameField.sendKeys("!@#$%^&*(");

        System.out.println("I enter incorrect characters '!@#$%^&*(' to the 'Name' field");
    }


    @Then("^The error message about correct characters should be displayed over the 'Name' field$")
    public void theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheNameField() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='name'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("Use only: A-Z, a-z or “space” symbols", base.Driver.findElement(By.cssSelector("[name='name'] + .control-label + .input-container__error")).getText());

        System.out.println("The error message 'Use only: A-Z, a-z or \"space\" symbols' should be displayed over the 'Name' field");
        System.out.println("Use only: A-Z, a-z or “space” symbols\n");
    }


    @And("^I enter spaces to the 'Name' field$")
    public void iEnterSpacesToTheNameField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);

//        RandomGenerator random = new RandomGenerator();
//        String user = random.randomString(5);
//
//        String name = user + "  " + user;
        registrationPage.nameField.sendKeys("            ");

        System.out.println("I enter SPACES to the 'Name' field");
    }


    @And("^I enter only one character to the 'Username' field$")
    public void iEnterOnlyOneCharacterToTheUsernameField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        registrationPage.userNameField.sendKeys("w");

        System.out.println("I enter only one character to the 'Username' field");
    }


    @Then("^The error message about number of characters should be displayed over the 'Username' field$")
    public void theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheUsernameField() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='username'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("Length should be from 2 to 180", base.Driver.findElement(By.cssSelector("[name='username'] + .control-label + .input-container__error")).getText());

        System.out.println("The error message 'Length should be from 2 to 180' should be displayed over the 'Username' field");
    }


    @And("^I enter the randomly generated valid data for registration without 'Username' field$")
    public void iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutUsernameField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);

        RandomGenerator random = new RandomGenerator();
        String user = random.randomString(10);

        String name = user;
        String subdomain = user;
        String email = "zaraftest+" + user + "@gmail.com";

        registrationPage.nameField.sendKeys(user);
        registrationPage.subdomainField.sendKeys(subdomain);
        registrationPage.emailField.sendKeys(email);

        System.out.println("I enter the randomly generated valid data for registration without 'Username' field");
        System.out.println("Name: " + name + " Subdomain: " + subdomain + " Email: " + email);


    }

    @And("^I enter incorrect characters to the 'Username' field$")
    public void iEnterIncorrectCharactersToTheUsernameField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        registrationPage.userNameField.sendKeys("(@*&#^$");

        System.out.println("I enter incorrect characters to the 'Username' field");
    }


    @Then("^The error message about correct characters should be displayed over the 'Username' field$")
    public void theErrorMessageCorrectCharactersShouldBeDisplayedOverTheUsernameField() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='username'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("Use only: A-Z, a-z or digits 0-9", base.Driver.findElement(By.cssSelector("[name='username'] + .control-label + .input-container__error")).getText());


        System.out.println("The error message 'Use only: A-Z, a-z or digits 0-9' should be displayed over the 'Username' field");
    }

    @And("^I enter username with SPACES to the 'Username' field$")
    public void iEnterUsernameWithSPACESToTheUsernameField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        RandomGenerator random = new RandomGenerator();
        String spaceAndUserName = random.randomString(5) + " " + random.randomString(5);
        registrationPage.userNameField.sendKeys(spaceAndUserName);

        System.out.println("I enter username with SPACES to the 'Username' field: '" + spaceAndUserName + "'");
    }


    @And("^I enter only one character to the 'Subdomain' field$")
    public void iEnterOnlyOneCharacterToTheSubdomainField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        registrationPage.subdomainField.sendKeys("w");

        System.out.println("I enter only one character to the 'Subdomain' field");
    }

    @Then("^The error message about number of characters should be displayed over the 'Subdomain' field$")
    public void theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheSubdomainField() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='subdomain'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("Length should be from 2 to 50", base.Driver.findElement(By.cssSelector("[name='subdomain'] + .control-label + .input-container__error")).getText());

        System.out.println("The error message 'Length should be from 2 to 50' should be displayed over the 'Subdomain' field");
    }

    @And("^I enter the randomly generated valid data for registration without 'Subdomain' field$")
    public void iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutSubdomainField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        RandomGenerator random = new RandomGenerator();
        String user = random.randomString(10);

        String name = user;
        String username = "AT" + user;
        String email = "zaraftest+" + user + "@gmail.com";

        registrationPage.nameField.sendKeys(user);
        registrationPage.userNameField.sendKeys(username);
        registrationPage.emailField.sendKeys(email);

        System.out.println("I enter the randomly generated valid data for registration without 'Subdomain' field");
        System.out.println("Name: " + name + " Username: " + username + " Email: " + email);

    }

    @And("^I enter incorrect characters to the 'Subdomain' field$")
    public void iEnterIncorrectCharactersToTheSubdomainField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        registrationPage.subdomainField.sendKeys("&@#^*(#$");

        System.out.println("I enter incorrect characters to the 'Subdomain' field");
    }

    @And("^The error message 'Use only: a-z or digits (\\d+)-(\\d+) or \"([^\"]*)\"' should be displayed over the 'Subdomain' field$")
    public void theErrorMessageUseOnlyAZOrDigitsOrShouldBeDisplayedOverTheSubdomainField(int arg0, int arg1, String arg2) throws Throwable {
        System.out.println("The error message 'Use only: a-z or digits 0-9 or \"-\"' should be displayed over the 'Subdomain' field");
    }

    @And("^I enter subdomain name with SPACES to the 'Subdomain' field$")
    public void iEnterSubdomainNameWithSPACESToTheSubdomainField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        RandomGenerator random = new RandomGenerator();
        String user = random.randomString(5);

        registrationPage.subdomainField.sendKeys(user + " " + user);

        System.out.println("I enter subdomain name with SPACES to the 'Subdomain' field");
    }

    @Then("^The error message about correct characters should be displayed over the 'Subdomain' field$")
    public void theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheSubdomainField() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='subdomain'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("Use only: a-z or digits 0-9 or \"-\"", base.Driver.findElement(By.cssSelector("[name='subdomain'] + .control-label + .input-container__error")).getText());

        System.out.println("The error message 'Use only: A-Z, a-z or digits 0-9' should be displayed over the 'Subdomain' field");
    }

    @And("^I enter only one character to the 'Email' field$")
    public void iEnterOnlyOneCharacterToTheEmailField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        registrationPage.emailField.sendKeys("w");

        System.out.println("I enter only one character to the 'Email' field");
    }


    @Then("^The error message about number of characters should be displayed over the 'Email' field$")
    public void theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheEmailField() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='email'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("Length should be from 2 to 180", base.Driver.findElement(By.cssSelector("[name='email'] + .control-label + .input-container__error")).getText());

        System.out.println("The error message about number of characters should be displayed over the 'Email' field");
    }

    @And("^I enter the randomly generated valid data for registration without 'Email' field$")
    public void iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutEmailField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        RandomGenerator random = new RandomGenerator();
        String user = random.randomString(10);

        String name = user;
        String username = "AT" + user;
        String subdomain = user;

        registrationPage.nameField.sendKeys(user);
        registrationPage.userNameField.sendKeys(username);
        registrationPage.subdomainField.sendKeys(subdomain);

        System.out.println("I enter the randomly generated valid data for registration without 'Email' field");
        System.out.println("Name: " + name + " Username: " + username + " Subdomain: " + subdomain);

    }

    @And("^I enter incorrect characters to the 'Email' field$")
    public void iEnterIncorrectCharactersToTheEmailField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        registrationPage.emailField.sendKeys("@#$%^&*()");

        System.out.println("I enter incorrect characters to the 'Email' field");
    }

    @Then("^The error message about correct characters should be displayed over the 'Email' field$")
    public void theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheEmailField() throws Throwable {
        Assert.assertEquals("Its not displayed!!!", base.Driver.findElement(By.cssSelector("[name='email'] + .control-label + .input-container__error")).isDisplayed(), true);
        Assert.assertEquals("The email address entered is invalid", base.Driver.findElement(By.cssSelector("[name='email'] + .control-label + .input-container__error")).getText());

        System.out.println("The error message about correct characters should be displayed over the 'Email' field");
    }

    @And("^I enter email with SPACES to the 'Email' field$")
    public void iEnterEmailWithSPACESToTheEmailField() throws Throwable {
        RegistrationPage registrationPage = new RegistrationPage(base.Driver);
        RandomGenerator random = new RandomGenerator();

        String spaceEmail = "zaraftest " + random.randomString(10) + "@gmail.com";
        registrationPage.emailField.sendKeys(spaceEmail);

        System.out.println("I enter email with SPACES to the 'Email' field '" + spaceEmail + "'");
    }
}
