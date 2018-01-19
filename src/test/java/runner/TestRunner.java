package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.StepDefinitionReporter;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.*;
import org.testng.internal.TestResult;

@CucumberOptions(
        features = {"src/test/java/features"},
        format = {"json:target/cucumber.json",
                "html:target/site/cucumber-pretty"},
        glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests{
}
