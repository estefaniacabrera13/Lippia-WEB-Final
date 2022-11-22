#@Smoke @Login
Feature: Log In

  Background:
    Given The user is placed in the practice page
    And Click on My Account Menu

  @LoginErrors
  Scenario Outline: Log-in Handles case sensitive
    And Enter the case changed username <username> in the text box
    And Enter the case changed password <password> in the text box
    And Click on login button
    Then Login must fail and Proper error <mensaje> must be displayed

    Examples:
      | username          | password    | mensaje                                                                                               |
      | ESTEFANIA.CABRERA | CROWDAR2022 | Error: the password you entered for the username ESTEFANIA.CABRERA is incorrect. Lost your password? |


  Scenario Outline: Log-in Authentication
    And Enter the username <username> in the text box
    And Enter the password <password> in the text box
    And Click on login button
    And User must successfully login to the web page
    When Click on Logout button
    And Press the back button
    Then User shouldn’t be signed into his account
    Examples:
      | username          | password    |
      | estefania.cabrera | Crowdar2022 |

