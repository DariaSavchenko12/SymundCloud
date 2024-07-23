@B34G7-228
Feature: As a user, I should be able to change profile info settings under the Profile module.

	#*Acceptance Criteria:*
	#
	#User can see at least following titles inside “Personal Info” under Profile Settings page;     => Full name/Email/Phone Number
  @B34G7-225
  Scenario Outline: Checking to see if Personal Info contains: Full name, Email, Phone Number
    Given "<userType>" is on the Symond home page
    When User clicks name icon
    And User clicks settings button
    Then User can see provided titles
    Examples:
      | userType |
      | users    |
      | employee |

	#*Acceptance Criteria:*
	#
	#Name of the user in the Settings field should be the same with Full Name input box
  @B34G7-226
  Scenario Outline: Checking if name of the user is the same in settings field and full name input box
    Given "<userType>" is on the Symond home page
    When User clicks name icon and records the name
    And User clicks settings button
    Then User compares specified names
    Examples:
      | userType |
      | users    |
      | employee |


	#*Acceptance Criteria:*
	#
	#User cannot pass any characters except numbers into the "Phone Number" input box.
  @B34G7-227
  Scenario Outline: Verifying Phone number input box only accepts numbers
    Given "<userType>" is on the Symond home page
    When User clicks name icon
    And User clicks settings button
    And User enters required data
    Then User asserts the input box only accepts numbers
    Examples:
      | userType |
      | users    |
      | employee |