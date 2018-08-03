@homepage
Feature: Verify posts on home page
  Scenario: Verify total number of posts on home page
    Given I am on home page of Threely
    Then I verify 67 total post is displayed
    And I verify all post has price tag
    And I verify all post has title
    Then  I verify all post has displayed image