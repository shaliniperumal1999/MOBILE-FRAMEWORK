package stepDefinition;
import com.aventstack.extentreports.ExtentTest;
//import container.ActionClass;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import pages.LoginUI;
import utils.Excelutil;

public class SampleTestSteps extends LoginUI {

   // private ActionClass actionClass;
    private ExtentTest test;

    AndroidDriver driver;
    private LoginUI loginUI;

    public SampleTestSteps() throws MalformedURLException {
        super(); // This calls the constructor of LoginUI
        // Initialize the ExtentTest
//        ExtentTest testInstance = Report.createTest("Sample Test Steps");
//        test.set(testInstance); // Set current ExtentTest to ThreadLocal
    }

    //    @Before // Cucumber hook to run before each scenario
//    public void setup() {
//        Report.setup(); // Set up the Extent Reports
//        Report.createTest("Sample Test Steps"); // Create a test for this scenario
//    }
    @Given("the app is launched")
    public void the_app_is_launched() throws MalformedURLException {
//      driver=SharedDriver.getCapabilities();
//        // Initialize page elements
//        PageFactory.initElements(driver, this);
        System.out.println("Launched Successfully");
//        test.get().log(Status.INFO, "Driver opened");
    }

    @When("enter the value {string} and {int}")
    public void enter_the_value_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        Excelutil reader = new Excelutil();
//        List<Map<String, String>> testData =
//                reader.getData("input/mobileautomation.xlsx", sheetName);
//
//        String heading = testData.get(rowNumber).get("abc");
//
//        System.out.println("Heading:" + heading);
//        clickEight(heading);
//        Excelutil reader = new Excelutil();
        List<String> columnData = reader.getColumnData("input/mobileautomation.xlsx", "sample", "abc");

        for (String value : columnData) {
            System.out.println("Value New Method: " + value);
            // Example action for each value
            /* clickEight(value);*/
        }

    }
    @Then("the app should open successfully")
        public void the_app_should_open_successfully() {
            System.out.println("check:");
        }

        }







