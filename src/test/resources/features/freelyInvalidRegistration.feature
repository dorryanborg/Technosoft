@invalid
Feature: Verify invalid email on registration

  Scenario Outline: Verify invalid email on registration
    Given I am on the Registration page
    When I enter name as user email as "<email>" password as password
    And I click on the submit button
    Then  I verify invalid email address

    Examples:
      | email |
      | test.com |
      | test@test@test.com |