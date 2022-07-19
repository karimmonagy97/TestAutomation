package org.example.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D06_homeSliderStepDef {
    P03_homepage home =new P03_homepage();
    @When("user click on the slider of nokia slider")
    public void userClickNokia() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        home.firstSlider().click();
        home.selectSlider("1").click();
        Thread.sleep(2000);
    }
    @Then("go to page of the nokia product")
    public void successfullyNokia(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");

    }
    @When("user clicks on the slider of Iphone slider")
    public void userClickIphone() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        home.secondSlider().click();
        home.selectSlider("2").click();
        Thread.sleep(2000);

    }
    @Then("go to page of the Iphone product")
    public void successfullyiphone(){

        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
    }

}
