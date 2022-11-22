#@Smoke @Registration
Feature: Registration

  @RegistrationErrors
  Scenario Outline: Registration Error warning
    Given The user is placed in the practice page
    When Click on My Account Menu
    And Enter the username <username> in the registration email textbox
    And Enter the password <password> in the registration password textbox
    And Click on Register button
    Then Registration must fail with a warning message <warning>

    Examples:
      | username                    | password | warning                                      |
      | estefania@crowdaronline.com |          | Error: Please enter an account password.     |
      |                             |          | Error: Please provide a valid email address. |