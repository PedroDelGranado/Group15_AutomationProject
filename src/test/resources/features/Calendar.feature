Feature: Calendar module functionality

  Background:
    Given user is already logged in
    And user is already on calendar dashboard page
    When user clicks on more options tab on left

  @dailyDisplayVerification
    Scenario: Verify user can display daily calendar view
    And user clicks on day, week, month display option tab
    And user clicks on day option
    Then user should see calendar in daily view format and day in URL

  @weeklyDisplayVerification
  Scenario: Verify user can display weekly calendar view
    And user clicks on day, week, month display option tab
    And user clicks on week option
    Then user should see calendar in weekly view format and week in URL


  @monthlyDisplayVerification
  Scenario: Verify user can display monthly calendar view
    And user clicks on day, week, month display option tab
    And user clicks on month option
    Then user should see calendar in monthly view format and month in URL