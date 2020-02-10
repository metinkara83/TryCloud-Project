$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/files.feature");
formatter.feature({
  "name": "Users should be add new file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as a user and add new file",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@cagri"
    }
  ]
});
formatter.before({
  "status": "passed"
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
  "name": "the user add new files",
  "keyword": "Then "
});
formatter.match({
  "location": "FilesStepDef.the_user_add_new_files()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});