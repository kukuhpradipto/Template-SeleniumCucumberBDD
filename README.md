# Saucedemo
### Selenium Framework with Cucumber

BDD framework for automation using Selenium Cucumber

The framework has following features

1. Modular Design
2. Maven based framework
3. Log4j enabled for logging
4. Report Generation (cucumber-reporting)
5. Helper class to handle web component such as (Button,Link etc)
6. Centralized Configuration (Using Properties file)
7. POM
8. Hooks for browser support using chrome

### Add the Feature file

Add the feature file under `features/Complete.feature`

```java
@Complete
  Feature: Completed order
         As a user I want to completed buy product 
      Scenario Outline: user completed order product 
        Given User open the website sauce demo
        When User input "standard_user" as userName and Input "secret_sauce" as password
        Then User already on landing page
        When User choose product list by "<produkList>"
        And User choice 2 product from the list "<produk>" and "<produkk>"
        Then User click on icon cart to verify product
        And User delete product "<deleteProduct>"
        And User click button checkout
        When User input Check Out Form in Firs Name "<firstName>", Last Name "<lastName>" and Partial Code "<partialCode>".
        And User verify nominal taxt
        And User verify Summary total Checkout
        And User click button finish
        Then User complete order

        Examples:
        | produk            | produkk                           | deleteProduct                     | produkList    | firstName | lastName | partialCode |
        | Sauce Labs Onesie | Test.allTheThings() T-Shirt (Red) | Test.allTheThings() T-Shirt (Red) | Name (Z to A) | kukuh     | pradipto | 12345       |
```

### To see this project and run this command:

`mvn clean`
and
`mvn test`



### Record run the testing https://youtu.be/ajfAbF5fl4c



## Cucumber Report

There is a feature statistics:

![feature statistics](https://user-images.githubusercontent.com/114077446/216812437-02ba2e15-bf3b-4672-b7cf-20635d672ed8.png)

There is a tag report:

![feature overview page](https://user-images.githubusercontent.com/114077446/216813113-05c6d6b8-8639-49e4-b646-118905be4b74.png)

There is a Tags Statistics:

![feature overview page](https://user-images.githubusercontent.com/114077446/216813250-12661a7b-915c-4354-b80c-880b421e37aa.png)


