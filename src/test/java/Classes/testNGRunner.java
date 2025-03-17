package Classes;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefinitions", monochrome=true, plugin= {"pretty", "html:target/swagLabs.html"})
public class testNGRunner extends AbstractTestNGCucumberTests{

}


