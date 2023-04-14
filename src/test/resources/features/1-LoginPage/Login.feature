@Login @SauceDemo
  Feature: Button Login Functionality on Login Page

    Scenario: Verify button login field with registered userName and registered password
     Given user already on the login page
     When user fill userName with "standard_user"
     And user fill password with "secret_sauce"
     Then user click button login
     And user navigate to home page


    Scenario: Verify button login field with registered userName and unregistered password
      Given user already on the login page
      When user fill userName with "standard_user"
      And user fill password with "abogoboga"
      Then user click button login
      And verify that an error message "Epic sadface: Username and password do not match any user in this service" appears on the screen


    Scenario: Verify button login field with unregistered email and registered password
      Given user already on the login page
      When user fill userName with "makanMalam"
      And user fill password with "secret_sauce"
      Then user click button login
      And verify that an error message "Epic sadface: Username and password do not match any user in this service" appears on the screen


    Scenario: Verify button login field without fill userName
      Given user already on the login page
      When user fill userName with ""
      And user fill password with "secret_sauce"
      Then user click button login
      And verify that an error message "Epic sadface: Username is required" appears on the screen


    Scenario: Verify button login field without fill password
      Given user already on the login page
      When user fill userName with "standard_user"
      And user fill password with ""
      Then user click button login
      And verify that an error message "Epic sadface: Password is required" appears on the screen