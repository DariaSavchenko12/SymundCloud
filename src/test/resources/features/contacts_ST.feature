@B34G7-216
Feature: Default Contacts Module Functionality

	
	@B34G7-199
	Scenario Outline: User can create a new contact
		Given the user logged in as "<userType>"
		Then    user click to the Contacts module
		Given   user click to New contact
		When    user creates a new contact with full name "Sureyya Turkmen"
		And     user click to All contacts
		Then    new contact "Sureyya Turkmen" should appear in the All contact list
		Examples:
			| userType |
			| users    |
			| employee |


	@B34G7-201
	Scenario Outline: User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
		Given   the user logged in as "<userType>"
		When    user click to the Contacts module
		And     user click to All contacts
		And      user should see a list of all contacts at the middle column
		Then      the total number of contacts should be displayed near the All Contacts tab
		Examples:
			| userType |
			| users    |
			| employee |


	@B34G7-202
	Scenario Outline: User can change the profile picture
		Given   the user logged in as "<userType>"
		When    user click to the Contacts module
		And     user click to All contacts
		And     user selects the contact "Sureyya Turkmen"
		And     user clicks on the profile picture
		And      user chooses "Choose from files" option
		And     user selects a previously uploaded picture and click choose button
		Then      the profile picture of the contact should be updated
		Examples:
			| userType |
			| users    |
			| employee |


	@B34G7-203
	Scenario Outline: User can delete any selected contact
		Given   the user logged in as "<userType>"
		Then    user click to the Contacts module
		And     user click to All contacts
		And     user selects the contact "Sureyya Turkmen"
		And     user clicks the three-dot menu
		And     user user selects the "delete" option
		Then    The contact "Sureyya Turkmen" should be removed from the contact list
		Examples:
			| userType |
			| users    |
			| employee |