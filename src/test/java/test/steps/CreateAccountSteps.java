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


    @When("^Click on the Country dropdown$")
    public void clickOnTheCountryDropdown() throws Throwable {
        endUserSteps.clickOnTheCountryDropdown();
    }

    @Then("^The list of countries should be open$")
    public void theListOfCountriesShouldBeOpen() throws Throwable {
       endUserSteps.checkThatListOfCountriesShouldBeOpen();
    }

    @When("^Click on the Birthday calendar$")
    public void clickOnTheBirthdayCalendar() throws Throwable {
        endUserSteps.clickOnTheBirthdayCalendar();
    }

    @Then("^Calendar is open$")
    public void calendarIsOpen() throws Throwable {
        endUserSteps.checkThatcalendarIsOpen();
    }

    @When("^Click on the Gender dropdown$")
    public void clickOnTheGenderDropdown() throws Throwable {
        endUserSteps.clickOnTheGenderDropdown();
    }

    @Then("^The list of genders is open$")
    public void theListOfGendersIsOpen() throws Throwable {
        endUserSteps.checkThatListOfGendersIsOpen();
    }

    @When("^Click on the Return to Full Page button$")
    public void clickOnTheReturnToFullPageButton() throws Throwable {
        endUserSteps.clickOnTheReturnToFullPageButton();
    }

    @Then("^A WELCOME page should be open$")
    public void aWELCOMEPageShouldBeOpen() throws Throwable {
        endUserSteps.checkThatWELCOMEPageShouldBeOpen();
    }
}
