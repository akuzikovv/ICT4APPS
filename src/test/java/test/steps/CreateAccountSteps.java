package test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.steps.serenity.EndUserSteps;


public class CreateAccountSteps {
    @Steps
    EndUserSteps endUserSteps;

    @Given("^open Welcome page$")
    public void open_Products_page(){
        endUserSteps.open_Welcome_page(); }

    @When("^click on the SIGN IN button$")
    public void clickOnTheSignInButton() throws Throwable {
       endUserSteps.click_on_the_Sign_In_button(); }

    @When("^click on the Create Account button$")
    public void clickOnTheCreateAccountButton() throws Throwable {
     endUserSteps.click_on_the_Create_Account_button();   }


    @Then("^Check that Create Account page is open$")
    public void createAccountPageIsOpen() throws Throwable {
        endUserSteps.checkThatCreateAccountPageIsOpen();    }

    @Given("^Open Create Account page$")
    public void openCreateAccountPage() throws Throwable {
    endUserSteps.openCreateAccountPage();
    }

    @When("^click on the SAVE button$")
    public void clickOnTheSAVEButton() throws Throwable {
        endUserSteps.click_on_the_SAVE_button();
    }

    @Then("^Messages about required fields is shown$")
    public void MessagesAboutRequiredFieldsIsShown() throws Throwable {
       endUserSteps.checkThatMessagesAboutRequiredFildsIsShown();
    }



}
