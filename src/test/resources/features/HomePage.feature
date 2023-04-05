@HomePage
Feature: Sort list product
  As a user I want to sort product

  Scenario Outline: User input first name, last name, and partial code in checkout form
    Given User open the website sauce demo
    When User input "standard_user" as userName and Input "secret_sauce" as password
    Then User choose product list by "<Sort>"

    Examples:
      | Sort                |
      | Price (low to high) |
      | Name (A to Z)       |
      | Price (low to high) |
      | Name (A to Z)       |
