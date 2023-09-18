package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Amol\\eclipse-workspace_6\\cucumber_text\\src\\test\\java\\FirstProgram.feature",
glue = "StepDefinition",
dryRun = false,
monochrome = true,
plugin = {"pretty", "html:target/cucumber_reports/report1.html"})

public class TestRunner {

}
