package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class P06_homePage {


    public WebElement iphone() {
        return Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000088_banner_01.webp\"]"));
    }



    public WebElement galaxy()
    {

        return Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]/img"));

}
}


