Feature: Users should be add new file
  @cagri
  Scenario: Login as a user and add new file
    Given User should navigate the website
    When User use the valid credentials
    Then the user add new files
