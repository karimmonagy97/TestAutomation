package org.example.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login=new P02_login();
    @Given("user go to login page")
    public void loginpage(){
        login.loginbtn().click();
    }
    @When("^user login with mail \"(.*)\" and password \"(.*)\"$")
    public void validdata(String Email , String Password){
        login.email().sendKeys(Email);
        login.pass().sendKeys(Password);

    }
    @And("user press login")
    public void loginPress(){
        login.login().click();
    }
@Then("user login is successfully")
public void loginSuccess()
{
    SoftAssert softAssert =new SoftAssert();

    softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

    softAssert.assertTrue(login.loginsuccess().isDisplayed(), "Login success");


    softAssert.assertAll();
}
@Then("user login fail")
    public void loginfail(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(login.loginfail().isDisplayed());
        String expectedColor = "rgba(228, 67, 75, 1)";
        String actualColor = login.loginfail().getCssValue("color");
        softAssert.assertEquals(actualColor,expectedColor);
        softAssert.assertAll();

}
}
