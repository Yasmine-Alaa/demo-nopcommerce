package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pages.P06_homePage;

public class D06_homeSlidersStepDef {

    P06_homePage homeSlider = new P06_homePage ();

    @Given("user clicks on the first slider")
    public void userClicksOnTheFirstSlider() {
        JavascriptExecutor j = (JavascriptExecutor) Hooks.driver;
        j.executeScript("arguments[0].click();", homeSlider.iphone());
       String O= Hooks.driver.getCurrentUrl();
        System.out.println(O);

    }

    @Then("user will be directed to iphone page")
    public void userWillBeDirectedToIphonePage()
    {

      String actualURL = Hooks.driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualURL,"https://demo.nopcommerce.com/iphone_14_Pro");
        soft.assertAll();
    }
    @Given("user clicks on the second slider")
    public void userClicksOnTheSecondSlider()  {
        JavascriptExecutor j = (JavascriptExecutor) Hooks.driver;
        j.executeScript("arguments[0].click();", homeSlider.galaxy());
        String m= Hooks.driver.getCurrentUrl();
        System.out.println(m  );
    }

    @Then("user will be directed to the Galaxy phone page")
    public void userWillBeDirectedToTheGalaxyPhonePage()
    {

    String actualURL2=  Hooks.driver.getCurrentUrl();
    SoftAssert soft1= new SoftAssert();
    soft1.assertEquals(actualURL2,"https://demo.nopcommerce.com/Galaxy_S22_Ultra");
    soft1.assertAll();
    }





}
