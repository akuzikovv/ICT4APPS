package test.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.steps.serenity.EndUserSteps;

public class RegistrationViaSocialNetworksSteps {
    @Steps
    EndUserSteps endUserSteps;

    @Given("^Open SIGN IN page$")
    public void openSIGNINPage() throws Throwable {
        endUserSteps.open_SIGN_IN_page();
    }

    @When("^click on the Google  button$")
    public void clickOnTheGoogleButton() throws Throwable {
     endUserSteps.click_on_the_Google_button();
    }

    @Then("^Check that Google authorization page is open$")
    public void checkThatGoogleAuthorizationPageIsOpen() throws Throwable {
    endUserSteps.Check_that_Google_authorization_page_is_open();
    }
    @When("^click on the Linkedin  button$")
    public void clickOnTheLinkedinButton() throws Throwable {
        endUserSteps.click_on_the_Linkedin_button();
    }

    @Then("^Check that Linkedin authorization page is open$")
    public void checkThatLinkedinAuthorizationPageIsOpen() throws Throwable {
        endUserSteps.Check_that_Linkedin_authorization_page_is_open();
    }
    @When("^click on the Twitter button$")
    public void clickOnTheTwitterButton() throws Throwable {
        endUserSteps.click_on_the_Twitter_button();
    }

    @Then("^Check that Twitter authorization page is open$")
    public void checkThatTwitterAuthorizationPageIsOpen() throws Throwable {
        endUserSteps.Check_that_Twitter_authorization_page_is_open();
    }
    @When("^click on the Facebook button$")
    public void clickOnTheFacebookButton() throws Throwable {
        endUserSteps.click_on_the_Facebook_button();
    }


    @When("^click on the OpenID button$")
    public void clickOnTheOpenIDButton() throws Throwable {
        endUserSteps.click_on_the_OpenID_button();
    }

    @Then("^Check that OpenID authorization page is open$")
    public void checkThatOpenIDAuthorizationPageIsOpen() throws Throwable {
        endUserSteps.Check_that_OpenID_authorization_page_is_open();
    }

    @Then("^Check that \"([^\"]*)\" page is open$")
    public void checkThatPageIsOpen(String arg0) throws Throwable {
        endUserSteps.Check_that_Facebook_authorization_page_is_open(arg0);
    }
}
