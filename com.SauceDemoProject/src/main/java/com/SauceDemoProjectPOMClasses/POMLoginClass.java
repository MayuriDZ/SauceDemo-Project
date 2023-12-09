package com.SauceDemoProjectPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginClass 
{
      WebDriver driver;
      //constructor
      public POMLoginClass(WebDriver driver)
      {
    	  this.driver  = driver;
    	  PageFactory.initElements(driver, this);
      }
      @FindBy(xpath="//input[@id='user-name']")
      private WebElement username;
      
      @FindBy(xpath="//input[@id='password']") 
      private WebElement password;
      
      @FindBy(xpath="//input[@id='login-button']") 
      private WebElement login;
      
      public void sendUsername()
      {
    	  username.sendKeys("standard_user");
      }
      public void sendPassword()
      {
    	  password.sendKeys("secret_sauce");
      }
      public void clicklogin()
      {
    	  login.click();
      }
}
