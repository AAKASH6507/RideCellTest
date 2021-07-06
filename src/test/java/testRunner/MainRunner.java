package testRunner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;

@RunWith(Karate.class)
@KarateOptions
(features = {"classpath:apifeatures"}, tags = {"@RDCELL001"} )
public class MainRunner {
	   
	@BeforeClass
	public static void config() {
		//System.setProperty("karate.env", "pre-prod");
	}
    

}
