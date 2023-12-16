package com.SauceDemoProjectPOMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMCartPageClass
{
         WebDriver driver;
         //Constructor
         public POMCartPageClass(WebDriver driver)
         {
        	 this.driver = driver;
        	 PageFactory.initElements(driver, this);
         }
         @FindBy(xpath="//button[contains(text(),'Remove')]")
         private List <WebElement> removebtn ;
         
         //methods
         public void clickRemovebtn()
         {
        	 for(int i=0; i<removebtn.size(); i++)
        	 {
        		 removebtn.get(i).click();
        	 }
         }
}
