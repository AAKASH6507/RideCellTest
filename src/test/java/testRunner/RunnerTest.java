package testRunner;
import org.junit.BeforeClass;

import com.intuit.karate.KarateOptions;

@SuppressWarnings("deprecation")
@KarateOptions(
        features = {"classpath:features"}, tags = {"@tag2"})
public class RunnerTest {
	@BeforeClass
	public static void config() {
		System.setProperty("karate.env", "pre-prod");
	}
	
}