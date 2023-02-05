@Sales
  Feature: sales flow
    As i user I want to add 2 product from landing page

  Scenario : User make a purchase with 2 item
    Given User open the website sauce demo
    When User input "standard_user" as userName and Input "secret_sauce" as password
    Then User already on landing page
    And User sort product list by "<ProductCOntainer>"
    And User choice 2 product from the list


