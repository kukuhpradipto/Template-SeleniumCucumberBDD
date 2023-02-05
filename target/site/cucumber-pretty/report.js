$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Complete.feature");
formatter.feature({
  "line": 3,
  "name": "Completed order",
  "description": "As a user I want to completed buy product",
  "id": "completed-order",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Complete"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "user completed order product",
  "description": "",
  "id": "completed-order;user-completed-order-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User input \"standard_user\" as userName and Input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User already on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User sort product list by \"Name (Z to A)\"",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#      And User choice 2 product from the list"
    }
  ],
  "line": 12,
  "name": "User choice 2 product from the list \"\u003cproduk1\u003e\" and \"\u003cproduk2\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click on icon cart to verify product",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#      Then User delete product Test.allTheThings"
    }
  ],
  "line": 15,
  "name": "User delete product \"\u003cdeleteProduct\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User click button checkout",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User input Check Out Form in Firs Name \"Kukuh\", Last Name \"Pradipto\" and Partial Code \"123\".",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User verify nominal taxt",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User verify Summary total Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click button finish",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User complete order",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "completed-order;user-completed-order-product;",
  "rows": [
    {
      "cells": [
        "produk1",
        "produk2",
        "deleteProduct"
      ],
      "line": 24,
      "id": "completed-order;user-completed-order-product;;1"
    },
    {
      "cells": [
        "Sauce Labs Onesie",
        "Test.allTheThings() T-Shirt (Red)",
        "Test.allTheThings() T-Shirt (Red)"
      ],
      "line": 25,
      "id": "completed-order;user-completed-order-product;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1940492287,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "user completed order product",
  "description": "",
  "id": "completed-order;user-completed-order-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Complete"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User input \"standard_user\" as userName and Input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User already on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User sort product list by \"Name (Z to A)\"",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#      And User choice 2 product from the list"
    }
  ],
  "line": 12,
  "name": "User choice 2 product from the list \"Sauce Labs Onesie\" and \"Test.allTheThings() T-Shirt (Red)\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click on icon cart to verify product",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#      Then User delete product Test.allTheThings"
    }
  ],
  "line": 15,
  "name": "User delete product \"Test.allTheThings() T-Shirt (Red)\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User click button checkout",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User input Check Out Form in Firs Name \"Kukuh\", Last Name \"Pradipto\" and Partial Code \"123\".",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User verify nominal taxt",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User verify Summary total Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click button finish",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User complete order",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 352093459,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 1454056068,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 42993477,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 27
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 1099906114,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceBasket()"
});
formatter.result({
  "duration": 1081761296,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.clickIconsCart()"
});
formatter.result({
  "duration": 1058838252,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test.allTheThings() T-Shirt (Red)",
      "offset": 21
    }
  ],
  "location": "CheckoutStep.deleteProduct(String)"
});
formatter.result({
  "duration": 1023076287,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.clickOnCheckOut()"
});
formatter.result({
  "duration": 1055252480,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kukuh",
      "offset": 40
    },
    {
      "val": "Pradipto",
      "offset": 59
    },
    {
      "val": "123",
      "offset": 87
    }
  ],
  "location": "CheckOutFromStep.inputCheckOutForm(String,String,String)"
});
formatter.result({
  "duration": 2260087139,
  "status": "passed"
});
formatter.match({
  "location": "CompleteStep.verifyNominalTax()"
});
formatter.result({
  "duration": 54001389,
  "status": "passed"
});
formatter.match({
  "location": "CompleteStep.verifyNominalTotal()"
});
formatter.result({
  "duration": 42061018,
  "status": "passed"
});
formatter.match({
  "location": "CompleteStep.clickOnBtnFinish()"
});
formatter.result({
  "duration": 5074753732,
  "status": "passed"
});
formatter.match({
  "location": "CompleteStep.verifyOnCheckOutCompletePage()"
});
formatter.result({
  "duration": 1000541053,
  "status": "passed"
});
formatter.after({
  "duration": 108623296,
  "status": "passed"
});
});