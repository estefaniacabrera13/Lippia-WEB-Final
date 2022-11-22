@Smoke @MyAccount
Feature: My Account

  Background:
    Given The user is placed in the practice page
    And Click on My Account Menu

  @AccountDetails
  Scenario Outline: My Account - Account Details
    When Enter the username <username> in the text box
    And Enter the password <password> in the text box
    And Click on login button
    And Click on Account details
    Then User can view account details where he can change his password also
    Examples:
      | username          | password    |
      | estefania.cabrera | Crowdar2022 |

  @LogOut
  Scenario Outline: My Account - Log out
    When Enter the username <username> in the text box
    And Enter the password <password> in the text box
    And Click on login button
    And Click on Logout button
    Then User successfully comes out from the site and returns to login page
    Examples:
      | username          | password    |
      | estefania.cabrera | Crowdar2022 |