$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/talkPage.feature");
formatter.feature({
  "name": "Talk Page Connection",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Login page",
  "description": "",
  "keyword": "Background"
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
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.user_use_the_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "connection to Talk page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user connect to talk page",
  "keyword": "Given "
});
formatter.match({
  "location": "TalkPageStepDefs.user_connect_to_talk_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that Join a conversation or start a new one message shows",
  "keyword": "Then "
});
formatter.match({
  "location": "TalkPageStepDefs.verify_that_Join_a_conversation_or_start_a_new_one_message_shows()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});