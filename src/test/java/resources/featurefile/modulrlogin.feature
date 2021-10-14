Feature: Modulr Customers Login Functionality

  @Sanity
  Scenario Outline: As a user I should login only with valid credentials
    Given user is on login in page
    When  user enters valid "<Username>" in the username field
    And user enters valid "<Password>" in the password field
    Then  user should be able to login securely
    And   user should see "<Error Message>" if valid credentials not entered or missing
    Examples:
      | Username       | Password       | Error Message                                                                                                                                                                                  |
      |                |                | This field is required                                                                                                                                                                         |
      | test@gmail.com |                | This field is required                                                                                                                                                                         |
      | test@gmail.com | geuogrg        | The username or password is incorrect.|
      |                | egnerugvjw     | This field is required                                                                                                                                                                         |
      | Mru.Pat0       | testModulr@123 |                                                                                                                                                                                                |


@Smoke
  Scenario: Reset password
   Given user is on login in page
    When user is clicks on Forgotten Password link
    Then user should be able to reset password via Reset access page
