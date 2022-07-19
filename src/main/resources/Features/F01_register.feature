@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter first name "karim"
    And user enter last name "nagy"
    And user enter date of birth
    And user enter email "karim.m.nagy@yahoo.com"
    And user fill pass "1q2w3e4r"
    And user clicks reg button
    Then success message is displayed