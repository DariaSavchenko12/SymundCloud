@B34G7-240
Feature: Default

  @B34G7-239
  Scenario Outline: User can change Language.
    Given   the user logged in as "<userType>"
    When    user click to profile
    And     user click setting
    Then    User can change Language.
    Examples:
      | userType |
      | users    |
      | employee |


  @B34G7-238
  Scenario Outline: User can enter a proper e-mail to Email input box.
    Given   the user logged in as "<userType>"
    When    user click to profile
    And     user click setting
    Then    User enter a "user123@gmial.com" to Email input box.
    Examples:
      | userType |
      | users    |
      | employee |


  @B34G7-237
  Scenario Outline: Full name and username should be the same.
    Given   the user logged in as "<userType>"
    When    user click to profile
    And     user click setting
    Then    Full name and username should be the same.
    Examples:
      | userType |
      | users    |
      | employee |