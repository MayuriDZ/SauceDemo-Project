package com.SauceDemoProjectTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01LoginFunctionality extends SauceDemoBaseClass
{
           @Test
           public void verifyLogin()
           {
        	   String exp = "https://www.saucedemo.com/inventory.html";
        	   String act  = driver.getCurrentUrl();
        	   Assert.assertEquals(act, exp);
        	   System.out.println("Login Sucessfully.");
           }
}
