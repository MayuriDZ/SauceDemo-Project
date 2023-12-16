package com.SauceDemoProjectTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoProjectPOMClasses.POMCartPageClass;
import com.SauceDemoProjectPOMClasses.POMHomePageClass;

public class TC06RemoveProductFromCardFunctionality extends SauceDemoBaseClass
{
           @Test
           public void verifyRemoveProductFromCard() throws InterruptedException
           {
        	   POMHomePageClass hp = new POMHomePageClass(driver);
        	   Thread.sleep(1000);
        	   hp.clickAddToCard();
        	   hp.clickCart();
        	   POMCartPageClass cp = new POMCartPageClass(driver);
        	   cp.clickRemovebtn();
        	   Thread.sleep(2000);
        	   
        	   
        	   
        	   // check validation
        	   String exp = "0";
        	   String act = hp.checkCount();
        	   Assert.assertEquals(act, exp);
           	System.out.println("Remove product from card sucessfully.");
        	   
           }
}
