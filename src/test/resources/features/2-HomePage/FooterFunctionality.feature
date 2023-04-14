@FooterFunctionality @SauceDemo
Feature: Footer Functionality on Footer Home Page

  Scenario: Verify icon Twitter field can to be click
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    When user click icon Twitter on the footer
    Then user navigate on the home page twitter


  Scenario: Verify icon Twitter field can to be click
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    When user click icon Facebook on the footer
    Then user navigate on the home page facebook


  Scenario: Verify icon Linkedin field can to be click
    Given user already on the login page
    When user fill userName with "standard_user"
    And user fill password with "secret_sauce"
    Then user click button login
    And user navigate to home page
    When user click icon Linkedin on the footer
    Then user navigate on the home page linkedin