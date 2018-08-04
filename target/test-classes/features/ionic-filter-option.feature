@filteroption
Feature: User should be able filter options
  Scenario: User should be able to reset filter and verify all options are enabled
    Given I am on a home page of the app
    When I click on filter button
    And I disable "Angular" option
    And I click on All Reset Filer button
    Then I verify all options are enabled