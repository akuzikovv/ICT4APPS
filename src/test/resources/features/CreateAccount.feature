Feature: In this feature I'm testing the Create Account  of ict4Apps site
  Background:
    Given Open Create Account page

  Scenario: Demo.ict.01.0001
    Given open Welcome page
    When click on the SIGN IN button
    When click on the Create Account button
    Then Check that Create Account page is open

  Scenario: Demo.ict.01.0002 Check creating account with empty fields.
    When  click on the SAVE button
    Then  Messages about required fields is shown

  Scenario: Demo.ict.01.0005 Check the "Country" dropdown.
    When  Click on the Country dropdown
    Then  The list of countries should be open

  Scenario: Demo.ict.01.0006 Check the "Birthday" calendar.
    When  Click on the Birthday calendar
    Then  Calendar is open

  Scenario: Demo.ict.01.0007 Check the "Gender" dropdown.
    When  Click on the Gender dropdown
    Then  The list of genders is open

  Scenario: Demo.ict.01.0008 Check the "Return to Full Page" button.
    When  Click on the Return to Full Page button
    Then  A WELCOME page should be open