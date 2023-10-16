package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.P01_register;

public class D01_registerStepDef {

    P01_register register = new P01_register();

    @Given("user go to register page")

    public void user_go_to_register_page  ()
    {
      /*  System.out.println("This is a test before start coding");
          WebElement registerBtn;
          registerBtn = Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
         registerBtn.click (); */
        register.registerlink().click();

    }
    @When("user select gender type")
            public void user_select_gender_type ()
    {
        register.gender().click();
    }

@And("user enter first und last name")
    public void user_enter_first_und_last_name ()
    {
        register.firstname().sendKeys("automation");
        register.lastname().sendKeys("tester");

    }

    @And("user enter date of birth")
    public void user_enter_date_of_birth ()
    {
        WebElement day = register.daydateofbirth();
        Select day1 = new Select(day);
            day1.selectByValue("10");

            WebElement month = register.monthdateofbirth();
            Select month1 =new Select(month);
            month1.selectByValue("10");

            WebElement year = register.yeardateofbirth();
            Select year1= new Select(year);
            year1.selectByValue("1996");

    }

    @And("user enter the email field")
    public void user_enter_the_email_field ()
    {
  register.Email().sendKeys("Yasssminschen@exampleI.com");
    }

    @And("user fills password field")


        public void user_fills_password_field ()
    {
register.Password().sendKeys("P@ssw0rd");
register.confirmpassword().sendKeys("P@ssw0rd");

    }
    @And("user clicks on register button")
    public void user_clicks_on_register_button ()
        {
register.ButtonClick().click();
    }
@Then("success massage is displayed")
    public void success_massage_is_displayed ()
    {
register.SuccessMassage().getText().contains("Your registration completed");

        SoftAssert soft = new SoftAssert();

        boolean registered = register.SuccessMassage().getText().contains("Your registration completed");
        soft.assertTrue(registered);

        String bckgclr = register.SuccessMassage().getCssValue("color");
        System.out.println(bckgclr);
        soft.assertEquals(bckgclr,"rgba(76, 177, 124, 1)");
         soft.assertAll();

    }
}

