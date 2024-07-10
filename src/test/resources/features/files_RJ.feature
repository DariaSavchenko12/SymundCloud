Feature: Files module functionality

	
	@B34G7-194
	Scenario: User can upload a file
		When user clicks "Files" module
		Then user successfully lands to the "Files" page
		When user clicks plus sign module					
		Then user sees and clicks "Upload file" option
		Then user uploads a file
		And user can see uploaded file in the list



	@B34G7-195
	Scenario: User can create a new folder
		When user clicks "Files" module
		Then user successfully lands to the "Files" page
		When user clicks plus sign module
		Then user sees and clicks "New folder" option
		Then user enters New folder name
		And user clicks arrow to save new folder
		And user can see new folder in the list



	@B34G7-196
	Scenario: User can delete any selected item from its three dots menu
		When user clicks "Files" module
		Then user successfully lands to the "Files" page
		When user clicks three dots menu next to the file
		Then user sees and clicks delete option
		And user sees file is no longer on the list



	@B34G7-197
	Scenario: User can see the total number of files and folders under the files list table
		When user clicks "Files" module
		Then user successfully lands to the "Files" page
		And user should see total number of files and folders displayed under the files list