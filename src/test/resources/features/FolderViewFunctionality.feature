@FWF
Feature: Folder View Functionality

  Background:
    Given user is already logged in
    Then user click Files icon


    @1
    Scenario: User can change folder view order by Name
      Then user click the Name icon
      And user verify changing folder view by clicking Name icon

    @2
    Scenario: User can change folder view order by Size
      Then user click the Size icon
      And user verify changing folder view by clicking Size icon

    @3
    Scenario: User can change folder view order by Modified
      Then user click the Modified icon
      And user verify changing folder view by clicking Modified icon

    @4
    Scenario: User can select all the files at once and see the total values of all files in the first line when clicked on the “select all” checkbox at the left top corner of the list
      Then user click the “select all” checkbox at the left top corner of the list
      And user verify seeing the total values of all files in the first line
