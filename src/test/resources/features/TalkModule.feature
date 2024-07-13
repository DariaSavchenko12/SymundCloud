@B34G7-223
Feature: #*User Story :*
	#As a user, I should be able to create a new conversation, add participant under the Talk module
	#*Acceptance Criteria:*
	#User can create a new conversation by adding any selected participant
  @B34G7-188
  Scenario Outline: Creating a new conversation for a user
    Given "<userType>" is on the Symond home page
    When "User clicks talk button
    And User clicks create new conversation button
    When User types My Conversation in conversation name
    And User checks join via link checkbox
    And User clicks on add participants button
    When User clicks on a random participant
    And User clicks on create conversation button
    And User clicks close on the pop up window
    Then User can see created conversation on the list
    Examples:
      | userType |
      | users    |
      | employee |

	#*User Story :*
	#As a user, I should be able to create a new conversation, add participant under the Talk module
	#*Acceptance Criteria:*
	#User can delete a conversation
  @B34G7-189
  Scenario Outline: Delete an existing conversation
    Given "<userType>" is on the Symond home page
    When User clicks talk button
    And User clicks three dots button
    And User clicks delete conversation
    And User clicks yes on the pop up
    Then The conversation should not be visible
    Examples:
      | userType |
      | users    |
      | employee |