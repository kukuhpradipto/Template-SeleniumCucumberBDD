@CancelFunctionality @SauceDemo
Feature: Button Cancel Functionality on Check Out Fill Information Page

  Scenario: Verify button Cancel field can to click
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
    When user click on the button Remove at product "Sauce Labs Backpack"
    Then items missing from the list product at checkout page
    When user click on the button Check Out
    Then user navigate back on the check out fill information page
    When user click button Cancel
    Then user navigate back on the check out page




