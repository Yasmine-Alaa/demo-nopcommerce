package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P02_login
{
   public WebElement LoginPage ()

   {
       return Hooks.driver.findElement(By.className("ico-login"));
   }

   public WebElement ValidEmail ()
   {
       return Hooks.driver.findElement(By.className("email"));
   }

   public WebElement ValidPassword ()
   {
       return Hooks.driver.findElement(By.className("password"));
   }
   public WebElement LoginButton ()
   {
       return Hooks.driver.findElement(By.className("login-button"));
   }
   public WebElement SuccessfullLogin ()
   {
       return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
   }

   public String GetURL ()
   {
       return Hooks.driver.getCurrentUrl();

   }
   public WebElement InvalidEmail()
   {
       return Hooks. driver.findElement(By.className("email"));
   }
   public WebElement InvalidPassword ()
   {
       return Hooks.driver.findElement(By.className("password"));
   }

   public WebElement InvalidLogin ()
   {
       return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
   }
}

