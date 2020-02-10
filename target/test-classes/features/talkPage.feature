Feature: Talk Page Connection
  Background: Login page
    Given User should navigate the website
    Then User use the valid credentials

    @wip
  Scenario: connection to Talk page
    Given user connect to talk page
    Then verify that Join a conversation or start a new one message shows