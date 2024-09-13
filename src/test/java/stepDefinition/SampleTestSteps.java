package stepDefinition;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import container.ActionClass;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.PageFactory;
import pages.LoginUI;
import utils.Report;
import utils.SharedDriver;

public class SampleTestSteps extends LoginUI {
    private ActionClass actionClass;
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


    @Then("the app should open successfully")
    public void the_app_should_open_successfully() throws InterruptedException {

//        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).sendKeys("8");
//        assert someElement.isDisplayed();
       clickEight();
//        try {
//            loginUI.clickEight(); // Ensure clickEight interacts with a valid element
//            Report.test.get().log(Status.PASS, "App opened and action completed successfully");
//        } catch (Exception e) {
//            Report.test.get().fail("Failed to click element: " + e.getMessage());
//        }
//        Report.test.get().log(Status.PASS, "App opened and action completed successfully");
    }
}



