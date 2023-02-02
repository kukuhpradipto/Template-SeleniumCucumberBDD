$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Sales.feature");
formatter.feature({
  "line": 2,
  "name": "sales flow",
  "description": "",
  "id": "sales-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sales"
    }
  ]
});
formatter.before({
  "duration": 2211933201,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User make a purchase with 2 item",
  "description": "",
  "id": "sales-flow;user-make-a-purchase-with-2-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User input \"standard_user\" as userName and Input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User already on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User sort product list by \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User choice 2 product from the list",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 379579885,
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
  "duration": 835985033,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 112583401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 27
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 2160910638,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceBasket()"
});
formatter.result({
  "duration": 3093080887,
  "status": "passed"
});
formatter.after({
  "duration": 1114213251,
  "status": "passed"
});
});