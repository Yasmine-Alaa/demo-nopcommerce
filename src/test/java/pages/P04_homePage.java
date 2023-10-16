package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import java.util.List;

public class P04_homePage
{

  public   WebElement productSearch ()
     {return Hooks.driver.findElement(By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]"));}

    public WebElement searchBtn ()
    {
        return  Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }


    public String getURl ()
    {
      return   Hooks.driver.getCurrentUrl();

    }
    public  List<WebElement> searchResults ()
    {
        return  Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"]"));

    }
    public WebElement searchWord ()
    {
        return Hooks.driver.findElement(By.xpath("//h1[text()=\"Search\"]"));
    }


    public List<WebElement>searchWordForTheLoop()
    {
      return Hooks.driver.findElements(By.xpath("//h1[text()=\"Search\"]"));
    }














 public WebElement getSku ()
 {
     return  Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]"));
 }


   public WebElement searchItem ()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"product-item\"]"));

    }
}
