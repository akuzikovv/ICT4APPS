package test;


public interface ILocators {

     ////////////////////////// CREATE ACCOUNT/////////////////////////////////////
    String SIGN_IN_BUTTON = "//a[@class='login']";
    String CREATE_ACCOUNT_BUTTON = "(//a[@role='menuitem'])[11]";
    String PORTLET_TITLE = "//span[@class='portlet-title-text']";
    String SAVE_BUTTON = "//button[@class='btn btn-primary']";
    String MESSAGE_REQUIRED_FIELD1 = "(//div[@class='required'])[1]";
    String MESSAGE_REQUIRED_FIELD2 = "(//div[@class='required'])[2]";
    String MESSAGE_REQUIRED_FIELD3 = "(//div[@class='required'])[3]";
    String MESSAGE_REQUIRED_FIELD4 =  "//div[@class='email']";
    String COUNTRY_COMBOBOX = "(//select[@id])[2]";
    String CALENDAR = "//input[@id='_58_birthday']";
    String CALENDAR_LABEL = "//div[@class='yui3-u yui3-calendar-header-label']";
    String FEMALE = "//option[@value='0']";
    String GENDER = "//select[@id='_58_create.account.page.gender.mail']";
    String ICON_BACK ="//a[@class='portlet-icon-back']";
    ///////////////////////// SIGN IN PAGE /////////////////////////////////////////
    String GOOGLE_BUTTON = "(//a[@role='menuitem'])[6]";
    String LINKEDIN_BUTTON = "(//a[@role='menuitem'])[7]";
    String TWITTER_BUTTON = "(//a[@role='menuitem'])[8]";
    String FACEBOOK_BUTTON = "(//a[@role='menuitem'])[9]";
    String OPENID_BUTTON = "(//a[@role='menuitem'])[10]";
    String GOOGLE_LOGO = "(//ins)[1]";
    String LINKEDIN_LOGO = "//p[@class='note']";
    String TWITTER_LOGO = "//img[@class='app-icon']";
    String FACEBOOK_LOGO = "//span[@class='_50f6']";
    String OPENID_LOGO = "//span[@class='portlet-title-text']";

    ////////////////////////////  HEADER    /////////////////////////////////////////
    String WELCOME_BUTTON = "(//a[@role='menuitem']/span)[1]";
    String PRODUCTS_BUTTON = "(//a[@role='menuitem']/span)[2]";
    String SPECIAL_OFFERS_BUTTON = "(//a[@role='menuitem']/span)[3]";
    String BLOGS_BUTTON = "(//a[@role='menuitem']/span)[4]";
    String CONTACT_US_BUTTON = "(//a[@role='menuitem']/span)[5]";

    ////////////////////////////  PRODUCTS PAGE    /////////////////////////////////////////
    String PRODUCTS_PAGE_TITLE = "(//h3)[1]";
    String SEARCH_FIELD = "//input[@id='yui_patched_v3_11_0_1_1430216317928_790']";
    String SEARCH_BUTTON = "//button[@class='btn btn-dash']";
    String BREADCRUMB_ICT4APPS = "//a[@href='http://192.168.214.3:8080']";
    String BREADCRUMB_PRODUCTS = "//a[@href='http://192.168.214.3:8080/products']";
    String FIRST_CATEGORY_OF_PRODUCTS = "(//span[@class])[3]";
    String TITLE_OF_FIRST_CATEGORY = "(//h3)[1]";
    String SECOND_CATEGORY_OF_PRODUCTS = "(//span[@class])[4]";
    String TITLE_OF_CATEGORY = "(//h3)[1]";
    String TITLE_OF_PRODUCT = "(//h1[@class='product-title']//span)[2]";
    String ARROW_OF_FIRST_CATEGORY = "(//a[@class='jqtree_common jqtree-toggler jqtree-closed'])[1]";
    String FIRST_LIST_OF_SUBCATEGORIES = "//li[@class='jqtree_common jqtree-folder']";
    String SECOND_LIST_OF_SUBCATEGORIES = "//li[@class='jqtree_common jqtree-folder']";
    String BREADCRUMB_FIRST_CATEGORY = "//li[@class='active last breadcrumb-truncate']";
    String ARROW_OF_FIRST_CATEGORY1 = "(//a[@class='jqtree_common jqtree-toggler jqtree-closed'])[5]";
    String ARROW_OF_FIRST_SUBCATEGORY = "(//a[@class='jqtree_common jqtree-toggler jqtree-closed'])[5]";
    String FIRST_LIST_OF_CHILD_SUBCATEGORIES  ="(//li[@class='jqtree_common jqtree-folder'])[2]";
    String SUBCATEGORY1 = "(//span[@class])[6]";
    String CHILD_SUBCATEGORY1 = "(//span[@class])[22]";
    String ITEMS_PER_PAGE_COMBOBOX = "(//i[@class='caret'])[2]";
    String _24_ITEMS_PER_PAGE = "(//a[@role='menuitem'])[2]";
    String _12_ITEMS_PER_PAGE = "(//a[@role='menuitem'])[1]";
    String SHOWING_OF_RESULTS = "(//small[@class='search-results'])[1]";
    String PAGE_OF_COMBOBOX = "(//i[@class='caret'])[1]";
    String PAGE_OF_COMBOBOX_TEXT = "(//span[@class='lfr-icon-menu-text'])[1]";
    String _2_PAGE_OF = "(//a[@role='menuitem'])[2]";
    String _1_PAGE_OF = "(//a[@role='menuitem'])[1]";
    String LAST_BUTTON = "(//li[@class='lastPages'])[2]";
    String PREVIOUS_BUTTON = "(//li[@class='firstPages'])[2]";
    String NEXT_BUTTON = "(//li[@class='lastPages'])[1]";
    String FIRST_BUTTON = "(//li[@class='firstPages'])[1]";
    String LIST_MODE_BUTTON = "//i[@class='icon-list']";
    String LIST_MODE = "//ul[@class='b-product-gallery b-gallery b-gallery-list']";
    String GRID_MODE = "//ul[@class='b-product-gallery b-gallery b-gallery-grid gallery-items-row grid cols-3']";
    String GRID_MODE_BUTTON = "//i[@class='icon-th-large']";
    String _1_PRODUCT_IMAGE = "(//a[@style])[1]";
    String DESCRIPTION_PRODUCT = "(//div[@class='description-product span8'])";
    String _2_NAME_PRODUCT = "(//h3[@class='galery-product__title'])[2]";
    String _3_READ_MORE = "(//a[@class='product-list__readmore product-readmore__link'])[3]";
    String DETAIL_PRODUCT_IMAGE = "(//img[@class='example-image'])[1]";
    String FULL_PRODUCT_IMAGE = "//img[@class='image-viewer-image']";
    String RIGHT_BUTTON_FOR_IMAGE = "//a[@class='image-viewer-control carousel-control right']";
    String LEFT_BUTTON_FOR_IMAGE = "//a[@class='image-viewer-control carousel-control left']";
    String CLOSE_BUTTON_FOR_IMAGE = "//button[@class='image-viewer-close close']";
    String BACK_TOP_BUTTON = "//a[@class='icon-circle-arrow-left previous-level']";
    String IMAGE_OF_PRODUCT_GRID = "(//div[@class='product-mask'])[1]";
    String SHARED_LINKS_ON_GRID = "(//span[@class='b-share'])[1]";
    String TITLE_OFPRODUCT_IN_GRID = "(//h3[@class='galery-product__title'])[1]";
    String INTRO_TEXT_ON_PRODUCT_IN_GRID ="(//div[@class='gallery-product__introtext'])[1]";
    String READ_MORE_IN_GRID = "(//a[@class='grid_href product-grid__readmore product-readmore__link'])[1]";
    String TAGS = "//li[@class='']";
    String BREADCRUMB1 = "(//li)[6]";
    String BREADCRUMB2 = "(//li)[7]";
    String BREADCRUMB3 = "(//li)[8]";
    String BREADCRUMB4 = "(//li)[9]";
    String BREADCRUMB5 = "(//li)[9]";
    String SCROLLUP_BUTTON = "//a[@href='#']";
    String VK_IN_GRID = "(//span[@class='b-share']//a)[1]";
    String VK_PAGE = "//div[@class='info_line']";
    String TWITTER_PAGE = "//input[@type='submit']";
    String TWITTER_IN_GRID ="(//span[@class='b-share']//a)[3]";
    String LINKEDIN_IN_GRID = "(//span[@class='b-share']//a)[4]";
    String LINKEDIN_PAGE = "//div[@class='logo_container']";
    String FACEBOOK_PAGE = "//div[@class='logo_container']";
    String PINTEREST_IN_GRID = "(//span[@class='b-share']//a)[5]";
    String PINTEREST_PAGE = "//div[@class='inspiredLogo']";
    String GOOGLEPLUS_IN_GRID = "(//span[@class='b-share']//a)[6]";
    String GOOGLEPLUS_PAGE = "//div[@class='logo logo-w']";
    String SEARCH_SELECTED_COMBOBOX = "(//option[@selected])[2]";
    String SEARCH_RESULT_TABLE = "//table";





    String IMAGE = "//img[@class='image-viewer-image']";


    ////////////////////////////  WELCOME PAGE    /////////////////////////////////////////
    String MAIN_TITLE = "(//h2)[1]";

}