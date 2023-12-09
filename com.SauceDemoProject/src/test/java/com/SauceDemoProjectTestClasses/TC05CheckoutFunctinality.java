package com.SauceDemoProjectTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoProjectPOMClasses.POMCheckoutInfoClass;
import com.SauceDemoProjectPOMClasses.POMHomePageClass;

public class TC05CheckoutFunctinality extends SauceDemoBaseClass
{
        @Test
        public void verifyCheckoutFunctionality()
        {
        	POMHomePageClass hp = new POMHomePageClass(driver);
        	hp.clickBackback();
        	hp.clickAddToCard();
        	
        	POMCheckoutInfoClass cp = new POMCheckoutInfoClass(driver);
        	cp.clickShopingCard();
        	cp.clickCheckout();
        	cp.sendFirstname();
        	cp.sendLastname();
        	cp.sendpostalcode();
        	cp.clickContinue();
        	cp.clickFinish();
        	
        	// Check Validation
        	String exp = "https://www.saucedemo.com/checkout-complete.html";
        	String act = driver.getCurrentUrl();
        	Assert.assertEquals(act, exp);
        	System.out.println("Checkout Sucessfully.");
        }
	
	
	
	
	 
}
