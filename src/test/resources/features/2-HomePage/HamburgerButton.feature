@HamburgerButton @SauceDemo
Feature: Hamburger Button Functionality on Home Page

  Scenario: Verify menu item About field can to be click
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    When user click hamburger menu button
    And user click menu item About
    Then user navigate to web Saucelabs


  Scenario: Verify menu item Logout field can to be click
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    When user click hamburger menu button
    And user click menu item Logout
    Then user navigate to Login page


  Scenario: Verify menu item Reset App State field can to be click
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    When user choose product "Sauce Labs Backpack"
    And user choose product "Sauce Labs Bike Light"
    When user click hamburger menu button
    And user click menu item Reset App
    Then home page can to be reset