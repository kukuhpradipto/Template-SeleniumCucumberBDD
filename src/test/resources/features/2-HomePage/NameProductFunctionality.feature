@NameProductFunctionality @SauceDemo
Feature: Name product Functionality at Home Page

  Scenario: Verify Name product Functionality
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    When user click on the name product "Sauce Labs Backpack"
    Then user navigate on the detail product

