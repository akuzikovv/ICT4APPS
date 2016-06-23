package test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.steps.serenity.EndUserSteps;


public class ProductsPageSteps {

    @Steps
    EndUserSteps endUserSteps;

    @Given("^open Products page$")
    public void open_Products_page() {
        endUserSteps.open_Products_page();
    }

    @Then("^Page \"([^\"]*)\" is open$")
    public void pageIsOpen(String arg0) throws Throwable {
        endUserSteps.pageIsOpen(arg0);    }

    @Then("^Page contain All necessary elements$")
    public void pageContainAllNecessaryElements() throws Throwable {
        endUserSteps.checkThatProductPageContainWelcomeButton();
        endUserSteps.checkThatProductPageContainProductsButton();
        endUserSteps.checkThatProductPageContainSpecialOffersButton();
        endUserSteps.checkThatProductPageContainBlogsButton();
        endUserSteps.checkThatProductPageContainConactUsButton();
        endUserSteps.checkThatProductPageContainSearchField();
        endUserSteps.checkThatProductPageContainSearchButton();
        endUserSteps.checkThatProductPageContainBreadcrumb_ICT4APPS();
        endUserSteps.checkThatProductPageContainBreadcrumb_PRODUCTS();
    }

    @When("^click on the button of first category$")
    public void clickOnTheButtonOfFirstCategory() throws Throwable {
        endUserSteps.click_on_the_button_of_first_category();
    }

    @Then("^The first category of products is open$")
    public void theFirstCategoryOfProductsIsOpen() throws Throwable {
        endUserSteps.checkThatTitleOfFirstCategoryInTheListHasNecessaryText();
//        endUserSteps.checkThatTitleOfFirstCategoryHasNecessaryText(arg1);
    }

    @When("^click on the button of second category$")
    public void clickOnTheButtonOfSecondCategory() throws Throwable {
        endUserSteps.click_on_the_button_of_second_category();
    }

    @Then("^The second category of products is open$")
    public void theSecondCategoryOfProductsIsOpen() throws Throwable {
        endUserSteps.checkThatTitleOfSecondCategoryInTheListHasNecessaryText();
    }

    @When("^Click on arrow category$")
    public void clickOnArrowCategory() throws Throwable {
        endUserSteps.click_on_arrow_category();
    }

    @Then("^The subcategories list is displayed$")
    public void theSubcategoriesListIsDisplayed() throws Throwable {
        endUserSteps.theSubcategoriesListIsDisplayed();
    }

    @When("^Click on arrow of subcategory$")
    public void clickOnArrowOfSubcategory() throws Throwable {
        endUserSteps.click_on_arrow_subcategory();
    }

    @When("^Click on arrow category1$")
    public void clickOnArrowCategory1() throws Throwable {
        endUserSteps.click_on_arrow_category1();
    }

    @Then("^The child subcategories list is displayed$")
    public void theChildSubcategoriesListIsDisplayed() throws Throwable {
        endUserSteps.theChildSubcategoriesListIsDisplayed();
    }

    @When("^Click on subcategory$")
    public void clickOnSubcategory() throws Throwable {
        endUserSteps.clickOnSubcategory();
    }

    @Then("^The subcategory is displayed$")
    public void theSubcategoryIsDisplayed() throws Throwable {
        endUserSteps.checkThatSubcategoryIsDisplayed();
    }

    @When("^Click on child subcategory$")
    public void clickOnChildSubcategory() throws Throwable {
        endUserSteps.clickOnChildSubcategory();
    }

    @Then("^The child subcategory is displayed$")
    public void theChildSubcategoryIsDisplayed() throws Throwable {
        endUserSteps.checkThatChildSubcategoryIsDisplayed();

    }

    @When("^Click on the \"([^\"]*)\" navigation combobox$")
    public void clickOnTheNavigationCombobox(String arg0) throws Throwable {
        endUserSteps.clickOnTheNavigationCombobox();
    }

    @When("^Click on the \"([^\"]*)\" item$")
    public void clickOnTheItem(String arg0) throws Throwable {
        endUserSteps.clickOn24TheItem();
    }

    @When("^Click on the 12 item$")
    public void clickOnThe12Item() throws Throwable {
        endUserSteps.clickOnThe12Item();
    }

    @Then("^12 products are displayed at the gallery$")
    public void _12productsAreDisplayedAtTheGallery() throws Throwable {
        endUserSteps.checkThat12productsAreDisplayedAtTheGallery();
    }

    @Then("^24 products are displayed at the gallery$")
    public void _24productsAreDisplayedAtTheGallery() throws Throwable {
        endUserSteps.checkThat24productsAreDisplayedAtTheGallery();
    }

    @When("^Click on the Page of combobox$")
    public void clickOnThePageOfCombobox() throws Throwable {
        endUserSteps.clickOnThePageOfCombobox();
    }

    @When("^Click on the 2 item$")
    public void clickOnThe2Item() throws Throwable {
        endUserSteps.clickOnThe2Item();
    }

    @Then("^The second page of 12 products is displayed at the gallery$")
    public void theSecondPageOfProductsIsDisplayedAtTheGallery() throws Throwable {
        endUserSteps.checkThatSecondPageOf12ProductsIsDisplayedAtTheGallery();
    }

    @When("^Click on the 1 item$")
    public void clickOnThe1Item() throws Throwable {
  endUserSteps.clickOnThe1Item();
    }

    @Then("^The first page of 12 products is displayed at the gallery$")
    public void theFirstPageOfProductsIsDisplayedAtTheGallery() throws Throwable {
       endUserSteps.checkThatFirstPageOf12ProductsIsDisplayedAtTheGallery();
    }

    @When("^Click on the Last button$")
    public void clickOnTheLastButton() throws Throwable {
        endUserSteps.clickOnTheLastButton();
    }

    @Then("^The last page of gallery is open$")
    public void theLastPageOfGalleryIsOpen() throws Throwable {
             endUserSteps.checkThatLastPageOfGalleryIsOpen();
    }

    @When("^Click on the Previous button$")
    public void clickOnThePreviousButton() throws Throwable {
       endUserSteps.clickOnThePreviousButton();
    }

    @Then("^The Previous page of gallery is open$")
    public void thePreviousPageOfGalleryIsOpen() throws Throwable {
        endUserSteps.checkThatPreviousPageOfGalleryIsOpen();
    }

    @When("^Click on the Next button$")
    public void clickOnTheNextButton() throws Throwable {
       endUserSteps.clickOnTheNextButton();
    }

    @Then("^The Next page of gallery is open$")
    public void theNextPageOfGalleryIsOpen() throws Throwable {
        endUserSteps.checkThatNextPageOfGalleryIsOpen();
    }

    @When("^Click on the First button$")
    public void clickOnTheFirstButton() throws Throwable {
       endUserSteps.clickOnTheFirstButton();
    }

    @Then("^The First page of gallery is open$")
    public void theFirstPageOfGalleryIsOpen() throws Throwable {
        endUserSteps.checkThatFirstPageOfGalleryIsOpen();
    }

    @When("^Click on the button of view mode as a list$")
    public void clickOnTheButtonOfViewModeAsAList() throws Throwable {
       endUserSteps.clickOnTheButtonOfViewModeAsAList();
    }

    @Then("^All products are displayed as a list$")
    public void allProductsAreDisplayedAsAList() throws Throwable {
     endUserSteps.checkThatallProductsAreDisplayedAsAList();
    }

    @When("^Click on product image$")
    public void clickOnProductImage() throws Throwable {
        endUserSteps.clickOnProductImage();
    }

    @Then("^The page of detail info about product is open$")
    public void thePageOfDetailInfoAboutProductIsOpen() throws Throwable {
        endUserSteps.checkThatPageOfDetailInfoAboutProductIsOpen();
    }

    @When("^Click on the name of product$")
    public void clickOnTheNameOfProduct() throws Throwable {
        endUserSteps.clickOnTheNameOfProduct();
    }

    @When("^Click on Read More link$")
    public void clickOnReadMoreLink() throws Throwable {
        endUserSteps.clickOnReadMoreLink();
    }

    @When("^Click on detail product image$")
    public void clickOnDetailProductImage() throws Throwable {
        endUserSteps.clickOnDetailProductImage();

    }

    @Then("^Full image is opened$")
    public void fullImageIsOpened() throws Throwable {
        endUserSteps.checkThatfullImageIsOpened();
    }

    @When("^Click on right button$")
    public void clickOnRightButton() throws Throwable {
       endUserSteps.clickOnRightButton();
    }

    @Then("^Next full image is opened$")
    public void nextFullImageIsOpened() throws Throwable {
    endUserSteps.checkThatnextFullImageIsOpened();
    }

    @When("^Click on left button$")
    public void clickOnLeftButton() throws Throwable {
       endUserSteps.clickOnLeftButton();
    }

    @Then("^Previous full image is opened$")
    public void previousFullImageIsOpened() throws Throwable {
        endUserSteps.previousFullImageIsOpened();
    }


    @When("^Click on right_(\\d+) button$")
    public void clickOnRight_Button(int arg0) throws Throwable {
        endUserSteps.clickOnRight_Button();
    }

    @When("^Click on Close button$")
    public void clickOnCloseButton() throws Throwable {
        endUserSteps.clickOnCloseButton();
    }

    @Then("^Full image is closed$")
    public void fullImageIsClosed() throws Throwable {
       endUserSteps.checkThatfullImageIsClosed();
    }

    @When("^Click on the back-top button$")
    public void clickOnTheBackTopButton() throws Throwable {
        endUserSteps.clickOnTheBackTopButton();
    }

    @When("^Click on the button of view mode as a grid$")
    public void clickOnTheButtonOfViewModeAsAGrid() throws Throwable {
        endUserSteps.clickOnTheButtonOfViewModeAsAGrid();
    }

    @Then("^All products is displayed in grid mode$")
    public void allProductsIsDisplayedInGridMode() throws Throwable {
        endUserSteps.checkThatallProductsIsDisplayedInGridMode();
    }







  /*

/////////////////////////////////////////2 CASE/////////////////////////////////
 @Then("^Page contain Welcome button$")
    public void pageContainWelcomeButton() throws Throwable {
        endUserSteps.checkThatProductPageContainWelcomeButton();    }
    @Then("^Page contain Products button$")
    public void pageContainProductsButton() throws Throwable {
        endUserSteps.checkThatProductPageContainProductsButton();   }
    @Then("^Page contain Special Offers button$")
    public void pageContainSpecialOffersButton() throws Throwable {
        endUserSteps.checkThatProductPageContainSpecialOffersButton();    }
    @Then("^Page contain Blogs button$")
    public void pageContainBlogsButton() throws Throwable {
        endUserSteps.checkThatProductPageContainBlogsButton();    }
    @Then("^Page contain Contact Us button$")
    public void pageContainContactUsButton() throws Throwable {
        endUserSteps.checkThatProductPageContainConactUsButton();    }
    @Then("^Page contain Search Field$")
    public void pageContainSearchField() throws Throwable {
        endUserSteps.checkThatProductPageContainSearchField();    }
    @Then("^Page contain Search Button$")
    public void pageContainSearchButton() throws Throwable {
        endUserSteps.checkThatProductPageContainSearchButton();    }
    @Then("^Page contain Breadcrumb_ICT4APPS$")
    public void pageContainBreadcrumb_ICTAPPS() throws Throwable {
       endUserSteps.checkThatProductPageContainBreadcrumb_ICT4APPS();    }
    @Then("^Page contain Breadcrumb_PRODUCTS$")
    public void pageContainBreadcrumb_PRODUCTS() throws Throwable {
        endUserSteps.checkThatProductPageContainBreadcrumb_PRODUCTS();    }
//////////////////////////////////////////////////////////////////////////////////


*/
}
