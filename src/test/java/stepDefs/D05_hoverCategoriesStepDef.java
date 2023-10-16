package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.P05_homePage;

public class D05_hoverCategoriesStepDef {
    P05_homePage hover = new P05_homePage ();

    @Given("user hovers random category")
    public void userHoversRandomCategory()
    {

        Actions act = new Actions(Hooks.driver);
        act.moveToElement(hover.mainCategory()).perform();

    }

    @When("user gets the text of the sub-category")
    public void userGetsTheTextOfThisSubCategory() {
        String Text =hover.subCategory().getText();
        System.out.println("text of sub category is"  +  Text);

    }

    @And("user clicks on this sub-category")
    public void userClicksOnThisSubCategory()
    {
        hover.subCategory().click();

    }



    @Then("user gets the the page title and do the assertion")
    public void userGetsTheThePageTitleAndDoTheAssertion() {

       boolean Desktops = hover.title().getText().contains("Desktops");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Desktops);
        soft.assertAll();

        String toLowerCaseText = hover.title().getText().toLowerCase().trim();
        System.out.println(toLowerCaseText);


    }
}
