package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.AfterClass;
import utils.Report;

@CucumberOptions(features = {"src/test/resources/talentXFeature"}, glue = {"stepDefinition/talentX"},
        plugin = {"pretty",
//        "html:Report/cucumberReport.html"
        "html:test-output/SampleReport.html",
        "json:target/cucumber.json",
//        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)
public class TestRunner extends AbstractTestNGCucumberTests{
    @AfterClass
    public static void tearDown() {
        // Flush the Extent Reports after tests are done
        Report.flushReports();
    }


}