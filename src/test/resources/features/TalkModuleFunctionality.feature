@wip
Feature: Talk Module Functionality

  Background:

    Given user is already logged in
    When click "Talk" module on app menu

  Scenario Outline:User can create a new conversation by adding any selected participant
    When Click create a new group conversation button
    And Enter conversation name "<conversationName>" in input box
    And Select allow guests to join via link checkbox
    And Click add participants button
    And Enter user "<userName>" in Search participants input box
    And Select user from the list in pop-up
    And Click Create conversation button
    And Click close button in the pop-up
    Then Check if the new conversation "<conversationName>" displays in the list

    Examples:
      | conversationName    | userName   |
      | Test conversation   | Employee10 |
      | Test conversation 2 | Employee12 |
      | Test conversation 3 | Employee13 |


  Scenario: User can delete a conversation
    When user click option button on the conversation items
    And select Delete conversation option
    And Click yes button in the pop-up
    Then check if the conversation is deleted








