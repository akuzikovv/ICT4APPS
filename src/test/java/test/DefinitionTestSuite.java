package test;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={
 "src/test/resources/features/CreateAccount.feature",
       "src/test/resources/features/RegistrationViaSocialNetworks.feature",
      "src/test/resources/features/ProductsPage.feature",
        "src/test/resources/features/SignIn.feature",
//        "src/test/resources/features/Welcome.feature",
//        "src/test/resources/features/ProductPageShopManager.feature"
})
public class DefinitionTestSuite {}
