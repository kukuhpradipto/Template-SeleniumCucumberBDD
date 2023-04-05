@Regrssion

  Feature: Completed order
    As a user I want to completed buy product

    Scenario Outline: user completed order product
      Given User open the website sauce demo
      When User input "standard_user" as userName and Input "secret_sauce" as password
      Then User already on landing page
      When User choose product list by "<produkList>"
      And User choice 2 product from the list "<product>" and "<product2>"
      Then User click on icon cart to verify product
      And User delete product "<deleteProduct>"
      And User click button checkout
      When User input Check Out Form in Firs Name "<firstName>", Last Name "<lastName>" and Partial Code "<partialCode>".
      And User verify nominal taxt
      And User verify Summary total Checkout
      And User click button finish
      Then User complete order

      Examples:
        | product           | product2                          | deleteProduct                     | produkList          | firstName | lastName | partialCode |
        | Sauce Labs Onesie | Test.allTheThings() T-Shirt (Red) | Test.allTheThings() T-Shirt (Red) | Price (low to high) | kukuh     | pradipto | 12345       |

