package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,
		features= {"./FeatureFiles/FlightLogin.feature",("./FeatureFiles/FlightSignUp.feature")},
		monochrome=true,
		glue= {"stepDefinition"},
		tags= ("@Signup not,@Login")
		//tags=("	tags= (\"@Signup\" \"@SignIn\")")
		)
public class TestRunner   extends AbstractTestNGCucumberTests{

}

