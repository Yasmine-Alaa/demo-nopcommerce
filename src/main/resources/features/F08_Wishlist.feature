@smoke

  Feature:  Wishlist feature

    Scenario: user could add product to the wishlist
      Given user clicks on wishlist button ❤️ on this product "HTC One M8 Android L 5.0 Lollipop"
      Then  success message "The product has been added to your wishlist" with green background color is displayed


      Scenario:
        Given click on wishlist button ❤️ on this product "HTC One M8 Android L 5.0 Lollipop"
        And user clicks on the wishlist tab
        Then Qty value is bigger than 0
