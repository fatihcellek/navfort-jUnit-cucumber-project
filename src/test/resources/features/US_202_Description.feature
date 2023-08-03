@description
Feature: Users should be able to write messages in the Description
  field on the calendar event page.

  User Story: As a user, I want to write the “Description” when I
  create a calendar event.

  Scenario: write messages in the Description field on the calendar event page.
    Given user is on the login page
    When user enters the driver information
    Then user should be able to login
    And user clicks on the Activities module
    And user clicks on the Calendar Events button
    And User sees Calendar Events is in the title
    And user clicks Create Calendar Event button
    And User sees Create Calendar event is in the title
    And user clicks on the repeat option
    When user write a message in Description
    Then The message should be displayed


