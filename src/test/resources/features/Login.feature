Feature: Validate login functionality

  Scenario: Verify user can login with valid credentials
    Given user opens the website
    Then verify user is on login page
    When user enters username "valid.username" and password "valid.password"
    Then verify user is on home page

  Scenario: Verify locked out user cannot get access to the application
    Given user opens the website
    Then verify user is on login page
    When user enters username "locked.username" and password "valid.password"
    Then verify locked out user error message is displayed as below
      | Sorry, this user has been locked out. |

