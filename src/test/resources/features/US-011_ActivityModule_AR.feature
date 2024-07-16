@US-011
Feature: Symund cloud application activity functionality
  Agile Story: As a user, I should be able to see listed items under the Activity module.

  @B34G7-211
  Scenario Outline: Verify users can see all the displayed items
    Given "<usertype>" is logged in
    Then user clicks on the Activity module
    And user lands on Activities page
    Then user is able to see all items links displayed
    Examples:
      | usertype |
      | users    |
      | employee |


  @B34G7-212
  Scenario Outline: Verify users can see all items ordered
    Given "<usertype>" is logged in
    Then user clicks on the Activity module
    And user lands on Activities page
    Then user can see all items list ordered by newest to oldest.
    Examples:
      | usertype |
      | users    |
      | employee |

  @B34G7-213
  Scenario Outline: Verify No more events is displayed
    Given "<usertype>" is logged in
    Then user clicks on the Activity module
    And user lands on Activities page
    Then user can see No more events to load message at the end of the All Activities tab.
    Examples:
      | usertype |
      | users    |
      | employee |
