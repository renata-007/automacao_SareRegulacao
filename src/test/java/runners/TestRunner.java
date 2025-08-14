package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD
        features = "src/test/resources/features",
        glue = "steps",
=======
        features = "src/test/resources/features/login.feature",
        glue = {"steps", "support"},
>>>>>>> 4f5bb35 (Acesso correto a DSV e clique em Minhas aplicações)
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class TestRunner {
}
