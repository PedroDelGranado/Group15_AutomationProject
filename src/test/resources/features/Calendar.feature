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

@createNewEventVerification
 Scenario: User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
   And user clicks on new event button
  And user enters "Sprint 3" into event title text box
  And user selects all day checkbox
  And user selects a date from calendar
  And user clicks save button
  Then user should see "Sprint 3" displayed on monthly view calendar


  @createNewRandomEventVerification
  Scenario: User can create a new event under the Calendar module with any random date and see it displayed in monthly view
    And user clicks on new event button
    And user enters "Regression Suite" into event title text box
    And user selects all day checkbox
    And user selects a date from calendar by typing "03/28/2024" into from box
    And user clicks save button
    Then user should see "Regression Suite" displayed on monthly view calendar