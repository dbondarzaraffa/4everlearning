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
        String login = user;
        String subdomain = user;
        String email = "zaraftest+" + user + "@gmail.com";

        System.out.println("I enter the randomly generated valid data to every field for registration.");
        System.out.println("Name: " + name + " Login: " + login + " Subdomain: " + subdomain + " Email: " + email);
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

        String login = user;
        String subdomain = user;
        String email = "zaraftest+" + user + "@gmail.com";

        System.out.println("I enter the randomly generated valid data for registration without 'Name' field.");
        System.out.println("Login: " + login + " Subdomain: " + subdomain + " Email: " + email);

    }

    @Then("^I should see the 'The field is required' text on the top of 'username', 'subdomain', 'email' fields$")
    public void iShouldSeeTheTheFieldIsRequiredTextOnTheTopOfUsernameSubdomainEmailFields() throws Throwable {
        System.out.println("I should see the 'The field is required' text on the top of 'username', 'subdomain', 'email' fields.");
    }
}
