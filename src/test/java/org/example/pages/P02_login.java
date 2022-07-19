package org.example.pages;

import org.example.stepdef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
public WebElement loginbtn(){
    WebElement loginbtn= Hooks.driver.findElement(By.className("ico-login"));
    return loginbtn;
}
public WebElement email(){
    WebElement Email=Hooks.driver.findElement(By.id("Email"));
    return Email;
}
    public WebElement pass(){
        WebElement pass=Hooks.driver.findElement(By.id("Password"));
        return pass;
    }
    public WebElement login(){
        WebElement login=Hooks.driver.findElement(By.className("login-button"));
        return login;
    }
    public WebElement loginsuccess()
    {
        WebElement loginSuccess = Hooks.driver.findElement(By.className("ico-account"));
        return loginSuccess;
    }
    public WebElement loginfail(){
    WebElement loginfail=Hooks.driver.findElement(By.className("message-error"));
    return loginfail;
    }
}
