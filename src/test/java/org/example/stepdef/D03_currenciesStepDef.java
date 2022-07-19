package org.example.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homepage home=new P03_homepage();
    @When("user choose currency")
    public void currencybtn(){
        home.currency().click();
        home.currencyEuro().click();

    }
    @Then("product currency changed")
    public void currencyChanged(){
        for(int i=0;i<home.productschanged().size();i++){
            Assert.assertTrue(home.pricechanged().getText().contains("€"));
        }
    }
}
