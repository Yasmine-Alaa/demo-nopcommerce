package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P08_homePage;

import java.time.Duration;

public class D08_WishlistStepDef {
    P08_homePage wishList = new P08_homePage  ();
    @Given("user clicks on wishlist button ❤️ on this product {string}")
    public void userClicksOnWishlistButton️OnThisProduct(String arg0)

    {
        wishList.addProduct().click();

    }

    @Then("success message {string} with green background color is displayed")
    public void successMessageWithGreenBackgroundColorIsDisplayed(String arg0)
    {
      wishList.successMassage().isDisplayed();
     boolean massage= wishList.successMassage().getText().contains("The product has been added to your wishlist");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(massage);

        String bckgclr = wishList.notificationBar().getCssValue("background-color");
        System.out.println(bckgclr);
        soft.assertEquals(bckgclr,"rgba(75, 176, 122, 1)");
        soft.assertAll();


    }

    @Given("click on wishlist button ❤️ on this product {string}")
    public void clickOnWishlistButton️OnThisProduct(String arg0)
    {
        wishList.addProduct().click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[text()=\"The product has been added to your \"]")));

    }
    @And("user clicks on the wishlist tab")
    public void userClicksOnTheWishlistTab()
    {
        wishList.wishlistTab().click();
    }

    @Then("Qty value is bigger than {int}")
    public void qtyValueIsBiggerThan(int arg0)
    {
        String count = wishList.qty().getAttribute("value");

        int countint=    Integer.parseInt(count);

        Assert.assertTrue(countint>0);
    }


}
