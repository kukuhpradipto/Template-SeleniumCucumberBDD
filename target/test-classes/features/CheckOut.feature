@Checkout
  Feature: Checkout flow
    As a user I want to check out product

    Scenario:
      Given User open the website sauce demo
      When User input "standard_user" as userName and Input "secret_sauce" as password
      Then User already on landing page
      And User sort product list by "Name (Z to A)"
      And User choice 2 product from the list
      And User click on icon cart to verify product
      Then User delete product "<deleteProduct>"
      And User click button checkout

