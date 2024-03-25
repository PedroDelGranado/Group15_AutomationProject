@FMF
Feature: Upload/Edit/Delete File Module Functionality

  Background:
    Given user is already logged in
    When user click Files icon

  @1
  Scenario: User can upload a file
    When the user clicks plus sign
    And the user upload a file by using Upload file
    Then the uploaded file should be visible in the files list

  @2
  Scenario: User can create a new folder
    When the user clicks plus sign and New Folder button
    And the user enters a folder "UserStory002" and confirms the creation
    Then the new folder name "UserStory002" should be visible in the files list

  @3
  Scenario: User can delete any selected item from its three dots menu
    When the user clicks the three dots menu for the selected item
    And the user click Delete option
    Then the selected item "UserStory002" should no longer be visible in the files list

  @4
  Scenario: User can see the total number of files and folders under the files list table
    Then the user should see the total number of files and folders displayed