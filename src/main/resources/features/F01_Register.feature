@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully

    Given user go to register page
    When user select gender type
    And user enter first und last name
    And user enter date of birth
    And user enter the email field
    And user fills password field
    And user clicks on register button
    Then success massage is displayed



