@login
Feature: Valid login scenario automation
  Scenario: Verify valid login
    Given User is on the Threely login page
    When I enter username as “<user>” and password as “<password>”
    And I click on submit button
    Then I verify logout button is displayed
