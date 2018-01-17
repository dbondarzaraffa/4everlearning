package steps;

import base.BaseUtil;
import base.RandomGenerator;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegistrationStep extends BaseUtil{

    private BaseUtil base;

    public RegistrationStep(BaseUtil base) {
        this.base = base;
    }


    @Given("^I go to the 'Registration' page$")
    public void iGoToTheRegistrationPage() throws Throwable {
        System.out.println("I go to the 'Registration' page.");


    }

    @And("^I enter the randomly generated valid data to every field for registration$")
    public void iEnterTheRandomlyGeneratedValidDataToEveryFieldForRegistration() throws Throwable {

        RandomGenerator random = new RandomGenerator();
        String user = random.randomString();

        String name = user;
        String username = "AT" + user;
        String subdomain = user;
        String email = "zaraftest+" + user + "@gmail.com";

        System.out.println("I enter the randomly generated valid data to every field for registration.");
        System.out.println("Name: " + name + " Username: " + username + " Subdomain: " + subdomain + " Email: " + email);
    }

    @And("^I click the 'Register' button$")
    public void iClickTheRegisterButton() throws Throwable {
        System.out.println("I click the 'Register' button.");
    }

    @Then("^I see the message about email verification$")
    public void iSeeTheMessageAboutEmailVerification() throws Throwable {
        System.out.println("I see the message about email verification.");
    }

    @And("^I enter the randomly generated valid data for registration without 'Name' field$")
    public void iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutNameField() throws Throwable {

        RandomGenerator random = new RandomGenerator();
        String user = random.randomString();

        String username = "AT" + user;
        String subdomain = user;
        String email = "zaraftest+" + user + "@gmail.com";

        System.out.println("I enter the randomly generated valid data for registration without 'Name' field.");
        System.out.println("Username: " + username + " Subdomain: " + subdomain + " Email: " + email);

    }

    @Then("^I should see the 'The field is required' text on the top of 'username', 'subdomain', 'email' fields$")
    public void iShouldSeeTheTheFieldIsRequiredTextOnTheTopOfUsernameSubdomainEmailFields() throws Throwable {
        System.out.println("I should see the 'The field is required' text on the top of 'username', 'subdomain', 'email' fields.");
    }


    @And("^I enter incorrect characters to the 'Name' field and the error message is displayed$")
    public void iEnterIncorrectCharactersToTheNameFieldAndTheErrorMessageIsDisplayed() throws Throwable {
        System.out.println("I enter incorrect characters to the 'Name' field and the error message 'Use only: A-Z, a-z or “space” symbols' is displayed");
    }

    @And("^I enter only one character to the 'Name' field$")
    public void iEnterOnlyOneCharacterToTheNameField() throws Throwable {
        System.out.println("I enter only one character to the 'Name' field");
    }

    @And("^The error message about number of characters should be displayed over the 'Name' field$")
    public void theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheNameField() throws Throwable {
        System.out.println("The error message 'Length should be from 2 to 100' should be displayed over the 'Name' field");
    }

    @And("^I enter incorrect characters to the 'Name' field$")
    public void iEnterIncorrectCharactersToTheNameField() throws Throwable {
        System.out.println("I enter incorrect characters '6387#$%^&*' to the 'Name' field");
    }

    @And("^The error message about correct characters should be displayed over the 'Name' field$")
    public void theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheNameField() throws Throwable {
        System.out.println("The error message 'Use only: A-Z, a-z or “space” symbols' should be displayed over the 'Name' field");
    }

    @And("^I enter spaces to the 'Name' field$")
    public void iEnterSpacesToTheNameField() throws Throwable {
        System.out.println("I enter SPACES to the 'Name' field");
    }

    @And("^I enter only one character to the 'Username' field$")
    public void iEnterOnlyOneCharacterToTheUsernameField() throws Throwable {
        System.out.println("I enter only one character to the 'Username' field");
    }

    @And("^The error message about number of characters should be displayed over the 'Username' field$")
    public void theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheUsernameField() throws Throwable {
        System.out.println("The error message 'Length should be from 2 to 180' should be displayed over the 'Username' field");
    }

    @And("^I enter the randomly generated valid data for registration without 'Username' field$")
    public void iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutUsernameField() throws Throwable {

        RandomGenerator random = new RandomGenerator();
        String user = random.randomString();

        String name = user;
        String subdomain = user;
        String email = "zaraftest+" + user + "@gmail.com";

        System.out.println("I enter the randomly generated valid data for registration without 'Username' field");
        System.out.println("Name: " + name + " Subdomain: " + subdomain + " Email: " + email);


    }

    @And("^I enter incorrect characters to the 'Username' field$")
    public void iEnterIncorrectCharactersToTheUsernameField() throws Throwable {
        System.out.println("I enter incorrect characters to the 'Username' field");
    }

    @And("^The error message about correct characters should be displayed over the 'Username' field$")
    public void theErrorMessageCorrectCharactersShouldBeDisplayedOverTheUsernameField() throws Throwable {
        System.out.println("The error message 'Use only: A-Z, a-z or digits 0-9' should be displayed over the 'Username' field");
    }

    @And("^I enter username with SPACES to the 'Username' field$")
    public void iEnterUsernameWithSPACESToTheUsernameField() throws Throwable {

        RandomGenerator random = new RandomGenerator();
        String spaceAndUserName = " " + random.randomString();

        System.out.println("I enter username with SPACES to the 'Username' field: '" + spaceAndUserName + "'");
    }

    @And("^I enter only one character to the 'Subdomain' field$")
    public void iEnterOnlyOneCharacterToTheSubdomainField() throws Throwable {
        System.out.println("I enter only one character to the 'Subdomain' field");
    }

    @And("^The error message about number of characters should be displayed over the 'Subdomain' field$")
    public void theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheSubdomainField() throws Throwable {
        System.out.println("The error message 'Length should be from 2 to 50' should be displayed over the 'Subdomain' field");
    }

    @And("^I enter the randomly generated valid data for registration without 'Subdomain' field$")
    public void iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutSubdomainField() throws Throwable {

        RandomGenerator random = new RandomGenerator();
        String user = random.randomString();

        String name = user;
        String username = "AT" + user;
        String email = "zaraftest+" + user + "@gmail.com";

        System.out.println("I enter the randomly generated valid data for registration without 'Subdomain' field");
        System.out.println("Name: " + name + " Username: " + username + " Email: " + email);

    }

    @And("^I enter incorrect characters to the 'Subdomain' field$")
    public void iEnterIncorrectCharactersToTheSubdomainField() throws Throwable {
        System.out.println("I enter incorrect characters to the 'Subdomain' field");
    }

    @And("^The error message 'Use only: a-z or digits (\\d+)-(\\d+) or \"([^\"]*)\"' should be displayed over the 'Subdomain' field$")
    public void theErrorMessageUseOnlyAZOrDigitsOrShouldBeDisplayedOverTheSubdomainField(int arg0, int arg1, String arg2) throws Throwable {
        System.out.println("The error message 'Use only: a-z or digits 0-9 or \"-\"' should be displayed over the 'Subdomain' field");
    }

    @And("^I enter subdomain name with SPACES to the 'Subdomain' field$")
    public void iEnterSubdomainNameWithSPACESToTheSubdomainField() throws Throwable {
        System.out.println("I enter subdomain name with SPACES to the 'Subdomain' field");
    }

    @And("^The error message about correct characters should be displayed over the 'Subdomain' field$")
    public void theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheSubdomainField() throws Throwable {
        System.out.println("The error message 'Use only: A-Z, a-z or digits 0-9' should be displayed over the 'Subdomain' field");
    }

    @And("^I enter only one character to the 'Email' field$")
    public void iEnterOnlyOneCharacterToTheEmailField() throws Throwable {
        System.out.println("I enter only one character to the 'Email' field");
    }


    @And("^The error message about number of characters should be displayed over the 'Email' field$")
    public void theErrorMessageAboutNumberOfCharactersShouldBeDisplayedOverTheEmailField() throws Throwable {
        System.out.println("The error message about number of characters should be displayed over the 'Email' field");
    }

    @And("^I enter the randomly generated valid data for registration without 'Email' field$")
    public void iEnterTheRandomlyGeneratedValidDataForRegistrationWithoutEmailField() throws Throwable {
        RandomGenerator random = new RandomGenerator();
        String user = random.randomString();

        String name = user;
        String username = "AT" + user;
        String subdomain = user;

        System.out.println("I enter the randomly generated valid data for registration without 'Email' field");
        System.out.println("Name: " + name + " Username: " + username + " Subdomain: " + subdomain);

    }

    @And("^I enter incorrect characters to the 'Email' field$")
    public void iEnterIncorrectCharactersToTheEmailField() throws Throwable {
        System.out.println("I enter incorrect characters to the 'Email' field");
    }

    @And("^The error message about correct characters should be displayed over the 'Email' field$")
    public void theErrorMessageAboutCorrectCharactersShouldBeDisplayedOverTheEmailField() throws Throwable {
        System.out.println("The error message about correct characters should be displayed over the 'Email' field");
    }

    @And("^I enter email with SPACES to the 'Email' field$")
    public void iEnterEmailWithSPACESToTheEmailField() throws Throwable {

        RandomGenerator random = new RandomGenerator();
        String spaceEmail = " " + random.randomString();

        System.out.println("I enter email with SPACES to the 'Email' field '" + spaceEmail + "'");
    }
}
