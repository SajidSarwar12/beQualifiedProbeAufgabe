package Classes;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefinitions", tags="@StandardUser", monochrome=true, plugin= {"pretty", "html:Reports/swagLabs.html"})
public class testNGRunner extends AbstractTestNGCucumberTests{

	
}


