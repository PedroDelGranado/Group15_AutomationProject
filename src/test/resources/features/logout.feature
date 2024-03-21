@fatma
Feature: Logout feature
  Background:
    Given user is already logged in
    When user clicks account name dropdown
    And user clicks the log out button


  Scenario: Log out function verification
    Then user can end up on log in page


    Scenario: Prevent back navigation after logout
      And user clicks the browser's back button
      Then user should not be able to access the dashboard page