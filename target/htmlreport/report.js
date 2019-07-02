$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/list.feature");
formatter.feature({
  "name": "search multiple items",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search products",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user searches for products",
  "rows": [
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "handbag"
      ]
    },
    {
      "cells": [
        "headphone"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Lists.user_searches_for_products(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify products displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Lists.verify_products_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close",
  "keyword": "Then "
});
formatter.match({
  "location": "Lists.close()"
});
formatter.result({
  "status": "passed"
});
});