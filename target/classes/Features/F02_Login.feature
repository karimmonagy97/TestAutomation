@smoke
  Feature: user could use login function to use their accounts
    Scenario: user could login with valid email and password
      Given user go to login page
      When user login with mail "karim.m.nagy@yahoo.com" and password "1q2w3e4r"
      And user press login
      Then user login is successfully

     Scenario: user could not login with invalid email and password
       Given user go to login page
       When user login with mail "karim.m.nagy@fwd.com" and password "1q2w3e4r"
       And user press login
       Then user login fail


