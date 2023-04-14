@RemoveFunctionality @SauceDemo
Feature: Button Remove on Home Page

  Scenario: Verify button Add to Card field can to be click
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    When user click on the button Add to Cart at product "Sauce Labs Backpack"
    And user click on the button Add to Cart at product "Sauce Labs Onesie"
    Then increase the number in the cart icon
    When user click on the button Remove at product "Sauce Labs Backpack"
    Then amount at cart will be reduce

