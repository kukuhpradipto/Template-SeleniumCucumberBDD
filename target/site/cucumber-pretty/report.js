$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Sort Product",
  "description": "As a user I want to filled checkout form to click button checkout",
  "id": "sort-product",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HomePage"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User input first name, last name, and partial code in checkout form",
  "description": "",
  "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
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
  "name": "User choose product list by \"\u003cSort\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form;",
  "rows": [
    {
      "cells": [
        "Sort"
      ],
      "line": 11,
      "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form;;1"
    },
    {
      "cells": [
        "Price (low to high)"
      ],
      "line": 12,
      "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form;;2"
    },
    {
      "cells": [
        "Name (A to Z)"
      ],
      "line": 13,
      "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form;;3"
    },
    {
      "cells": [
        "Price (low to high)"
      ],
      "line": 14,
      "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form;;4"
    },
    {
      "cells": [
        "Name (A to Z)"
      ],
      "line": 15,
      "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1960850542,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User input first name, last name, and partial code in checkout form",
  "description": "",
  "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@HomePage"
    }
  ]
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
  "name": "User choose product list by \"Price (low to high)\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 297857230,
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
  "duration": 1226929685,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (low to high)",
      "offset": 29
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 2203439626,
  "status": "passed"
});
formatter.after({
  "duration": 106397551,
  "status": "passed"
});
formatter.before({
  "duration": 972524652,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User input first name, last name, and partial code in checkout form",
  "description": "",
  "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@HomePage"
    }
  ]
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
  "name": "User choose product list by \"Name (A to Z)\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 66314630,
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
  "duration": 1456577558,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (A to Z)",
      "offset": 29
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 2173335083,
  "status": "passed"
});
formatter.after({
  "duration": 101570247,
  "status": "passed"
});
formatter.before({
  "duration": 911140529,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User input first name, last name, and partial code in checkout form",
  "description": "",
  "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@HomePage"
    }
  ]
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
  "name": "User choose product list by \"Price (low to high)\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 48038493,
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
  "duration": 1355260887,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (low to high)",
      "offset": 29
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 2183510920,
  "status": "passed"
});
formatter.after({
  "duration": 101940516,
  "status": "passed"
});
formatter.before({
  "duration": 968506341,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User input first name, last name, and partial code in checkout form",
  "description": "",
  "id": "sort-product;user-input-first-name,-last-name,-and-partial-code-in-checkout-form;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@HomePage"
    }
  ]
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
  "name": "User choose product list by \"Name (A to Z)\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 80560901,
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
  "duration": 1338071647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (A to Z)",
      "offset": 29
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 2174827818,
  "status": "passed"
});
formatter.after({
  "duration": 101506178,
  "status": "passed"
});
});