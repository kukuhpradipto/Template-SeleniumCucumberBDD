@SortFunctionality @SauceDemo
Feature: Sort Functionality on Home Page

  Scenario: User input first name, last name, and partial code in checkout form
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    Then user choose product sort list "Price (low to high)"
    And verify that the products are sorted by price in descending order "Price (low to high)"


  Scenario: User input first name, last name, and partial code in checkout form
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    Then user choose product sort list "Name (A to Z)"
    And verify that the products are sorted by price in descending order "Name (A to Z)"


  Scenario: User input first name, last name, and partial code in checkout form
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    Then user choose product sort list "Price (high to low)"
    And verify that the products are sorted by price in descending order "Price (high to low)"


  Scenario: User input first name, last name, and partial code in checkout form
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    Then user choose product sort list "Name (Z to A)"
    And verify that the products are sorted by price in descending order "Name (Z to A)"
