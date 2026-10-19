package testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import util.WaitUtil;

public class LoginTestng extends BaseClass {
	
	//public WebDriver driver;
	  WaitUtil waitUtil;
	
	
	@Test
	public void verifyLogin()
	{
		LoginPage login=new LoginPage(driver);
		waitUtil = new WaitUtil(driver);
		login.enteruserName("standard_user");
		login.enterpassword("secret_sauce");
		login.enterlogin();
		
		   // Wait for dashboard
        waitUtil.waitForDashboard(
            org.openqa.selenium.By.className("title"));
	}
	

}
