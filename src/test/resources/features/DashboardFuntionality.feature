@wip
Feature: DashboardPage functionality

  Background:
    Given user is already logged in

  Scenario:After Login user can see all modules and Username
    Then user should be able to see following modules
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |
    And user should be able to see username in settings menu


  Scenario: User can click on Customize button and select any of the Widgets
    When user clicks customize button
    Then user can see following widgets
      | Status            |
      | Weather           |
      | Upcoming cards    |
      | Upcoming events   |
      | Recommended files |
      | Talk mentions     |
      | Recent statuses   |
    And user selects any of widgets


  Scenario: User can click on Set Status button and select any of the Status options
    When user clicks on set status button
    Then user should be able to see following status options
      | Online                                 |
      | Away                                   |
      | Do not disturb\nMute all notifications |
      | Invisible\nAppear offline              |
    And user can select any of the status options
