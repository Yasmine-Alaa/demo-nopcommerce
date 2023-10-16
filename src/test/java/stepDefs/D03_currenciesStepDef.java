package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.util.List;

public class D03_currenciesStepDef


{
    P03_homePage homepage = new P03_homePage ();



   @Given("user selects Euro as currency")
           public void user_selects_Euro_as_currency ()
   {


       WebElement Euro = homepage.ChooseEuro();
       Select s = new Select(Euro);
       s.selectByVisibleText("Euro");
   }

   @Then("Euro Symbol is shown on the 4 products displayed in homepage")
    public void Euro_Symbol_is_shown_on_the_4_products_displayed_in_homepage()
   {
 /*    boolean X = homepage.Price().getText().contains("$");

       boolean X = true;

       List<WebElement> elements = homepage.EuroSymbols();
           for(int i = 0 ; i< elements.size(); i++)
           {
               if(!homepage.getPrice(elements.get(i)).getText().contains("€"))
                   X = false;
           }
       Assert.assertTrue(X); */


   int x = (homepage.EuroSymbols().size());

   Assert.assertEquals(4,x);

   for (WebElement price :homepage.prices())
   {
      boolean y= price.getText().contains("€");

       Assert.assertTrue(y);
   }

   }




}
