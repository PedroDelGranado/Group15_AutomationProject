@B32G15-171
Feature: Check/Change Profile Settings Functionality

  User Story :
  As a user, I should be able to check or change profile info settings under the Profile module

  Background:
    Given user is already logged in
    When user clicks on Settings under Profile Module


  Scenario: Full Name and Username Verification
    Then user should see Full name is same as Username


  Scenario: Correct Email Input Verification
    Then user should be able to enter a Valid Email Address

  Scenario Outline: Profile Settings
    And user selects "<language>" from language dropdown
    Then user should be able to see "<language>"
    Examples:
      | language         |
      | English (US)     |
      | Japanese         |
      | Italiano         |
      | Español (México) |







