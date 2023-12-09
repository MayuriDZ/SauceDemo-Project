package com.SauceDemoProjectPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMCheckoutInfoClass
{
	WebDriver driver;
	
	// Constructor
      public POMCheckoutInfoClass(WebDriver driver)
      {
    	  this.driver = driver;
    	  PageFactory.initElements(driver, this);  
      }
          
	@FindBy(xpath="//a[@class='shopping_cart_link']")
    private WebElement shoppingcard;
	
	@FindBy(xpath="//button[@id='checkout']")
    private WebElement checkoutbtn;
	
	@FindBy(xpath="//input[@id='first-name']")
    private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
    private WebElement lastname;
	
	@FindBy(xpath="//input[@id='postal-code']")
    private WebElement postalcode;
	
	@FindBy(xpath="//input[@id='continue']")
    private WebElement continuebtn;
	
	@FindBy(xpath="//button[@id='finish']")
	 private WebElement finishbtn;
	
	// Methods
	public void clickShopingCard()
	{
		shoppingcard.click();
	}
	public void clickCheckout()
	{
		checkoutbtn.click();
	}
	public void sendFirstname()
	{
		firstname.sendKeys("Riya");
	}
	public void sendLastname()
	{
		lastname.sendKeys("Sharma");
	}
	public void sendpostalcode()
	{
		postalcode.sendKeys("4608881");
	}
	public void clickContinue()
	{
		continuebtn.click();
	}
	public void clickFinish()
	{
		finishbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
