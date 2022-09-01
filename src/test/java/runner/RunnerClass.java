package runner;

import org.junit.runner.*;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features ={"src\\test\\java\\features\\BackgroundColor.feature"}, glue = "steps", tags = "@Regression" ,monochrome = true,

		plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json" })
public class RunnerClass {

}

