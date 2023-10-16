@smoke

  Feature: users could open followUs links

    Scenario: user opens facebook link
      Given user opens facebook link
      Then facebook is opened in new tab


      Scenario: user opens twitter link
        Given user opens twitter link
        Then twitter is opened in new tab


        Scenario: user opens rss link
          Given user opens rss link
          Then rss is opened in new tab

    Scenario: user opens youtube link
       Given user opens youtube link
      Then  youtube is opened in new tab

