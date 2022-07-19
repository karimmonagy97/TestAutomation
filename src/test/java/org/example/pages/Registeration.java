package org.example.pages;

import org.example.stepdef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Registeration {

    public WebElement regBtn()
    {
        WebElement regBtn = Hooks.driver.findElement(By.className("ico-register"));
        return regBtn;
    }
    public WebElement Gender(){
        WebElement GenderMale=Hooks.driver.findElement(By.id("gender-male"));
        return GenderMale;
    }
    public WebElement firstName(){
        WebElement firstName= Hooks.driver.findElement((By.id("FirstName")));
        return firstName;
    }
    public WebElement lastName(){
        WebElement lastName=Hooks.driver.findElement(By.id("LastName"));
        return lastName;
    }
    public WebElement dateBirthday(){
        WebElement dateBirthd=Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return dateBirthd;
    }
    public WebElement dateBirthMonth(){
        WebElement dateBirthm=Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return dateBirthm;
    }
    public WebElement dateBirhYear(){
        WebElement dateBirthY=Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return dateBirthY;
    }
    public WebElement Emai(){
        WebElement emai=Hooks.driver.findElement((By.id("Email")));
        return emai;
    }
    public WebElement pass(){
        WebElement pass=Hooks.driver.findElement(By.id("Password"));
        return pass;
    }
    public WebElement passc(){
        WebElement passc=Hooks.driver.findElement(By.id("ConfirmPassword"));
        return passc;
    }
    public WebElement Regestir(){
        WebElement Regis=Hooks.driver.findElement(By.id("register-button"));
        return Regis;
    }
    public WebElement successMessage()
    {
        WebElement message = Hooks.driver.findElement(By.className("result"));
        return message;
    }
}
