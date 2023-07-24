@mainModules
Feature: Users should have access to the main modules of the app
  Agile Story:As a user, I should be accessing all the main modules of the app
  Users: drivers,store manager, sales manager


  Scenario: Modules options for driver
    Given user is on the login page
    When user enters the "driver" information
    Then user should be able to see following modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  Scenario: Modules options for salesmanager
    Given user is on the login page
    When user enters the "sales manager" information
    Then user should be able to see following modules

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  Scenario: Modules options for storemanager
    Given user is on the login page
    When user enters the "store manager" information
    Then user should be able to see following modules

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |




