package org.example.pages;

import org.example.stepdef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_subCategory {
    public WebElement pageSubCategory(){
        WebElement title= Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        return title;
    }
}
