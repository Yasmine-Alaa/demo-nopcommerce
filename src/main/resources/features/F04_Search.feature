@smoke
  Feature: Search for product by name then by sku
    Scenario Outline: search using product name
      Given user search for product with "<productname>"
      When user clicks on search button
      Then user checks the url and word search

      Examples:
      |productname|
      |nike|
      |laptop|
      |book|

      Scenario Outline: search for product using sku
        Given user search for product by "<SKU>"
        When user click on the product in search result"<SKU>"
        Then  user get the sku shown in this page then make sure it contains the sku that you are using in search"<SKU>"
        Examples:
        |SKU|
        |AP_MBP_13|
        |SM_900_PU|
        |APPLE_CAM|


