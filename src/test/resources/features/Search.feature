@derya
Feature: Search functionality in Dashboard

  Background:
    Given user is already logged in


  Scenario Outline: User searches for a by name
    And the user clicks on the magnifying glass icon in "<module>"
    And enter the name of the the search field "<itemName>"
    When the user clicks on a specific "<itemName>" from the search results
    Then the user should be redirected to the details page of the "<itemName>"


    Examples:
      | module | itemName |
     # | Files  | Talk     |
      | Dashboard | Example  |

    #========== 2.part ========
  @2.part
  Scenario: User navigates to Dashboard page by clicking App icon
    When the user clicks on the App icon at the top left corner of the page
    Then the user should be redirected to the Dashboard page


