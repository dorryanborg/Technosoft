$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ionic-filter-option.feature");
formatter.feature({
  "line": 2,
  "name": "User should be able filter options",
  "description": "",
  "id": "user-should-be-able-filter-options",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@filteroption"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to reset filter and verify all options are enabled",
  "description": "",
  "id": "user-should-be-able-filter-options;user-should-be-able-to-reset-filter-and-verify-all-options-are-enabled",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on a home page of the app",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on filter button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I disable \"Angular\" option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on All Reset Filer button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify all options are enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "IonicFilterOptionSD.i_am_on_a_home_page_of_the_app()"
});
formatter.result({
  "duration": 19361101504,
  "status": "passed"
});
formatter.match({
  "location": "IonicFilterOptionSD.i_click_on_filter_button()"
});
formatter.result({
  "duration": 473709532,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Angular",
      "offset": 11
    }
  ],
  "location": "IonicFilterOptionSD.i_disable_option(String)"
});
formatter.result({
  "duration": 811785703,
  "status": "passed"
});
formatter.match({
  "location": "IonicFilterOptionSD.i_click_on_All_Reset_Filer_button()"
});
formatter.result({
  "duration": 701410345,
  "status": "passed"
});
formatter.match({
  "location": "IonicFilterOptionSD.i_verify_all_options_are_enabled()"
});
formatter.result({
  "duration": 1458320232,
  "status": "passed"
});
});