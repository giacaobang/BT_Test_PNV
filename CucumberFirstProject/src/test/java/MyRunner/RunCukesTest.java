package MyRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by PC on 11/04/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/magicbrick.feature",
        plugin = {"pretty","html:target/cucumber-html-report"},
        tags = {}
)
public class RunCukesTest {
	
}

