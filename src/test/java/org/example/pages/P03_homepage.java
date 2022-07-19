package org.example.pages;

import org.example.stepdef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homepage {
    public WebElement currency(){
        WebElement Currency= Hooks.driver.findElement(By.id("customerCurrency"));
        return Currency;
    }
    public WebElement currencyEuro(){
        WebElement Euro=Hooks.driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
        return Euro;
    }
    public List <WebElement> productschanged(){
        List <WebElement> products=Hooks.driver.findElements(By.className("product-grid"));
        return products;
    }
    public WebElement pricechanged(){
        WebElement price=Hooks.driver.findElement(By.className("actual-price"));
        return price;
    }
    public WebElement Search(){
        WebElement search=Hooks.driver.findElement(By.id("small-searchterms"));
        return search;
    }
    public WebElement searchButton(){
        WebElement searchBtn=Hooks.driver.findElement(By.className("search-box-button"));
        return searchBtn;
    }
    public String searchURL()
    {
        String url = Hooks.driver.getCurrentUrl();
        return url;
    }

    public List<WebElement> searchProductsList()
    {
        List<WebElement> list = Hooks.driver.findElements(By.className("item-grid"));
        return list;
    }
    public WebElement productSelection()
    {
        WebElement select = Hooks.driver.findElement(By.cssSelector("div[class=\"picture\"]"));
        return select;
    }

    public WebElement getSKU()
    {
        WebElement sku = Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]"));
        return sku;
    }
    public WebElement categoryList(){
        WebElement category=Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));
        return category;
    }
    public WebElement subCategoryList(){
        WebElement subCategory=Hooks.driver.findElement(By.cssSelector("a[href=\"/camera-photo\"]"));
        return subCategory;
    }
    public WebElement firstSlider(){
        WebElement nokiaimg=Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]"));
        return nokiaimg;
    }
    public WebElement secondSlider(){
        WebElement iphoneImg=Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]"));
        return iphoneImg;
    }
    public WebElement selectSlider(String sliderNumber){
        WebElement Slider=Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNumber+"]"));
        return Slider;
    }
    public WebElement iconFacebook(){
        WebElement FB=Hooks.driver.findElement(By.className("facebook"));
        return FB;
    }
    public WebElement iconTwitter(){
        WebElement Twitter=Hooks.driver.findElement(By.className("twitter"));
        return Twitter;
    }
    public WebElement iconRSS(){
        WebElement RSS=Hooks.driver.findElement(By.className("rss"));
        return RSS;
    }
    public WebElement iconYouTube(){
        WebElement YouTube=Hooks.driver.findElement(By.className("youtube"));
        return YouTube;
    }

    public List<WebElement> addWishlist()
    {
        List<WebElement> wishlist = Hooks.driver.findElements(By.className("add-to-wishlist-button"));
        return wishlist;
    }

    public WebElement wishlistSuccessMessage() {
        WebElement wishlistMessage = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        return wishlistMessage;
    }
    public WebElement numberWatchlist(){
        WebElement number=Hooks.driver.findElement(By.className("wishlist-qty"));
        return number;
    }
}
