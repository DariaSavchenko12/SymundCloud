@B34G7-210
Feature: Contacts Management Module

  Background:
    Given the user is logged in
    When the user navigates to the Contacts module
    And selects to create a new group
    And enters a group name "Students"
    And saves the new group
    Then the group "Students" should be created successfully
   Given the user is viewing a contact's information


  @B34G7-200
  Scenario: User can create a new group under Contacts Module
    Given the user is logged in
    When the user navigates to the Contacts module
    And selects to create a new group
    And enters a group name "Students"
    And saves the new group
    Then the group "Students" should be created successfully


  @B34G7-208
  Scenario:  Viewing available groups in contact's info menu
    Given the user is viewing a contact's information
    When the user clicks on the group dropdown menu
    Then all available groups should be listed



  @B34G7-209
  Scenario: Adding Anniversary as a property to contact's info page
    Given the user is viewing a contact's information
    When the user clicks on "Add new property" dropdown menu
    And selects "Anniversary"
    And enters the anniversary date "July 10, 2020"
    And saves the contact information
    Then the anniversary property should be added to the contact's info page
    And the anniversary date should be displayed as "July 10, 2020"