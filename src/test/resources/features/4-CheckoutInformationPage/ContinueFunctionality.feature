@ContinueFunctionality @SauceDemo
Feature: Button Continue Functionality on Check Out Fill Information Page

  Scenario: Verify button Continue field with fill valid at all form column
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
    When user fill firstName with "Kukuh"
    And user fill lastName with "Pradipto"
    And user fill portalCode with 51354
    Then user click button continue
    And user navigate on the overview page


  Scenario: Verify button Continue field with fill invalid at column firstName
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
    When user fill firstName with "##$$%%"
    And user fill lastName with "Pradipto"
    And user fill portalCode with 51354
    Then user click button continue
    And verify that an error message appears on the screen


  Scenario: Verify button Continue field with fill invalid at column lastName
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
    When user fill firstName with "Kukuh"
    And user fill lastName with "1122YAYA"
    And user fill portalCode with 51354
    Then user click button continue
    And verify that an error message appears on the screen


  Scenario: Verify button Continue field with fill invalid at column portalCode
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
    When user fill firstName with "Kukuh"
    And user fill lastName with "Pradipto"
    And user fill portalCode with "##$%##"
    Then user click button continue
    And verify that an error message appears on the screen


  Scenario: Verify button Continue field without fill all form column firstName
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
    When user fill firstName with ""
    And user fill lastName with "Pradipto"
    And user fill portalCode with 51354
    Then user click button continue
    And verify that an error message appears on the screen


  Scenario: Verify button Continue field without fill all form column lastName
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
    When user fill firstName with "Kukuh"
    And user fill lastName with ""
    And user fill portalCode with 51354
    Then user click button continue
    And verify that an error message appears on the screen


  Scenario: Verify button Continue field with fill invalid at column portalCode
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
    When user fill firstName with "Kukuh"
    And user fill lastName with "Pradipto"
    And user fill portalCode with ""
    Then user click button continue
    And verify that an error message appears on the screen


  Scenario: Verify button Continue field without fill all form column firstName and form column lastName
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
    When user fill firstName with ""
    And user fill lastName with ""
    And user fill portalCode with 51354
    Then user click button continue
    And verify that an error message appears on the screen


  Scenario: Verify button Continue field without fill all form column firstName and form column portalCode
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
    When user fill firstName with ""
    And user fill lastName with "Pradipto"
    And user fill portalCode with ""
    Then user click button continue
    And verify that an error message appears on the screen


  @InvalidContinueFunctionality
  Scenario: Verify button Continue field without fill all form column lastName and form column portalCode
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
    When user fill firstName with "Kukuh"
    And user fill lastName with ""
    And user fill portalCode with ""
    Then user click button continue
    And verify that an error message appears on the screen