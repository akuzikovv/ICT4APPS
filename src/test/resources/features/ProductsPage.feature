Feature: In this feature I'm testing the Products Page of ict4Apps site without roles
  Background:
    Given open Products page

  Scenario: Demo.ict.13.0001
    Then Page contain All necessary elements
    Then Page "Products - ict4apps_training" is open

  Scenario: Demo.ict.13.0002 Check the displaying of products at first category products
    When  click on the button of first category
    Then  The first category of products is open

  Scenario: Demo.ict.13.0003 Check the displaying of products at second category products
    When  click on the button of second category
    Then  The second category of products is open

  Scenario: Demo.ict.13.0004  Check that the subcategories list unfolding  after clicking  on the arrow of category at list of categories.
    When  Click on arrow category
    Then  The subcategories list is displayed

  Scenario: Demo.ict.13.0005 Check that the child subcategory list unfolding after clicking on the arrow of the subcategory at list of categories.
    When  Click on arrow category1
    When  Click on arrow of subcategory
    Then  The child subcategories list is displayed

  Scenario: Demo.ict.13.0006 Check transition to subcategory in the list of categories.
    When  Click on arrow category
    When  Click on subcategory
    Then  The subcategory is displayed

  Scenario: Demo.ict.13.0007 Check transition to child subcategory in the list of categories.
    When  Click on arrow category1
    When  Click on arrow of subcategory
    When  Click on child subcategory
    Then  The child subcategory is displayed

  Scenario: Demo.ict.13.0008 Check that the 24 products are displaying at the gallery
    When  Click on the "Items Per Page" navigation combobox
    When  Click on the "24" item
    Then  24 products are displayed at the gallery

  Scenario: Demo.ict.13.0011 Check that the 12 products are displaying at the gallery
    When  Click on the "Items Per Page" navigation combobox
    When  Click on the "24" item
    When  Click on the "Items Per Page" navigation combobox
    When  Click on the 12 item
    Then  12 products are displayed at the gallery

  Scenario: Demo.ict.13.0012 Check that  second  page of 12 products are displaying at the gallery
    When  Click on the Page of combobox
    When  Click on the 2 item
    Then  The second page of 12 products is displayed at the gallery

  Scenario: Demo.ict.13.0013 Check that  first  page of 12 products are displaying at the gallery
    When  Click on the Page of combobox
    When  Click on the 2 item
    When  Click on the Page of combobox
    When  Click on the 1 item
    Then  The first page of 12 products is displayed at the gallery

  Scenario: Demo.ict.13.0014 Check the "Last" button.
    When  Click on the Last button
    Then  The last page of gallery is open

  Scenario: Demo.ict.13.0015 Check the "Previous" button.
    When  Click on the Last button
    When  Click on the Previous button
    Then  The Previous page of gallery is open

  Scenario: Demo.ict.13.0016 Check the "First" button.
    When  Click on the Last button
    When  Click on the First button
    Then  The First page of gallery is open

  Scenario: Demo.ict.13.0017 Check the "Next" button.
    When  Click on the Next button
    Then  The Next page of gallery is open

  Scenario: Demo.ict.13.0018  Check the list mode.
    When  Click on the button of view mode as a list
    Then  All products are displayed as a list

  Scenario: Demo.ict.13.0019 Check transition to product page after clicking on the  product image at Products list
    When  Click on product image
    Then  The page of detail info about product is open

  Scenario: Demo.ict.13.0020 Check transition to product page after clicking on the name of product at Products list
    When  Click on the name of product
    Then  The page of detail info about product is open

  Scenario: Demo.ict.13.0021 Check transition to product page after clicking on the "Read More" link at Products list
    When  Click on Read More link
    Then  The page of detail info about product is open

  Scenario: Demo.ict.13.0022 Check transition at full image after clicking product image
    When  Click on Read More link
    When  Click on detail product image
    Then  Full image is opened

  Scenario: Demo.ict.13.0023 Check the  "Right" button after clicking product image
    When  Click on Read More link
    When  Click on detail product image
    When  Click on right button
    Then  Next full image is opened

  Scenario: Demo.ict.13.0024 Check the  "Left" button after clicking product image
    When  Click on Read More link
    When  Click on detail product image
    When  Click on right button
    When  Click on right_2 button
    When  Click on left button
    Then  Previous full image is opened

  Scenario: Demo.ict.13.0025 Check the "Close" button after clicking product image.
    When  Click on Read More link
    When  Click on detail product image
    When  Click on Close button
    Then  Full image is closed

  Scenario: Demo.ict.13.0026 Check the back-top button.
    When  Click on Read More link
    When  Click on the back-top button
    Then  Page "Products - ict4apps_training" is open

  Scenario: Demo.ict.13.0027  Check the grid mode.
    When  Click on the button of view mode as a grid
    Then  All products is displayed in grid mode

  Scenario: Demo.ict.13.0028  Check that image is changing to product name, short description, "Read More" link and social networks links.
    When  Click on the button of view mode as a grid
    When  Move the cursor to product image
    Then  Image is changed to product name,short description,Read More link and social networks links

  Scenario: Demo.ict.13.0029  Check transition to product page after clicking on the name of product.
    When  Click on the button of view mode as a grid
    When  Click on title of product
    Then  The page of detail info about product is open

  Scenario: Demo.ict.13.0030  Check transition to product page after clicking on the "Read More" link.
    When  Click on the button of view mode as a grid
    When  Click on the Read More link
    Then  The page of detail info about product is open

  Scenario: Demo.ict.13.0031  Check transition to product page after clicking on the "Read More" link.
    When  Click on title of product
    When  Click on Tag list
    Then  Products list is opened in appropriate list of categories





















