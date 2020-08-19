package Runners;
//import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;

@CucumberOptions(
        plugin={"html:target/htmlReport/Atlanta.html","json:target/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportAtlanta.html"  },
        tags = {"@smoke"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false

)

public class SocialRunner extends AbstractTestNGCucumberTests {

@AfterClass
public void configReport(){
    Reporter.loadXMLConfig("src\\test\\java\\FeatureFiles\\extentRep.xml");
}

}
