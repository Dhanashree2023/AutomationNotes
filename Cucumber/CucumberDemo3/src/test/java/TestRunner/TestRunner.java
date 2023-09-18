package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features = {".//Features/Customerss.feature", ".//Features/Simple.feature"},

@CucumberOptions(features = ".//Features/Customerss.feature", 
glue = "StepDefinition",
dryRun = false,
monochrome = true,
//plugin = {"pretty", "html:target/cucumber_reports/report1.html","html:target/cucumber_reports/report1.json","html:target/cucumber_reports/report1.xml"})
plugin = {"pretty", "html:target/cucumber_reports/AddNewCustomerReport.html"})

public class TestRunner {

}
