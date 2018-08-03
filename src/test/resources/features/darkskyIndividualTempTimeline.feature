@individualtemp
Feature: Verify individual day temp timeline
  Scenario: Verify individual day temp timeline
    Given I am on the Darksky Home Page
    When I expand todays timeline
    Then I verify lowest and highest temp is displayed correctly


