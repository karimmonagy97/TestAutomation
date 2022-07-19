package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.Registeration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    Registeration reg = new Registeration();
    @Given("user go to register page")
    public void step_one(){
       reg.regBtn().click();


    }
    @When("user select gender type")
    public void Selectgender(){
        reg.Gender().click();
    }

    @And("^user enter first name \"(.*)\"$")
    public void enterFirstname(String Firstname){
    reg.firstName().sendKeys(Firstname);
    }
    @And("user enter last name \"(.*)\"$")
    public void enterLastname(String Lastname){
    reg.lastName().sendKeys((Lastname));

    }
    @And("user enter date of birth")
    public void dateBirth(){
        Select select = new Select(reg.dateBirthday());
        select.selectByIndex(24);
        select=new Select(reg.dateBirthMonth());
        select.selectByIndex(9);
        select=new Select(reg.dateBirhYear());
        select.selectByValue("1997");
    }
    @And("user enter email \"(.*)\"$")
    public void emai(String mail){
    reg.Emai().sendKeys(mail);
    }
    @And("user fill pass \"(.*)\"$")
    public void Pass(String password){
    reg.pass().sendKeys(password);
    reg.passc().sendKeys(password);
    }
    @And("user clicks reg button")
    public void regestiration(){
        reg.Regestir().click();

    }
    @When("success message is displayed")
    public void regsuccess(){

    SoftAssert softAssert =new SoftAssert();

    // First Assertion
        softAssert.assertTrue(reg.successMessage().isDisplayed(), "Success message appears");

    // Second Assertion
    String expectedColor = "rgba(76, 177, 124, 1)";
    String actualColor = reg.successMessage().getCssValue("color");
        softAssert.assertEquals(actualColor,expectedColor, "Success message color is correct");

    // All Assert
        softAssert.assertAll();

}
}
