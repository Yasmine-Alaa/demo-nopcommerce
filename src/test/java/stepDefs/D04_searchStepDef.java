package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P04_homePage;


public class D04_searchStepDef {

    P04_homePage searchOutline = new P04_homePage();

    @Given("user search for product with {string}")
    public void userSearchForProductWithproductname(String productname)
    {
        searchOutline.productSearch().sendKeys(productname);
    }

    @When("user clicks on search button")
    public void userClicksOnSearchButton()
    {
        searchOutline.searchBtn().click();
    }

    @Then("user checks the url and word search")
    public void user_checks_the_url_and_word_search()
    {
        boolean URL = searchOutline.getURl().contains("https://demo.nopcommerce.com/search?q=");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(URL);
        soft.assertAll();

       searchOutline.searchResults().size();
        System.out.println(searchOutline.searchResults().size());

         String text =(searchOutline.searchWord().getText().toLowerCase());
       String toLowerCaseText = text.toLowerCase();
        System.out.println(toLowerCaseText);


        for (WebElement search : searchOutline.searchWordForTheLoop()) {

           boolean o =search.isDisplayed();
            SoftAssert soft1 = new SoftAssert();
            soft1.assertTrue(o);

            soft1.assertAll();

        }

    }


    @Given("user search for product by {string}")
    public void userSearchForProductBy(String SKU)  {
        searchOutline.productSearch().sendKeys(SKU, Keys.ENTER);


    }



    @When("user click on the product in search result{string}")
    public void userClickOnTheProductInSearchResult (String SKU)
    {
        searchOutline.searchItem().click();

    }

    @Then("user get the sku shown in this page then make sure it contains the sku that you are using in search{string}")
    public void userGetTheSkuShownInThisPageThenMakeSureItContainsTheSkuThatYouAreUsingInSearch(String SKU)
    {
      boolean actual = searchOutline.getSku().getText().contains(SKU);
      Assert.assertTrue(actual);

    }


}










