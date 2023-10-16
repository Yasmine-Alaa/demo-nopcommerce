@smoke

  Feature: hoverCategories
    Scenario: hover one random category of the main three categories on the homepage
      Given user hovers random category
      When user gets the text of the sub-category
      And user clicks on this sub-category
      Then user gets the the page title and do the assertion


