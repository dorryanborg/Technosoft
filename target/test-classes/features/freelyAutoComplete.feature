@autocomplete
Feature: Auto Complete
  Scenario: Verify auto complete search result
    Given I am on home page
    When I search on top search bar with text "ios"
    Then I verify "Title: I will teach you IOS" as displayed result