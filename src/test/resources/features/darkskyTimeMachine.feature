@timemachine
Feature: Verify Time Machine is selected to today
  Scenario: Verify Time Machine Calendar
    Given I am on  Darksky home page
    When I click on Time Machine
    Then I verify date is selected to todays date