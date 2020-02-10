Feature: Login function

  @wip
  Scenario: Login happy path
  Given User should navigate the website
  When User use the valid credentials
  Then User should see the following title "Files - Trycloud"