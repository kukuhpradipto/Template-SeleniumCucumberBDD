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
  "name": "User choose product list by \"\u003cprodukList\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User choice 2 product from the list \"\u003cproduk\u003e\" and \"\u003cprodukk\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on icon cart to verify product",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User delete product \"\u003cdeleteProduct\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click button checkout",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User input Check Out Form in Firs Name \"\u003cfirstName\u003e\", Last Name \"\u003clastName\u003e\" and Partial Code \"\u003cpartialCode\u003e\".",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User verify nominal taxt",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User verify Summary total Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click button finish",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User complete order",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "completed-order;user-completed-order-product;",
  "rows": [
    {
      "cells": [
        "produk",
        "produkk",
        "deleteProduct",
        "produkList",
        "firstName",
        "lastName",
        "partialCode"
      ],
      "line": 22,
      "id": "completed-order;user-completed-order-product;;1"
    },
    {
      "cells": [
        "Sauce Labs Onesie",
        "Test.allTheThings() T-Shirt (Red)",
        "Test.allTheThings() T-Shirt (Red)",
        "Name (Z to A)",
        "kukuh",
        "pradipto",
        "12345"
      ],
      "line": 23,
      "id": "completed-order;user-completed-order-product;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3019308241,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
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
  "name": "User choose product list by \"Name (Z to A)\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User choice 2 product from the list \"Sauce Labs Onesie\" and \"Test.allTheThings() T-Shirt (Red)\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on icon cart to verify product",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User delete product \"Test.allTheThings() T-Shirt (Red)\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click button checkout",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User input Check Out Form in Firs Name \"kukuh\", Last Name \"pradipto\" and Partial Code \"12345\".",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User verify nominal taxt",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User verify Summary total Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click button finish",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User complete order",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 290535134,
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
  "duration": 1270195714,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 37188464,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 29
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 1101105919,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceBasket()"
});
formatter.result({
  "duration": 1100786299,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickIconsCart()"
});
formatter.result({
  "duration": 1060376795,
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
  "duration": 1047152245,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.clickOnCheckOut()"
});
formatter.result({
  "duration": 1054599296,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kukuh",
      "offset": 40
    },
    {
      "val": "pradipto",
      "offset": 59
    },
    {
      "val": "12345",
      "offset": 87
    }
  ],
  "location": "CheckoutStep.input(String,String,String)"
});
formatter.result({
  "duration": 230757347,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.verifyNominalTax()"
});
formatter.result({
  "duration": 43548536,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.verifyNominalTotal()"
});
formatter.result({
  "duration": 40554487,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.clickOnBtnFinish()"
});
formatter.result({
  "duration": 5080347470,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.verifyOnCheckOutCompletePage()"
});
formatter.result({
  "duration": 1001059376,
  "status": "passed"
});
formatter.after({
  "duration": 109610327,
  "status": "passed"
});
});