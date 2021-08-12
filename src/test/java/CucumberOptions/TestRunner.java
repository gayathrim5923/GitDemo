package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/features", tags="@SeleniumTest",
		glue="StepDefinition" ,stepNotifications=true, plugin={"pretty","html:target/cucumber.html","json:target/cucumbe.json","junit:target/cucumber.xml"},monochrome=true )
public class TestRunner {

}
