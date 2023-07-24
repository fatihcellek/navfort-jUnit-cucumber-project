@vehiclePage
Feature: As a user, I want to view columns on the Vehicle models page.


  Background:
  Given user is on the login page

@firstCase
  Scenario: As a store manager I should be able to see 10 columns on the Vehicle Model page.

    Given Login as store manager
    When user clicks on Fleet module
    And user clicks on Vehicles Model
    Then user should see 10 columns

  @secondCase
  Scenario: As a sales manager I should be able to see 10 columns on the Vehicle Model page.
    Given Login as sales manager
    When user clicks on Fleet module
    And user clicks on Vehicles Model
    Then user should see 10 columns

    @thirdCase
    Scenario: As a driver I should not be able to access Vehicle Model page.
      Given Login as a driver
      When user clicks on Fleet module
      And user clicks on Vehicles Model
      Then user should see "You do not have permission to perform this action."

