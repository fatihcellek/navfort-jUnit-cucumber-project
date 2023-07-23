
@vytrackLogin
Feature:Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: driver, sales manager, store manager

  Background:
    Given user is on the login page

  @driver
  Scenario: Login as driver
   # Given user is on the login page
    When user enters the driver information


 @salesmanager
  Scenario: Login as sales manager
   # Given user is on the login page
    When user enters the sales manager information


  @storemanager
  Scenario: Login as store manager
   # Given user is on the login page
    When user enters the store manager information


  Scenario: Login with given user
   # Given user is on the login page
    When user enters the "store manager" information












