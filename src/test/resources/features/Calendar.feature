Feature: Calendar module functionality

  Background:
    Given user is already logged in
    And user is already on calendar dashboard page

  @dailyDisplayVerification
    Scenario: Verify user can display daily calendar view
    When user clicks on more options tab on left
    And user clicks on day, week, month display option tab
    And user clicks on day option
    Then user should see calendar in daily view format and day in URL

