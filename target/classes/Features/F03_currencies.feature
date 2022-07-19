@smoke
  Feature: select the currency
    Scenario:user changing the currency to change the currency of the product
      When user choose currency
      Then product currency changed
