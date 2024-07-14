@US-012
Feature: Default
	Background: User is already in the log in page
		Given the user is on the login page
		Then the user logged in as "users"
		And user click on the Files button

	
	@B34G7-241
	Scenario: User can add any file to favorites from its own three dots menu.
		Given the user click on the three dots of the file "Readme"
		When the user adds the file "Readme" to favorites	

	
	@B34G7-242
	Scenario: User can rename any file from its own three dots menu.
		    Given the user click on the three dots of the file "Test2"
		    Then user click on the rename button of the file
		    When the user renames the file to "Notes"

	
	@B34G7-243
	Scenario: User can put some comments on any file from the file details menu opened right side.
		    Given the user click on the three dots of the file "Talk"
		    Then user click on the details button of the file
		    And user click on the comment button
		    Then user enters the "second comment"