$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Calendar.feature");
formatter.feature({
  "name": "Calender Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@calendar"
    }
  ]
});
formatter.background({
  "name": "user login the webpage",
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
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_use_the_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding event to the calendar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar"
    },
    {
      "name": "@one"
    }
  ]
});
formatter.step({
  "name": "User should navigate to \"Calender\"page",
  "keyword": "Given "
});
formatter.match({
  "location": "CalendarStepDefs.user_should_navigate_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User wants to create an event presses newCalender Button",
  "keyword": "When "
});
formatter.match({
  "location": "CalendarStepDefs.user_wants_to_create_an_event_presses_newCalender_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User gives name for the event and submits",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarStepDefs.user_gives_name_for_the_event_and_submits()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new event appears on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarStepDefs.new_event_appears_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user login the webpage",
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
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.user_use_the_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "day/week/month visible",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@calendar"
    },
    {
      "name": "@two"
    }
  ]
});
formatter.step({
  "name": "User should navigate to \"Calender\"page",
  "keyword": "Given "
});
formatter.match({
  "location": "CalendarStepDefs.user_should_navigate_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Day, week, month, will be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "CalendarStepDefs.day_week_month_will_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});