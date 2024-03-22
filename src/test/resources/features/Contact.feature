@B32G15-193
Feature: Default

  Background:
    Given user already loged into the dachboard page
    When user click on contact module

  @B32G15-181
  Scenario Outline: User can create a new contact
    And user click on New contact
    And user type the "<name>" and the "<lastName>" of the new contact
    And user click on all contact page
    Then user should see "<expectedContacts>" the contact appear in all the contact list

    Examples:

      | name  | lastName | expectedContacts |
      | Steve | Jobs     | Steve Jobs       |
      | Max   | Planck   | Max Planck       |

  @allContact
  Scenario: User can see all the contacts as a list inside the middle column and total number of the contacts
  near the “All Contacts” tab
    Then user can see all the contacts as a list inside the middle column And total number of the contacts near the “All Contacts” tab









