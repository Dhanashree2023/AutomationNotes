package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", 
glue = "StepDefinitions",
dryRun = false,
monochrome = true,
plugin = {"pretty", "html:target/cucumber_reports/datatable1.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
