package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;
import pages.P02_login;


public class D02_loginStepDef


{
    P02_login login = new P02_login ();

    @Given("user go to login page")

       public void user_go_to_login_page ()
    {
    login.LoginPage().click();

    }

    @When("user login with valid email and password")
            public void user_login_with_valid_email_and_password ()
    {
     login.ValidEmail().sendKeys("Yasssminschen@exampleI.com");
     login.ValidPassword().sendKeys("P@ssw0rd");
    }
    @And("user press on login button")
            public void user_press_on_login_button ()
    {
        login.LoginButton().click();
    }

    @Then("user login to the system successfully")

    public void user_login_to_the_system_successfully ()
    {
        SoftAssert soft = new SoftAssert();
        login.SuccessfullLogin().isDisplayed();
        boolean loggedIn = login.SuccessfullLogin().isDisplayed();
        soft.assertTrue(loggedIn);


        login.GetURL().contains("https://demo.nopcommerce.com/");
          boolean URL= login.GetURL().contains("https://demo.nopcommerce.com/");
          soft.assertTrue(URL);

        soft.assertAll();
    }

    @When("user  login with invalid Email and user")
    public void user_login_with_invalid_Email_and_user ()
    {
        login.InvalidEmail().sendKeys("wrong@example.com");
        login.InvalidPassword().sendKeys("P@ssw0rd");

    }
    @Then("user could not login to the system")
            public void user_could_not_login_to_the_system ()
    {
    login.InvalidLogin().getText().contains("Login was unsuccessful");
    SoftAssert soft = new SoftAssert();
    boolean InvalidLogin1 = login.InvalidLogin().getText().contains("Login was unsuccessful");
    soft.assertTrue(InvalidLogin1);
        String bckgclr = login.InvalidLogin().getCssValue("color");
        System.out.println(bckgclr);
        soft.assertEquals(bckgclr,"rgba(228, 67, 75, 1)");
        Color.fromString("rgba(228, 67, 75, 1)").asHex();
        System.out.println(Color.fromString("rgba(228, 67, 75, 1)").asHex());
    soft.assertAll();
    }


}
