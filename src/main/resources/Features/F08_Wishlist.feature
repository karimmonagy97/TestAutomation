@smoke
  Feature: user add products to watchlist
    Scenario: user add HTC One M8 Android L 5.0 Lollipop to the watchlist
      When user press on the love icon
      Then The product will add to the watchlist

    Scenario: watchlist number increased
      When user press on the love icon
      Then The product will add to the watchlist
      And number of the watchlist increased