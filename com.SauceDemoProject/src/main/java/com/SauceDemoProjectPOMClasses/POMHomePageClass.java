package com.SauceDemoProjectPOMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMHomePageClass 
{
     WebDriver driver;
     // Constructor
     public POMHomePageClass(WebDriver driver)
     {
    	 this.driver = driver;
    	 PageFactory.initElements(driver, this);
     }
     @FindBy(xpath="//button[@id='react-burger-menu-btn']")
     private WebElement menu;
     
     @FindBy(xpath="//a[@id='logout_sidebar_link']")
     private WebElement logout;
     
     @FindBy(xpath ="//div[text()='Sauce Labs Backpack']")
     private WebElement Backpack;
     
     @FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
     private WebElement addToCard;
     
    @FindBy(xpath="//span[@class='shopping_cart_badge']")
    private WebElement cardBadge;
    
     @FindBy(xpath="//button[text()='Add to cart']")
     private List <WebElement> multipleProductIncard;
     
     @FindBy(xpath="//a[contains(@class,'shopping_cart_link')]")    //xpath by contains 
     private WebElement cartlink;
     
     // Methods 
     public void clickMenu()
     {
    	 menu.click();
     }
     public void clickLogout()
     {
    	 logout.click();
     }
     public void clickBackback()
     {
    	 Backpack.click();
     }
     
     public void clickAddToCard()
     {
    	 addToCard.click();
     }
     public String checkCount()
     {
    	 String value = cardBadge.getText();
		return value;   	 
     }
     public void addMultipleProdct()
     {
    	 for(int i = 0; i<multipleProductIncard.size(); i++)
    	 {
    		 multipleProductIncard.get(i).click();
    	 }
     }
     public void clickCart()
     {
    	 cartlink.click();
     }
}
