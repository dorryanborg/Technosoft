@search
Feature: User should be search for event
  Scenario: Verify user should be able to search for event
    Given I am on homepage of the app
    When Search for "Breakfast"
    Then I verify Event displayed with header, Duration, description



