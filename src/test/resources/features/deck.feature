
  Feature: Deck Page
    Background: Login page
      Given User should navigate the website
      Then User use the valid credentials

      @wipDeck
      Scenario: Creating new board
        Given User should navigate to "Deck" page
        When User clicks the create new board text
        Then User enters a title in the box
        Then User selects green color and click the ok sign
