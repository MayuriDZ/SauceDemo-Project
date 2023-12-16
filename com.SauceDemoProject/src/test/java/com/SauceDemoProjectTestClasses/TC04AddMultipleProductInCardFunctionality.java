package com.SauceDemoProjectTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoProjectPOMClasses.POMHomePageClass;

public class TC04AddMultipleProductInCardFunctionality extends SauceDemoBaseClass
{
      @Test 
       public void verifyAddMultipleProductInCardFunctionality() throws InterruptedException
       {
    	  POMHomePageClass hp = new POMHomePageClass(driver);
    	  Thread.sleep(2000);
    	  hp.addMultipleProdct();
    	  
    	  // Check Validation
    	  String exp = "3";
    	  String act = hp.checkCount();
    	  Assert.assertEquals(act, exp);
    	  System.out.println("Multiple products successfully added in card.");
       }
}
