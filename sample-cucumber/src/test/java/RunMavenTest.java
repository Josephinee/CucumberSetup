import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( strict = true,
        features = {"src/test/resource"}
)


public class RunMavenTest {

}
