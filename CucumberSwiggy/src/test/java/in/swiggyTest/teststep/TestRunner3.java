package in.swiggyTest.teststep;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "Features",
		glue = "in.swiggy.teststeps"
		)

public class TestRunner3 extends AbstractTestNGCucumberTests {

}