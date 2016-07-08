package test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import test.ILocators;

@DefaultUrl("http://192.168.214.3:8080/welcome")
public class SignInPage extends PageObject {

    public void click_on_the_Sign_In_button(){
        $(ILocators.SIGN_IN_BUTTON).click();
    }
    public void click_on_the_Google_button(){
        $(ILocators.GOOGLE_BUTTON).click();
    }
   public boolean Check_That_Google_authorization_page_is_open(){
//       return $(ILocators.GOOGLE_LOGO).getText();
       if ($(ILocators.GOOGLE_LOGO).isPresent()) return true;
       else return false;
   }
    public void click_on_the_Linkedin_button(){
        $(ILocators.LINKEDIN_BUTTON).click();
    }
    public boolean Check_That_Linkedin_authorization_page_is_open(){
        if ($(ILocators.LINKEDIN_LOGO).isPresent()) return true;
        else return false;
    }
    public void click_on_the_Twitter_button(){
        $(ILocators.TWITTER_BUTTON).click();
    }
    public boolean Check_That_Twitter_authorization_page_is_open(){
        if ($(ILocators.TWITTER_LOGO).isPresent()) return true;
        else return false;
    }
    public void click_on_the_Facebook_button(){
        $(ILocators.FACEBOOK_BUTTON).click();
    }
    public boolean Check_That_Facebook_authorization_page_is_open(){

        if ($(ILocators.FACEBOOK_LOGO).isPresent()) return true;
        else return false;
    }
    public void click_on_the_OpenID_button(){
        $(ILocators.OPENID_BUTTON).click();
    }
    public boolean Check_That_OpenID_authorization_page_is_open(){

        if ($(ILocators.OPENID_LOGO).isPresent()) return true;
        else return false;
    }


    public boolean Check_that_Facebook_authorization_page_is_open() {
        for (String handle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(handle);
        }
        $(ILocators.FACEBOOK_LOGO).isPresent();
        return true;
    }

    public boolean checkThatSignInPageContainAllNecessaryFieldsAndButtons() {
    $(ILocators.LINKEDIN_BUTTON).isPresent();
//        $(ILocators.LINKEDIN_BUTTON).isPresent();
//        $(ILocators.TWITTER_BUTTON).isPresent();
//        $(ILocators.FACEBOOK_BUTTON).isPresent();
//        $(ILocators.OPENID_BUTTON).isPresent();
        return true;
//        else  return  false;



    }
}
