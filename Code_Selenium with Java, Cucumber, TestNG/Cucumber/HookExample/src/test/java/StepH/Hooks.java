package StepH;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenaio()
	{
		System.out.println("Open the browser");
	}
	
	@After
	public void afterScenario()
	{
		System.out.println("Close the driver");
	}

}
