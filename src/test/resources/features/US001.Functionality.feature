@B34G7-198
Feature: Default

	US: As a user I should be able to modify Dashboard page
Background:
	Given Users login into the page
	When users enter username and password
	Then user click login button

	@B34G7-190
	Scenario: After Login users can see all modules and Username.
		Then Users see Employee name all modules

	@B34G7-191
	Scenario: User can click on Customize button and select any of the Widgets.

		When  Users click on Customize button 
		Then Users click to select Widgets	

	@B34G7-192
	Scenario: Users can click on Set Status button and select any of the Status options.
		When  Users click on Set status option  button
		Then  Users choose any Status option