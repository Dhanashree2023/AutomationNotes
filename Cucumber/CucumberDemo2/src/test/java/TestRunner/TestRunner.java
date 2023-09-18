package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
glue = "StepDefinition",
dryRun = false,
monochrome = true,
plugin = {"pretty", "html:target/cucumber_reports/report1.html"})

public class TestRunner {

}
