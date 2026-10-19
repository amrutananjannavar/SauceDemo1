package base;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.getCurrentUrl();
		driver.getTitle();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	

}


//use testng instead of junit for beforeclass and afterclass
