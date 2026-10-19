package hooks;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	
	
	@Before
	public void setUpBrowser()
	{
		setUp();
	}
	
	@After
	public void closeBrowser()
	{
		tearDown();
	}
	

}
