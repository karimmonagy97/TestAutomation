@smoke
  Feature: user select sub category from any category
    Scenario: user could hover categories
      When user hover category
      And user select sub category
      Then user go to sub category page successfully