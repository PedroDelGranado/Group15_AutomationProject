Feature: Trycloud login page functionality
  User Story:
  As a user, I should be able to log in.

  @B32G15-197 @wip
  Scenario: User can login with valid credentials by Login button
    Given User on the login page of the Trycloud application
    When User enters correct username
    And User enters correct password
    And User click on the Login button
    Then User should see the dashboard page

  @B32G15-197 @wip
  Scenario: User can see his name under the profile Icon
    Given User is logged in
    And User click on the profile icon
    Then User should be able to see user's name "Employee14"

  @B32G15-197 @wip
  Scenario: User can login with valid credentials by Enter key
    Given User on the login page of the Trycloud application
    When User enters correct username
    And User enters correct password
    And User hits the Enter key
    Then User should see the dashboard page

  @B32G15-198 @wip
  Scenario Outline: User enters invalid credentials
    Given User on the login page of the Trycloud application
    When User enters wrong username "<name>"
    And User enters wrong password "<password>"
    And User click on the Login button
    Then User should see error message "Wrong username or password."
    Examples:
      | name        | password     |
      | Employee1   | Employee 321 |
      | Employee14  | Employee321  |
      | Employee333 | Employee123  |

  @B32G15-198 @wip
  Scenario: User didn't enter username
    Given User on the login page of the Trycloud application
    When Username is blank
    And User click on the Login button
    Then User should be able to see the message "Please fill out this field." in the username input box

  @B32G15-198 @wip
  Scenario: User didn't enter password
    Given User on the login page of the Trycloud application
    When password is blank
    And User click on the Login button
    Then User should be able to see the message "Please fill out this field." in the password input box

  @B32G15-199 @wip
  Scenario: User enters password and sees dots by default
    Given User on the login page of the Trycloud application
    When User enters password "Employee123"
    Then User should see the password displayed as dots

  @B32G15-200 @wip
  Scenario: User can see the password explicitly if needed
    Given User on the login page of the Trycloud application
    When User enters password "Employee123"
    And User chooses to show the password
    Then User should see the password "Employee123" displayed in plain text

  @B32G15-201 @wip
  Scenario: User can reset password via "Forgot password?" link
    Given User on the login page of the Trycloud application
    When User sees the Forgot password? Link
    And User clicks on the Forgot password? Link
    Then User sees the Reset Password button

  @B32G15-202 @wip
  Scenario: User can see valid placeholders on Username and Password fields
    Given User on the login page of the Trycloud application
    Then User can see valid placeholders on Username and Password fields
