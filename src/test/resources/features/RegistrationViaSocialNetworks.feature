Feature: In this feature I'm testing the registration via social networks
  Background:
    Given Open SIGN IN page

  Scenario: Demo.ict.04.0001
    When click on the Google  button
    Then Check that Google authorization page is open

  Scenario: Demo.ict.05.0001
    When click on the Linkedin  button
    Then Check that Linkedin authorization page is open

  Scenario: Demo.ict.03.0001
    When click on the Twitter button
    Then Check that Twitter authorization page is open

  Scenario: Demo.ict.02.0001
    When click on the Facebook button
    Then Check that Facebook page is open

  Scenario: Demo.ict.06.0001
    When click on the OpenID button
    Then Check that OpenID authorization page is open