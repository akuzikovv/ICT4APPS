package test.steps;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import test.steps.serenity.EndUserSteps;


public class SignInSteps {

    @Steps
    EndUserSteps endUserSteps;

    @Then("^Check that SignIn page contain all necessary fields and buttons$")
    public void checkThatSignInPageContainAllNecessaryFieldsAndButtons() throws Throwable {
       endUserSteps.checkThatSignInPageContainAllNecessaryFieldsAndButtons();
    }
}
