package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P07_homePage;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {

    P07_homePage followUs = new P07_homePage();

    @Given("user opens facebook link")
    public void userOpensFacebookLink()
    {
        followUs.Facebook().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));


    }

    @Then("facebook is opened in new tab")
    public void facebookIsOpenedInNewTab() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " + followUs.getCurrentFacebook());
        Assert.assertEquals(followUs.getCurrentNopLink(),"https://www.facebook.com/nopCommerce");
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + followUs.getCurrentNopLink());
        Assert.assertEquals(followUs.getCurrentNopLink(),"https://demo.nopcommerce.com/");
    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink()
    {
        followUs.Twitter().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @Then("twitter is opened in new tab")
    public void twitterIsOpenedInNewTab()
    {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +followUs.getCurrentTwitter());
        Assert.assertEquals(followUs.getCurrentTwitter(),"https://twitter.com/nopCommerce");
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + followUs.getCurrentNopLink());
        Assert.assertEquals(followUs.getCurrentNopLink(),"https://demo.nopcommerce.com/");
    }

    @Given("user opens rss link")
    public void userOpensRssLink()
    {

        String keysPressed =  Keys.chord(Keys.CONTROL, Keys.RETURN);
        followUs.rss().sendKeys(keysPressed) ;
        //followUs.rss().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

    }

    @Then("rss is opened in new tab")
    public void rssIsOpenedInNewTab()
    {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +followUs.getCurrentRss());
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(followUs.getCurrentRss(),"https://demo.nopcommerce.com/new-online-store-is-open");
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + followUs.getCurrentNopLink());
        soft.assertEquals(followUs.getCurrentNopLink(),"https://demo.nopcommerce.com/");
        soft.assertAll();

    }

    @Given("user opens youtube link")
    public void userOpensYoutubeLink()
    {
        followUs.Youtube().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @Then("youtube is opened in new tab")
    public void youtubeIsOpenedInNewTab()
    {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +followUs.getCurrentYoutube());
        Assert.assertEquals(followUs.getCurrentYoutube(),"https://www.youtube.com/user/nopCommerce");
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + followUs.getCurrentNopLink());
        Assert.assertEquals(followUs.getCurrentNopLink(),"https://demo.nopcommerce.com/");
    }
}
