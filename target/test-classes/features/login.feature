Feature: Login function

  Scenario: Login happy path
  Given User should navigate the website
  When User use the valid credentials
  Then User should see the following tittle"Files - Trycloud"