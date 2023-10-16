package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import java.util.List;

public class P03_homePage


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


     public WebElement ChooseEuro ()
     {

         return (Hooks.driver.findElement(By.cssSelector("select[aria-label=\"Currency selector\"]")));
     }

      public  List<WebElement>  EuroSymbols () {

          return  Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"]"));
      }

      //public WebElement getPrice(WebElement element){
        //  return element.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    //  }


    public List<WebElement> prices ()
    {
        return Hooks.driver.findElements(By.cssSelector("div[class=\"prices\"]"));
    }


  }
