package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P07_homePage
{

    public WebElement Facebook ()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));

    }
    public String getCurrentFacebook ()
     {
        return Hooks.driver.getCurrentUrl();
     }
     public String getCurrentNopLink()
     {
         return Hooks.driver.getCurrentUrl();
     }
    public WebElement Twitter ()
    {
      return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
     }

  public String getCurrentTwitter ()
  {
      return  Hooks.driver.getCurrentUrl();

  }
   public WebElement rss ()
   {
       return Hooks.driver.findElement(By.xpath("//a[text()=\"RSS\"]"));

   }
  public String getCurrentRss ()
  {
      return Hooks.driver.getCurrentUrl();
  }
   public WebElement Youtube ()
   {
       return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));

   }
   public String getCurrentYoutube ()
   {
       return  Hooks.driver.getCurrentUrl();
   }
}

