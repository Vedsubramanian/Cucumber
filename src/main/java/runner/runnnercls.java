package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/list.feature"},
glue="Stepdefinition",
plugin="html:target/htmlreport"
//tags={"@regression,@smoke"}
//tags={"~@regression"}
		)

public class runnnercls {
	

}
