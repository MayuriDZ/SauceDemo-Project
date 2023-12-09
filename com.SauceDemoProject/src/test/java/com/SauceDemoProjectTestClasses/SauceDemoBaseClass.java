package com.SauceDemoProjectTestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SauceDemoProjectPOMClasses.POMHomePageClass;
import com.SauceDemoProjectPOMClasses.POMLoginClass;

public class SauceDemoBaseClass 
{
       WebDriver driver;
       
       @BeforeMethod
       public void setUp()
       {
    	     System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver.exe");
    	     driver = new ChromeDriver();
    	     driver.manage().window().maximize();
    	     driver.get("https://www.saucedemo.com/");
    	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	     POMLoginClass pl = new POMLoginClass(driver);
    	     pl.sendUsername();
    	     pl.sendPassword();
    	     pl.clicklogin();
       }
       @AfterMethod
       public void teardown()
       {
    	   POMHomePageClass hp = new POMHomePageClass(driver);
    	   hp.clickMenu();
    	   hp.clickLogout();
    	    driver.close();
       }
}
