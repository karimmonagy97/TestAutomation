@smoke
  Feature: Search for product

    Scenario Outline: user searching with a product name
      Given user press at search
      When user enter in search "<name>"
      And press in search button
      Then user could search for product successfully

      Examples:
        | name  |
        | Nikon |
        | Apple |
        | Book  |

     Scenario: user searching with SKU
       Given user press at search
       When user enter in search like "AP_MBP_13"
       And press in search button
       And user click on the product in search result
       Then user could search for SKU successfully

