package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P08_homePage
{
    public WebElement addProduct () {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }
    public WebElement successMassage ()
    {
        return Hooks.driver.findElement(By.xpath("//p[text()=\"The product has been added to your \"]"));

    }

    public WebElement notificationBar ()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement wishlistTab ()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }
    public WebElement qty ()
    {
         return Hooks.driver.findElement(By.className("qty-input"));
    }
}

