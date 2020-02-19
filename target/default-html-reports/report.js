$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/deck.feature");
formatter.feature({
  "name": "Deck Page",
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
  "name": "Creating new board",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wipDeck"
    }
  ]
});
formatter.step({
  "name": "User should navigate to \"Deck\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "DeckStepDefs.user_should_navigate_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the create new board text",
  "keyword": "When "
});
formatter.match({
  "location": "DeckStepDefs.user_clicks_the_create_new_board_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters a title in the box",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckStepDefs.user_enters_a_title_in_the_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects green color and click the ok sign",
  "keyword": "Then "
});
formatter.match({
  "location": "DeckStepDefs.user_selects_green_color_and_click_the_ok_sign()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});