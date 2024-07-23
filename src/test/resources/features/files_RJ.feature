@FilesModule
Feature: Files module functionality

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in as "users"


  @B34G7-194
  Scenario: User can upload a file
    When user clicks "Files" module
    Then user successfully lands to the "Files" page
    Then user uploads a file
    And user can see uploaded file in the list
    Then user clicks "uploadFile.txt" file delete option


  @B34G7-195
  Scenario: User can create a new folder
    When user clicks "Files" module
    Then user successfully lands to the "Files" page
    When user clicks plus sign module
    Then user sees and clicks "New folder" option
    Then user enters New folder name
    And user clicks Enter to save new folder
    And user can see new folder in the list
    Then user clicks "B34" file delete option


  @B34G7-196
  Scenario: User can delete any selected item from its three dots menu
    When user clicks "Files" module
    Then user successfully lands to the "Files" page
    When user clicks three dots menu next to the first file
    Then user deletes that file and verifies it no longer exist


  @B34G7-197
  Scenario: User can see the total number of files and folders under the files list table
    When user clicks "Files" module
    Then user successfully lands to the "Files" page
    And user should see total number of files and folders displayed under the files list