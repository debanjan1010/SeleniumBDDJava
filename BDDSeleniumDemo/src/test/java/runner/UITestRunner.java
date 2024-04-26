package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", 
		glue = {"stepDefs", "hooks"},
		tags = "@PageObjectModel and @Chrome",
		//plugin = "html:target/cucumber-reports/index.html"
		plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		)

public class UITestRunner {

}
