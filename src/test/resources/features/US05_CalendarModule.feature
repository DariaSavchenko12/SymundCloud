@B34G7-234
Feature: Default

	Background:
		#@B34G7-229
		Given User is on Symund home page
		When User clicks on the Calendar button
		

	
	@B34G7-224
	Scenario: US05AC01TC01 User can display daily calendar
		And User click on the icon right next to the Today + New Event button
		 	Then User Select Day button
		  	Then the Daily calender will is displayed	

	
	@B34G7-231
	Scenario: US05AC02TC01 User can display Weekly calendar view
		And User click on the icon right next to the Today + New Event button
		  	Then User Select Week button
		 	Then the Weekly calender will is displayed	

	
	@B34G7-232
	Scenario: US05AC03TC01 User can display Monthly calendar view
		And User click on the icon right next to the Today + New Event button
		  	Then User Select Month button
		  	Then the Monthly calender will is displayed	

	
	@B34G7-233
	Scenario: US05AC04TC01 User can create a new event under the Calendar module 
		And User click on the New Event button
		  	Then User Adds an Even Title name
		 	Then User Selects From date & time AND To date & time
		 	Then User select All Day
		  	Then User Saves the Event 
		  	Then User Select personal button
		  	Then User selects the Monthly view
		  	Then User should be able to see the Event on the Monthly view on the related day