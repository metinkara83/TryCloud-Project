Feature: Calender Page

  Background:user login the webpage
    Given User should navigate the website
    When User use the valid credentials

  @wip
  Scenario:Adding event to the calendar
    Given User should navigate to "Calender"page
    When User wants to create an event presses newCalender Button
    Then User gives name for the event and submits
    Then new event appears on the page