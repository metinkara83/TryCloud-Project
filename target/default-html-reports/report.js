$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login happy path",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "User should navigate the website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.user_should_navigate_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User use the valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_use_the_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the following tittle\"Files - Trycloud\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_should_see_the_following_tittle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});