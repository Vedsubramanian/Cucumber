package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/sample1.feature"},
glue="Stepdefinition",
plugin="json:target/jsonreport"
//tags={"@regression,@smoke"}
//tags={"~@regression"}
		)

public class runnnercls {
	

}
