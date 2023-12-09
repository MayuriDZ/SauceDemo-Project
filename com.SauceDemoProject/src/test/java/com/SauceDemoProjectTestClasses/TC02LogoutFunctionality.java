package com.SauceDemoProjectTestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02LogoutFunctionality extends SauceDemoBaseClass
{
          @Test
          public void verifyLogout()
          {
        	  String exp = "https://www.saucedemo.com/inventory.html";
        	  String act = driver.getCurrentUrl();
        	  Assert.assertEquals(act, exp);
        	  System.out.println("Logout Sucessfully.");
          }
}
