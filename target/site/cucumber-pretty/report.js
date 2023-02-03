$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Complete.feature");
formatter.feature({
  "line": 3,
  "name": "Completed order",
  "description": "",
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
  "duration": 2240282907,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user completed order product",
  "description": "",
  "id": "completed-order;user-completed-order-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and Input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User sort product list by \"Name (Z to A)\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User choice 2 product from the list",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on icon cart to verify product",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User delete product Test.allTheThings",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click button checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User input Check Out Form in Firs Name \"kukuh\", Last Name \"pradipto\" and Partial Code \"123\".",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User click button finish",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User complete order",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 498700995,
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
  "duration": 1535292899,
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
  "duration": 1155858565,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceBasket()"
});
formatter.result({
  "duration": 1140631173,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.clickIconsCart()"
});
formatter.result({
  "duration": 1079668209,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.clickOnDeleteProduct()"
});
formatter.result({
  "duration": 1044138279,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStep.clickOnCheckOut()"
});
formatter.result({
  "duration": 1059360005,
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
      "val": "123",
      "offset": 87
    }
  ],
  "location": "CheckOutFromStep.inputCheckOutForm(String,String,String)"
});
formatter.result({
  "duration": 2283404241,
  "status": "passed"
});
formatter.match({
  "location": "CompleteStep.clickOnBtnFinish()"
});
formatter.result({
  "duration": 2078253028,
  "status": "passed"
});
formatter.match({
  "location": "CompleteStep.verifyOnCheckOutCompletePage()"
});
formatter.result({
  "duration": 1000480778,
  "status": "passed"
});
formatter.after({
  "duration": 108741721,
  "status": "passed"
});
});