package test.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import test.ILocators;

@DefaultUrl("http://192.168.214.3:8080/welcome")
public class CreateAccount extends PageObject {

    public void click_on_the_Sign_In_button(){
        $(ILocators.SIGN_IN_BUTTON).click();
    }
    public void click_on_the_CreateAccount_button(){
        $(ILocators.CREATE_ACCOUNT_BUTTON).click();
    }
    public boolean Check_That_Create_Account_page_is_open(){
        if ($(ILocators.PORTLET_TITLE).isPresent()) return true;
        else return false;
    }
    public void click_on_the_Save_button(){
        $(ILocators.SAVE_BUTTON).click();
    }
    public boolean Check_That_message_about_required_first_field_is_shown(){
        if ($(ILocators.MESSAGE_REQUIRED_FIELD1).isPresent()) return true;
        else return false;
    }
    public boolean Check_That_message_about_required_second_field_is_shown(){
        if ($(ILocators.MESSAGE_REQUIRED_FIELD2).isPresent()) return true;
        else return false;
    }
    public boolean Check_That_message_about_required_third_field_is_shown() {
        if ($(ILocators.MESSAGE_REQUIRED_FIELD3).isPresent()) return true;
        else return false;
    }
    public boolean Check_That_message_about_required_fourth_field_is_shown(){
        if ($(ILocators.MESSAGE_REQUIRED_FIELD4).isPresent()) return true;
        else return false;
    }
    public void openCreateAccountPage(){
        $(ILocators.SIGN_IN_BUTTON).click();
        $(ILocators.CREATE_ACCOUNT_BUTTON).click();
    }



}
