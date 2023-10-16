package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefs.Hooks;

public class P01_register
{
    public WebElement registerlink ()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement gender () {
        return Hooks.driver.findElement(By.id("gender-female"));
    }
public WebElement firstname ()
{
    return Hooks.driver.findElement(By.cssSelector("input[name=\"FirstName\"]"));

}
public WebElement lastname ()
        {
            return Hooks.driver.findElement(By.xpath("//input[@name=\"LastName\"]"));

}
public WebElement daydateofbirth ()
{

    return Hooks.driver.findElement(By.name("DateOfBirthDay"));

}
 public  WebElement monthdateofbirth ()
 {
     return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
 }
 public WebElement yeardateofbirth ()
 {
     return Hooks.driver.findElement(By.name("DateOfBirthYear"));
 }
  public WebElement Email ()
  {
      return Hooks.driver.findElement(By.xpath("//input[@type=\"email\"]"));
  }

  public  WebElement Password ()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmpassword ()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));

    }

    public WebElement ButtonClick ()
    {
        return Hooks.driver.findElement(By.className("register-next-step-button"));

    }
    public WebElement SuccessMassage ()
    {
        return Hooks.driver.findElement(By.className("result"));
    }


   // public WebElement massageColor (){
     //   return Hooks.driver.findElement(By.xpath("//div[text()=\"Your registration completed\"]"));
  //  }

}
