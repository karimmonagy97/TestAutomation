package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homepage home=new P03_homepage();
    @Given("user press at search")
    public void pressSearch(){
        home.Search().click();
    }
    @When("^user enter in search \"([^\"]*)\"$")
    public void writeName(String productName){
        home.Search().clear();
        home.Search().sendKeys(productName);
    }
    @And("press in search button")
    public void searchBtn(){
        home.searchButton().click();
    }
    @And("user click on the product in search result")
    public void selectProd(){
        home.productSelection().click();
    }

    @When("^user enter in search like \"(.*)\"$")
    public void writeSKU(String Sku){
        home.Search().clear();
        home.Search().sendKeys(Sku);
    }
    @Then("user could search for product successfully")
    public void successNameProd(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(home.searchURL().contains("https://demo.nopcommerce.com/search?q="));

        softAssert.assertTrue(home.searchProductsList().size()>0);

        softAssert.assertAll();

    }
    @Then("user could search for SKU successfully")
    public void successSkuprod(){


        Assert.assertTrue(home.getSKU().getText().contains("AP_MBP_13"));
    }
}
