package StepRun;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.Feature", glue= "com.exemple.StepDefinition")
public class TestRunner {

}
