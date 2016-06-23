package test.steps.serenity;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import test.pages.CreateAccount;
import test.pages.ProductsPage;
import test.pages.SignInPage;

import static org.assertj.core.api.Assertions.assertThat;

public class EndUserSteps extends ScenarioSteps {
    CreateAccount createAccount;
    ProductsPage productsPage;
    SignInPage signInPage;

    @Step
    public void open_Welcome_page() {
        getDriver().manage().window().maximize();
        createAccount.open();
    }

    @Step
    public void click_on_the_Sign_In_button() {
        createAccount.click_on_the_Sign_In_button();
    }

    @Step
    public void click_on_the_Create_Account_button() {
        createAccount.click_on_the_CreateAccount_button();
    }

    @Step
    public void checkThatCreateAccountPageIsOpen() {
        createAccount.Check_That_Create_Account_page_is_open();
    }

    @Step
    public void openCreateAccountPage() {
        getDriver().manage().window().maximize();
        createAccount.open();
        createAccount.openCreateAccountPage();
    }

    @Step
    public void click_on_the_SAVE_button() {
        createAccount.click_on_the_Save_button();
    }

    @Step
    public void checkThatMessagesAboutRequiredFildsIsShown() {
        createAccount.Check_That_message_about_required_first_field_is_shown();
        createAccount.Check_That_message_about_required_second_field_is_shown();
        createAccount.Check_That_message_about_required_third_field_is_shown();
        createAccount.Check_That_message_about_required_fourth_field_is_shown();
    }

    @Step
    public void open_SIGN_IN_page() {
        getDriver().manage().window().maximize();
        signInPage.open();
        signInPage.click_on_the_Sign_In_button();
    }

    @Step
    public void click_on_the_Google_button() {
        signInPage.click_on_the_Google_button();
    }

    @Step
    public void Check_that_Google_authorization_page_is_open() {
//        Assert.assertEquals("Google authorization page isn't open","That’s an error.", signInPage.Check_That_Google_authorization_page_is_open());
        signInPage.Check_That_Google_authorization_page_is_open();
    }

    @Step
    public void click_on_the_Linkedin_button() {
        signInPage.click_on_the_Linkedin_button();
    }

    @Step
    public void Check_that_Linkedin_authorization_page_is_open() {
        signInPage.Check_That_Linkedin_authorization_page_is_open();
    }

    @Step
    public void click_on_the_Twitter_button() {
        signInPage.click_on_the_Twitter_button();
    }

    @Step
    public void Check_that_Twitter_authorization_page_is_open() {
        signInPage.Check_That_Twitter_authorization_page_is_open();
    }

    @Step
    public void click_on_the_Facebook_button() {
        signInPage.click_on_the_Facebook_button();
    }

    @Step
    public void Check_that_Facebook_authorization_page_is_open(String arg0) {
          assertThat(signInPage.getDriver().getTitle()).isEqualTo(arg0);
    }

    @Step
    public void click_on_the_OpenID_button() {
        signInPage.click_on_the_OpenID_button();
    }

    @Step
    public void Check_that_OpenID_authorization_page_is_open() {
        signInPage.Check_That_OpenID_authorization_page_is_open();
    }


    @Step
    public void open_Products_page() {
        getDriver().manage().window().maximize();
        productsPage.open();
    }

    @Step
    public void pageIsOpen(String arg0) {
        assertThat(productsPage.getDriver().getTitle()).isEqualTo(arg0);
    }

    @Step
    public void checkThatProductPageContainWelcomeButton() {
        Assert.assertTrue("False", productsPage.checkThatProductsPageContainWelcomeButton());
    }

    @Step
    public void checkThatProductPageContainProductsButton() {
        Assert.assertTrue("False", productsPage.checkThatProductsPageContainProductsButton());
    }

    @Step
    public void checkThatProductPageContainSpecialOffersButton() {
        Assert.assertTrue("False", productsPage.checkThatProductsPageContainSpecialOffersButton());
    }

    @Step
    public void checkThatProductPageContainBlogsButton() {
        Assert.assertTrue("False", productsPage.checkThatProductsPageContainBlogsButton());
    }

    @Step
    public void checkThatProductPageContainConactUsButton() {
        Assert.assertTrue("False", productsPage.checkThatProductsPageContainContactUsButton());
    }

    @Step
    public void checkThatProductPageContainSearchField() {
        Assert.assertTrue("False", productsPage.checkThatProductsPageContainSearchField());
    }

    @Step
    public void checkThatProductPageContainSearchButton() {
        Assert.assertTrue("False", productsPage.checkThatProductsPageContainSearchButton());
    }

    @Step
    public void checkThatProductPageContainBreadcrumb_ICT4APPS() {
        Assert.assertTrue("False", productsPage.checkThatProductsPageContainBreadcrumb_ICT4APPS());
    }

    @Step
    public void checkThatProductPageContainBreadcrumb_PRODUCTS() {
        Assert.assertTrue("False", productsPage.checkThatProductsPageContainBreadcrumb_Products());
    }

    @Step
    public void click_on_the_button_of_first_category() {
        productsPage.click_on_first_category();
    }


    @Step
    public void checkThatTitleOfFirstCategoryInTheListHasNecessaryText() {
        Assert.assertEquals(Serenity.getCurrentSession().get("titleOfCategory"), productsPage.checkThatFirstCategoryOfProductIsOpen());
    }

    @Step
    public void click_on_the_button_of_second_category() {
        productsPage.click_on_second_category();
    }


    @Step
    public void checkThatTitleOfSecondCategoryInTheListHasNecessaryText() {
        Assert.assertEquals(Serenity.getCurrentSession().get("titleOfCategory"), productsPage.checkThatSecondCategoryOfProductIsOpen());
    }
    @Step
    public void click_on_arrow_category() {
        productsPage.click_on_arrow_category();
    }
    @Step
    public void theSubcategoriesListIsDisplayed() {

        Assert.assertTrue("False", productsPage.checkThatFirstListOfSubcategoriesIsDisplayed());
    }
    @Step
    public void click_on_arrow_category1() {
        productsPage.click_on_arrow_category1();
    }
    @Step
    public void click_on_arrow_subcategory() {
        productsPage.click_on_arrow_of_subcategory();    }
    @Step
    public void theChildSubcategoriesListIsDisplayed() {
        Assert.assertTrue("False",productsPage.checkthatChildSubcategoriesListIsDisplayed());
    }
    @Step
    public void clickOnSubcategory() {
        productsPage.clickOnSubcategory();
    }
    @Step
    public void checkThatSubcategoryIsDisplayed() {
        Assert.assertEquals(Serenity.getCurrentSession().get("titleOfSUBCategory"), productsPage.checkThatSubcategoryIsDisplayed());

    }
    @Step
    public void clickOnChildSubcategory() {
        productsPage.clickOnChildSubcategory();
    }
    @Step
    public void checkThatChildSubcategoryIsDisplayed() {
        Assert.assertEquals(Serenity.getCurrentSession().get("titleOfChildSUBCategory"), productsPage.checkThatChildSubcategoryIsDisplayed());
    }
    @Step
    public void clickOnTheNavigationCombobox() {
        productsPage.clickOnTheNavigationCombobox();
    }
    @Step
    public void clickOn24TheItem() {
        productsPage.clickOn24TheItem();
    }
    @Step
    public void checkThat24productsAreDisplayedAtTheGallery() {

        Assert.assertEquals("SHOWING 1 - 24 OF 19 RESULTS", productsPage.checkThat24productsAreDisplayedAtTheGallery());


    }
    @Step
    public void clickOnThe12Item() {
        productsPage.clickOnThe12Item();
    }
    @Step
    public void checkThat12productsAreDisplayedAtTheGallery() {
        Assert.assertEquals("SHOWING 1 - 12 OF 19 RESULTS", productsPage.checkThat12productsAreDisplayedAtTheGallery());
    }
    @Step
    public void clickOnThePageOfCombobox() {
        productsPage.clickOnThePageOfCombobox();
    }
    @Step
    public void clickOnThe2Item() {
        productsPage.clickOnThe2Item();
    }
    @Step
    public void checkThatSecondPageOf12ProductsIsDisplayedAtTheGallery() {
        Assert.assertEquals("SHOWING 13 - 24 OF 19 RESULTS", productsPage.checkThatSecondPageOfProductsIsDisplayedAtTheGallery());
    }
    @Step
    public void clickOnThe1Item() {
        productsPage.clickOnThe1Item();
    }
    @Step
    public void checkThatFirstPageOf12ProductsIsDisplayedAtTheGallery() {
        Assert.assertEquals("SHOWING 1 - 12 OF 19 RESULTS", productsPage.checkThatSecondPageOfProductsIsDisplayedAtTheGallery());

    }
    @Step
    public void clickOnTheLastButton() {

        productsPage.clickOnTheLastButton();
    }
    @Step
    public void checkThatLastPageOfGalleryIsOpen() {
        Assert.assertEquals("SHOWING 13 - 24 OF 19 RESULTS", productsPage.checkThatLastPageOfGalleryIsOpen1());
//        productsPage.checkThatLastPageOfGalleryIsOpen1();
    }

    public void clickOnThePreviousButton() {
        productsPage.clickOnThePreviousButton();
    }

    public void checkThatPreviousPageOfGalleryIsOpen() {
        Assert.assertEquals("SHOWING 1 - 12 OF 19 RESULTS", productsPage.checkThatPreviousPageOfGalleryIsOpen());
           }

    public void clickOnTheNextButton() {
        productsPage.clickOnTheNextButton();
    }

    public void checkThatNextPageOfGalleryIsOpen() {
        Assert.assertEquals("SHOWING 13 - 24 OF 19 RESULTS", productsPage.checkThatNextPageOfGalleryIsOpen());
    }

    public void clickOnTheFirstButton() {
        productsPage.clickOnTheFirstButton();
    }

    public void checkThatFirstPageOfGalleryIsOpen() {
        Assert.assertEquals("SHOWING 1 - 12 OF 19 RESULTS", productsPage.checkThatFirstPageOfGalleryIsOpen());
    }

    public void clickOnTheButtonOfViewModeAsAList() {
        productsPage.clickOnTheButtonOfViewModeAsAList();
    }

    public void checkThatallProductsAreDisplayedAsAList() {
        Assert.assertTrue("False",productsPage.checkThatallProductsAreDisplayedAsAList());
    }

    public void clickOnProductImage() {
        productsPage.clickOnProductImage();
    }

    public void checkThatPageOfDetailInfoAboutProductIsOpen() {
        Assert.assertTrue("False",productsPage.checkThatPageOfDetailInfoAboutProductIsOpen());
    }

    public void clickOnTheNameOfProduct() {
        productsPage.clickOnTheNameOfProduct();
    }

    public void clickOnReadMoreLink() {
        productsPage.clickOnReadMoreLink();
    }

    public void clickOnDetailProductImage() {
        productsPage.clickOnDetailProductImage();
    }

    public void checkThatfullImageIsOpened() {
        Assert.assertTrue("False",productsPage.checkThatfullImageIsOpened());
    }

    public void clickOnRightButton() {
       productsPage.lickOnRightButton();
    }

    public void checkThatnextFullImageIsOpened() {
        Assert.assertTrue("False",productsPage.checkThatnextFullImageIsOpened());

    }

    public void clickOnLeftButton() {
        productsPage.clickOnLeftButton();
    }

    public void previousFullImageIsOpened() {
        Assert.assertTrue("False",productsPage.checkThatPreviousFullImageIsOpened());
        
    }

    public void clickOnRight_Button() {
        productsPage.lickOnRight_Button();

    }

    public void clickOnCloseButton() {
        productsPage.clickOnCloseButton();
    }

    public void checkThatfullImageIsClosed() {
                Assert.assertTrue("False",productsPage.checkThatfullImageIsClosed());
    }

    public void clickOnTheBackTopButton() {
        productsPage.clickOnTheBackTopButton();
    }


//    @Step
//    public void pageIsOpen(String arg0) {
//        assertThat(productsPage.getDriver().getTitle()).isEqualTo(arg0);
//
//    }




//    @Step
//    public void checkThatTitleOfFirstCategoryHasNcessaryText(String titleOfFirstCategory) {
//        Assert.assertTrue(productsPage.TextOfTitleOfFirstCategoryGet().contains(titleOfFirstCategory));
//    }













   /*
   @Step
    public void click_on_WELCOME_Button(){
        productsPage.click_on_WELCOME_Button();
    }
    @Step
    public void checkThatWelcomePageIsOpen(){
        Assert.assertTrue("False", productsPage.checkThatWelcomePageIsOpen());
    }

   @Step
    public void click_on_title_of_product(int numberOfTitleOfProduct) {
        productsPage.click_on_title_of_product(numberOfTitleOfProduct);
    }
    @Step
    public void checkThatOnFullDescriptionOfProductHasRightTitle() {
    Assert.assertEquals(Serenity.getCurrentSession().get("titleOfCurrentProduct"),productsPage.titleOfAppropriateProductsTextGet());
    }
    @Step
    public void checkThatOnFullDescriptionOfProductHasNecessaryText(String fullDescriptionText) {
        Assert.assertTrue(productsPage.bitOfTextOfFullDescriptionOfProductGet().contains(fullDescriptionText));
    }

*/

}