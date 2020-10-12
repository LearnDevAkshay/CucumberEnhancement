$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dynamicTable.feature");
formatter.feature({
  "line": 1,
  "name": "Handle Dynamic Table",
  "description": "",
  "id": "handle-dynamic-table",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Get The Details from Dynamic Table",
  "description": "",
  "id": "handle-dynamic-table;get-the-details-from-dynamic-table",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Pratice"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page of Dynamic Table",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Get the Details",
  "keyword": "Then "
});
formatter.match({
  "location": "DynamicTableStepDefination.user_is_on_Home_Page_of_Dynamic_Table()"
});
formatter.result({
  "duration": 10594423800,
  "status": "passed"
});
formatter.match({
  "location": "DynamicTableStepDefination.get_the_Details()"
});
formatter.result({
  "duration": 290975800,
  "status": "passed"
});
formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for vegitable",
  "description": "",
  "id": "search-and-place-order-for-vegitable",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Serach for vegatble and validate",
  "description": "",
  "id": "search-and-place-order-for-vegitable;serach-for-vegatble-and-validate",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the \"Cucumber\" in search box",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Cucumber\" result should be dispalyed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 7547793900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 16
    }
  ],
  "location": "SearchStepDefination.user_enter_the_in_search_box(String)"
});
formatter.result({
  "duration": 1648255400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "SearchStepDefination.result_should_be_dispalyed(String)"
});
formatter.result({
  "duration": 48176600,
  "status": "passed"
});
});