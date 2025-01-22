package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Session_3", glue = "StepDefinitionWithPOM", dryRun = false,
monochrome = false, tags = "@SmokeTest",
plugin = {"pretty", "html:target/cucumber_reports/report1.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
