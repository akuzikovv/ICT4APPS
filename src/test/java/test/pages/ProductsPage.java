package test.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;
import test.ILocators;


@DefaultUrl("http://192.168.214.3:8080/products")

public class ProductsPage extends PageObject {


    //public String welcome_button_get(){
    //    return $(ILocators.WELCOME_BUTTON).getText();
    //  }
//    @FindBy(xpath = ILocators.PRODUCTS_TITLE_OF_PRODUCT_LIST)
//    private WebElement  productsTitlesList;


    public boolean checkThatProductsPageContainWelcomeButton() {
        if ($(ILocators.WELCOME_BUTTON).isPresent()) return true;
        else return false;
    }

    public boolean checkThatProductsPageContainProductsButton() {
        if ($(ILocators.PRODUCTS_BUTTON).isPresent()) return true;
        else return false;
    }

    public boolean checkThatProductsPageContainSpecialOffersButton() {
        if ($(ILocators.SPECIAL_OFFERS_BUTTON).isPresent()) return true;
        else return false;
    }

    public boolean checkThatProductsPageContainBlogsButton() {
        if ($(ILocators.BLOGS_BUTTON).isPresent()) return true;
        else return false;
    }

    public boolean checkThatProductsPageContainContactUsButton() {
        if ($(ILocators.CONTACT_US_BUTTON).isPresent()) return true;
        else return false;
    }

    public boolean checkThatProductsPageContainSearchField() {
        if ($(ILocators.SEARCH_FIELD).isPresent()) return true;
        else return false;
    }

    public boolean checkThatProductsPageContainSearchButton() {
        if ($(ILocators.SEARCH_BUTTON).isPresent()) return true;
        else return false;
    }

    public boolean checkThatProductsPageContainBreadcrumb_ICT4APPS() {
        if ($(ILocators.BREADCRUMB_ICT4APPS).isPresent()) return true;
        else return false;
    }

    public boolean checkThatProductsPageContainBreadcrumb_Products() {
        if ($(ILocators.BREADCRUMB_PRODUCTS).isPresent()) return true;
        else return false;
    }

    public void click_on_first_category() {
        Serenity.getCurrentSession().put("titleOfCategory", $(ILocators.FIRST_CATEGORY_OF_PRODUCTS).getText().toUpperCase());
        $(ILocators.FIRST_CATEGORY_OF_PRODUCTS).click();
    }

    public String checkThatFirstCategoryOfProductIsOpen() {
        return $(ILocators.TITLE_OF_FIRST_CATEGORY).getText().toUpperCase();
    }

    public void click_on_second_category() {
        Serenity.getCurrentSession().put("titleOfCategory", $(ILocators.SECOND_CATEGORY_OF_PRODUCTS).getText().toUpperCase());
        $(ILocators.SECOND_CATEGORY_OF_PRODUCTS).click();
    }

    public String checkThatSecondCategoryOfProductIsOpen() {
        return $(ILocators.TITLE_OF_CATEGORY).getText().toUpperCase();
    }

    public void click_on_arrow_category() {
        $(ILocators.ARROW_OF_FIRST_CATEGORY).click();
    }

    public boolean checkThatFirstListOfSubcategoriesIsDisplayed() {
//        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(ILocators.FIRST_LIST_OF_SUBCATEGORIES)));
        $(ILocators.FIRST_LIST_OF_SUBCATEGORIES).isDisplayed();
        return true;
    }

    public void click_on_arrow_category1() {
        $(ILocators.ARROW_OF_FIRST_CATEGORY1).click();
    }


    public void click_on_arrow_of_subcategory() {
        waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath((ILocators.ARROW_OF_FIRST_SUBCATEGORY))));
        $(ILocators.ARROW_OF_FIRST_SUBCATEGORY).click();
    }

    public boolean checkthatChildSubcategoriesListIsDisplayed() {
        $(ILocators.FIRST_LIST_OF_CHILD_SUBCATEGORIES).isDisplayed();
        return true;
    }

    public void clickOnSubcategory() {
        Serenity.getCurrentSession().put("titleOfSUBCategory", $(ILocators.SUBCATEGORY1).getText().toUpperCase());
        $(ILocators.SUBCATEGORY1).click();
    }

    public String checkThatSubcategoryIsDisplayed() {
        return $(ILocators.TITLE_OF_CATEGORY).getText().toUpperCase();
    }

    public void clickOnChildSubcategory() {
        Serenity.getCurrentSession().put("titleOfChildSUBCategory", $(ILocators.CHILD_SUBCATEGORY1).getText().toUpperCase());
        $(ILocators.CHILD_SUBCATEGORY1).click();
    }

    public String checkThatChildSubcategoryIsDisplayed() {
        return $(ILocators.TITLE_OF_CATEGORY).getText().toUpperCase();
    }

    public void clickOnTheNavigationCombobox() {
        $(ILocators.ITEMS_PER_PAGE_COMBOBOX).click();
    }

    public void clickOn24TheItem() {
        $(ILocators._24_ITEMS_PER_PAGE).click();
    }
//      waitABit(1500);}


    public String checkThat24productsAreDisplayedAtTheGallery() {
        return $(ILocators.SHOWING_OF_RESULTS).getText().toUpperCase();
    }

    public void clickOnThe12Item() {
        $(ILocators._12_ITEMS_PER_PAGE).click();
    }

    public String checkThat12productsAreDisplayedAtTheGallery() {
        return $(ILocators.SHOWING_OF_RESULTS).getText().toUpperCase();
    }

    public void clickOnThePageOfCombobox() {
        $(ILocators.PAGE_OF_COMBOBOX).click();
    }

    public void clickOnThe2Item() {
        $(ILocators._2_PAGE_OF).click();
    }

    public String checkThatSecondPageOfProductsIsDisplayedAtTheGallery() {
        return $(ILocators.SHOWING_OF_RESULTS).getText().toUpperCase();
    }

    public void clickOnThe1Item() {
        $(ILocators._1_PAGE_OF).click();
    }

    public void clickOnTheLastButton() {
        $(ILocators.LAST_BUTTON).click();
    }

    //    public void checkThatLastPageOfGalleryIsOpen(String text) {
//        Serenity.getCurrentSession().put(text, $(ILocators.PAGE_OF_COMBOBOX_TEXT).getText().toUpperCase());
//        int start = 5;
//        int end = 7;
//        char buf[] = new char[end - start];
//        text.getChars(start, end, buf, 0);
////        Serenity.getCurrentSession().get("text", (text).getChars(start, end, buf, 0));
////        return $(ILocators.PAGE_OF_COMBOBOX_TEXT).getText().toUpperCase();
//    }
    public String checkThatLastPageOfGalleryIsOpen1() {
        return $(ILocators.SHOWING_OF_RESULTS).getText().toUpperCase();
//        String text = null;
//        String text1 = null;
//        String text2 = null;
//        Serenity.getCurrentSession().put(text, $(ILocators.PAGE_OF_COMBOBOX_TEXT).getText().toUpperCase());
//        int start1 = 5;
//        int end1 = 7;
//        int start2 = 10;
//        int end2 = 12;
//        char buf1[] = new char[end1 - start1];
//        char buf2[] = new char[end2 - start2];
//        text.getChars(start1, end1, buf1, 0);
//        text.getChars(start2, end2, buf2, 0);
//        Serenity.getCurrentSession().put(text1, buf1);
//        Serenity.getCurrentSession().put(text2, buf2);
//        Assert.assertEquals(text1, text2);
//        return true;
    }

    public void clickOnThePreviousButton() {
        $(ILocators.PREVIOUS_BUTTON).click();
    }

    public String checkThatPreviousPageOfGalleryIsOpen() {
        return $(ILocators.SHOWING_OF_RESULTS).getText().toUpperCase();
    }

    public void clickOnTheNextButton() {
        $(ILocators.NEXT_BUTTON).click();
    }

    public String checkThatNextPageOfGalleryIsOpen() {
        return $(ILocators.SHOWING_OF_RESULTS).getText().toUpperCase();
    }

    public void clickOnTheFirstButton() {
        $(ILocators.FIRST_BUTTON).click();
    }

    public String checkThatFirstPageOfGalleryIsOpen() {
        return $(ILocators.SHOWING_OF_RESULTS).getText().toUpperCase();
    }

    public void clickOnTheButtonOfViewModeAsAList() {
        $(ILocators.LIST_MODE_BUTTON);
    }

    public boolean checkThatallProductsAreDisplayedAsAList() {
        $(ILocators.LIST_MODE).isDisplayed();
        return true;
    }

    public void clickOnProductImage() {
        $(ILocators._1_PRODUCT_IMAGE).click();
    }

    public boolean checkThatPageOfDetailInfoAboutProductIsOpen() {
        $(ILocators.DESCRIPTION_PRODUCT).isDisplayed();
        return true;
    }

    public void clickOnTheNameOfProduct() {
        $(ILocators._2_NAME_PRODUCT).click();
    }

    public void clickOnReadMoreLink() {
        $(ILocators._3_READ_MORE).click();
    }

    public void clickOnDetailProductImage() {
        $(ILocators.DETAIL_PRODUCT_IMAGE).click();
        waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.IMAGE)));
        Serenity.getCurrentSession().put("Image", $(ILocators.IMAGE));
        waitABit(3000);
    }

    public boolean checkThatfullImageIsOpened() {
        $(ILocators.FULL_PRODUCT_IMAGE).isPresent();
        return true;
    }

    public void lickOnRightButton() {
        $(ILocators.RIGHT_BUTTON_FOR_IMAGE).click();
        waitABit(3000);
    }

    public boolean checkThatnextFullImageIsOpened() {
        WebElementFacade element = (WebElementFacade) Serenity.getCurrentSession().get("Image");
        if ($(ILocators.IMAGE) == element) return false;
        else return true;
    }

    public void lickOnRight_Button() {
        $(ILocators.RIGHT_BUTTON_FOR_IMAGE).click();
        waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(ILocators.IMAGE)));
        Serenity.getCurrentSession().put("Image1", $(ILocators.IMAGE));
        waitABit(3000);
    }

    public void clickOnLeftButton() {
        $(ILocators.LEFT_BUTTON_FOR_IMAGE).click();
    }

    public boolean checkThatPreviousFullImageIsOpened() {
        WebElementFacade element = (WebElementFacade) Serenity.getCurrentSession().get("Image1");
        if ($(ILocators.IMAGE) == element) return false;
        else return true;
    }

    public void clickOnCloseButton() {
        $(ILocators.CLOSE_BUTTON_FOR_IMAGE).click();
           }

    public boolean checkThatfullImageIsClosed() {
         return getDriver().findElements(By.xpath("//button[@class='image-viewer-close close']")).isEmpty();
    }

    public void clickOnTheBackTopButton() {
        $(ILocators.BACK_TOP_BUTTON).click();
    }


//    public void checkThatLastPageOfGalleryIsOpen2() {
//        String text = null;
//        String text2 = null;
//        Serenity.getCurrentSession().put(text, $(ILocators.PAGE_OF_COMBOBOX_TEXT).getText().toUpperCase());
//        int start2 = 10;
//        int end2 = 12;
//        char buf2[] = new char[end2 - start2];
//        text.getChars(start2, end2, buf2, 0);
//        Serenity.getCurrentSession().put(text2, buf2);
//           }


}





 /*

*/


