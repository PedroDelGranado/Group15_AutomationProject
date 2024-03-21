@US-014
Feature: Check/Change Profile Settings Functionality

  User Story :
  As a user, I should be able to check or change profile info settings under the Profile module

  Background:
    Given user is already logged in

  @dilarawip
  Scenario: Matching Full name and Username Verification
    When user clicks on Settings under Profile section
    Then the Full name displayed should be the same as the Username

  Scenario: Valid Email Input Verification
    When user clicks on Settings under Profile section
    Then user should be able to input a valid Email Address
      | employee14@gmail.com   |
      | employee14@hotmail.org |



  Scenario Outline: Language Selection from Dropdown
    When user clicks on Settings under Profile section
    And user selects "<language>" from dropdown
    Then the selected "<language>" should be displayed
    Examples:
      | language         |
      | English (US)     |
      | Italiano         |
      | Japanese (日本語)   |
      | Español (México) |









