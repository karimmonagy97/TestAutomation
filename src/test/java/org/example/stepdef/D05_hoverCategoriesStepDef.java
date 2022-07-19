package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.example.pages.P04_subCategory;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class D05_hoverCategoriesStepDef {
    P03_homepage home=new P03_homepage();
    P04_subCategory subCategory=new P04_subCategory();
    String subCategoryName;
    @When("user hover category")
    public void choosCategory() throws InterruptedException {
        Actions action =new Actions(Hooks.driver);
        action.moveToElement(home.categoryList()).perform();
        action.moveToElement(home.subCategoryList()).perform();
        subCategoryName = home.subCategoryList().getText().toLowerCase();

        Thread.sleep(1000);

    }
    @And("user select sub category")
    public void selectSubCategory(){
        home.subCategoryList().click();
    }
    @Then("user go to sub category page successfully")
    public void successfullySelectSub(){
        Assert.assertEquals(subCategory.pageSubCategory().getText().toLowerCase(),subCategoryName);

    }

}
