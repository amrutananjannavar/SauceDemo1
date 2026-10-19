package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.WaitUtil;

public class LoginPage {
	
	public WebDriver driver;
	 private WaitUtil waitUtil;
	
	//constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		 this.waitUtil = new WaitUtil(driver);
	}
	
	//locators
	By username=By.id("user-name");
	By password=By.id("password");
	By login=By.id("login-button");
	
	
	/*//methods or actions
	public void enteruserName(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterpassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void enterlogin()
	{
		driver.findElement(login).click();
	}
			

}*/
	
	 // Dashboard locator - example for SauceDemo
    By dashboard = By.className("title");

    // Enter username
    public void enteruserName(String user) {
        waitUtil.waitForUsername(username).sendKeys(user);
    }

    // Enter password
    public void enterpassword(String pass) {
        waitUtil.waitForPassword(password).sendKeys(pass);
    }

    // Click login button
    public void enterlogin() {
        waitUtil.waitForLoginButton(login).click();
    }

    // Wait for dashboard after successful login
    public void waitForDashboard() {
        waitUtil.waitForDashboard(dashboard);
    }
}


/*

page factory

public class LoginPageFactory
{

public WebDriver driver;

//constructor
public LoginPageFactory(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(this.driver, this);
}

//locators
@FindBy(id="username")
WebElement username;

//methods
public void enterusername(String user)
{
username.sendKeys(user);
}}



 */


