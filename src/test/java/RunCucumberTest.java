import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        monochrome = true,
        features = {"./src/test/resources/Features"},
        tags = {"test1"}
)


public class RunCucumberTest {
}
