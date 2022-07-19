package org.example.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

// bn3ml static 3lshan yfdl ysave 2n da nafs al driver
public class Hooks {
    public static WebDriver driver=null;
    @Before
    public static void Open_browser(){
    WebDriverManager.chromedriver().setup();

    driver =new ChromeDriver();

    driver.manage().window().maximize();
    //implicit wait make selenium wwait if it is loading and it is better than Thread.sleep
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("https://demo.nopcommerce.com/");
    }
    @After
    public static void Close_browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
