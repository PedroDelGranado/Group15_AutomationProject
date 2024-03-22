@job
Feature: changes as adding/rename/commenting in to favorites file,

  Background:
    Given user is already logged in
    When user click on files

  Scenario: As a user, I should be able to add a file to favorites
    And user click on the three dots on the right
    And User click on add to favorites from its own three dots menu.
    Then User can see the added file on the menu


  Scenario Outline:As a user, I should be able to rename any file to favorites
    And user click on the three dots on the right
    And user click on rename button
    And User rename any "<file>" from its own three dots menu
    Then User will be able to see the new "<file>"
    Examples:
      | file |
      | Nice |


  Scenario: As a user, I should be able to give comments on any file.
    And user click on the three dots on the right
    And user leave comments on new comments section
    Then User can see the given comments on the file