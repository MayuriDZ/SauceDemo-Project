package com.SauceDemoProjectTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoProjectPOMClasses.POMHomePageClass;

public class TC03AddToCardFunctionality extends SauceDemoBaseClass
{
        @Test
        public void verifyAddToCardFunctionality()
        {
        	POMHomePageClass hp = new POMHomePageClass(driver);
        	hp.clickBackback();
        	hp.clickAddToCard();
        	
        	//Check validation
        	String exp = "1";
        	String act = hp.checkCount();
        	Assert.assertEquals(act, exp);
        	System.out.println("Single product successfully added in card.");
        }
}
