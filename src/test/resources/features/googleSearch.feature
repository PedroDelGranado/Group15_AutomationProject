
Feature: google search functionality
  Scenario: testing google search
    Given user is on google search page
    When user types in "Wooden Spoon" in searchbox
    Then user should see "Wooden Spoon" contained in title