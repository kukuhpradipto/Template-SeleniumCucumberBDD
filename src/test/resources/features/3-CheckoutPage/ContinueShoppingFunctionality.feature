@ContinueFunctionality @SauceDemo
Feature: Button Continue Shopping Functionality on Check Out Page

  Scenario: Verify button Continue Shopping field can to click
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    When user click on the button Add to Cart at product "Sauce Labs Backpack"
    And user click on the button Add to Cart at product "Sauce Labs Onesie"
    Then increase the number in the cart icon
    When user click icon Cart
    Then user navigate to the Cart page
    When user click on the button Continue Shopping
    Then user navigate back on the home page


