@CartFunctionality @SauceDemo
Feature: Cart Functionality on Home Page

  Scenario: Verify icon Cart field can to be click
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    When user click icon Cart
    Then user navigate to the Cart page

