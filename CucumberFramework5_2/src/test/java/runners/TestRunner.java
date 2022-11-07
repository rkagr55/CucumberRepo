package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
					features="src/test/resources/featureFiles", 
					glue= {"stepDefinitions"}, 
					monochrome=true,  
					plugin = {"pretty","json:target/cucumber.json"} 
					,dryRun = false
					,snippets = SnippetType.UNDERSCORE				
				)
public class TestRunner{}