@CheckoutForm
Feature: Input Checkout Form flow

  Scenario: User input first name, last name, and partial code in checkout form
    Given User open the website sauce demo
    When User input "standard_user" as userName and Input "secret_sauce" as password
    And User sort product list by "Name (Z to A)"
    And User choice 2 product from the list
    And User click on icon cart to verify product
    And User click button checkout
    Then User input Check Out Form in Firs Name "kukuh", Last Name "pradipto" and Partial Code "123".
