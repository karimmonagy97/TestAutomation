package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D08_WishlistStepDef {
    P03_homepage home=new P03_homepage();
    @When("user press on the love icon")
    public void pressLove(){
        home.addWishlist().get(2).click();
    }
    @Then("The product will add to the watchlist")
    public void addSuccess(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(home.wishlistSuccessMessage().isDisplayed());
        String expectedColor = "rgba(75, 176, 122, 1)";
        String actualColor = home.wishlistSuccessMessage().getCssValue("background-color");
        softAssert.assertEquals(actualColor, expectedColor);
        softAssert.assertAll();
    }
    @And("number of the watchlist increased")
    public void watchlistIncrease(){
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text = home.numberWatchlist().getText().replaceAll("[^0-9]", "");
        int numberOfItems = Integer.parseInt(text);

        Assert.assertTrue(numberOfItems > 0);
    }
}
