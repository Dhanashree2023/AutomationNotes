package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "DataTableex", glue = "StepDataTable", dryRun = false,
monochrome = true,
plugin = {"pretty","html:target/cucumberReport/Report.html"})
		
public class TestRunner extends AbstractTestNGCucumberTests{

}




