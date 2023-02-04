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
formatter.before({
  "duration": 3965168643,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "user completed order product",
  "description": "",
  "id": "completed-order;user-completed-order-product",
  "type": "scenario",
  "keyword": "Scenario"
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
  "line": 11,
  "name": "User choice 2 product from the list",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on icon cart to verify product",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User delete product Test.allTheThings",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User click button checkout",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User input Check Out Form in Firs Name \"Kukuh\", Last Name \"Pradipto\" and Partial Code \"123\".",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User verify Summary total Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click button finish",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User complete order",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 222295710,
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
  "duration": 1316728228,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 47281120,
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
  "duration": 1169267501,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceBasket()"
});
formatter.result({
  "duration": 1130985828,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.clickIconsCart()"
});
formatter.result({
  "duration": 1074129252,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.clickOnDeleteProduct()"
});
formatter.result({
  "duration": 1053777619,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.clickOnCheckOut()"
});
formatter.result({
  "duration": 1062197855,
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
  "duration": 2310638717,
  "status": "passed"
});
formatter.match({
  "location": "CompleteStep.verifyNominalTotal()"
});
formatter.result({
  "duration": 84214540,
  "status": "passed"
});
formatter.match({
  "location": "CompleteStep.clickOnBtnFinish()"
});
formatter.result({
  "duration": 5085623632,
  "status": "passed"
});
formatter.match({
  "location": "CompleteStep.verifyOnCheckOutCompletePage()"
});
formatter.result({
  "duration": 1000473791,
  "status": "passed"
});
formatter.after({
  "duration": 108383191,
  "status": "passed"
});
});