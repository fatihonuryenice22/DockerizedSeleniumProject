Feature: Dockerized Selenium Test in Traum Coffe Page
  Scenario: Login
    Given User Opens Web Page
    When puts the correct info
    When Logout
    Then Close Browser


  Scenario: Main Page Validation
    Given User Opens Web Page
    When Checks the Main Page items
    Then Close Browser


  Scenario: Customer Tries to Order
    Given User Opens Web Page
    When Clicks to Order now button
    When Checks the products
    Then Close Browser

  Scenario: About Nav Menu Validation
    Given User Opens Web Page
    When User Clicks to about option and validates the options
    Then Close Browser

  Scenario: Learn Nav Menu Validation
    Given User Opens Web Page
    When Click Learn Menu and Validate
    Then Close Browser

  Scenario: Wholesale Nav Menu Validation
    Given User Opens Web Page
    When Validate Wholesale Nav Menu
    Then Close Browser

  Scenario: Footer Element Control
    Given User Opens Web Page
    When Scroll to Bottom of the page
    When Validate Footer
    Then Close Browser
