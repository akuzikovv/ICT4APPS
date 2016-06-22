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