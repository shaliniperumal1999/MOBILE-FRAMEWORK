package pages;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.Report;
import utils.SharedDriver;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;

import static utils.Report.test;

public class LoginUI extends Report
{
     AndroidDriver driver;

    @FindBy(how = How.ID, using = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_08")
    public WebElement eight;

    public LoginUI() throws MalformedURLException
    {
        this.driver = SharedDriver.getCapabilities(); // Initialize the driver
        PageFactory.initElements(driver, this);
//        Report.test.get().info("App launched successfully"); // Initialize elements
//        test.get().info("App launched successfully");
    }
    public LoginUI clickEight()
    {
        eight.click();
//    if (eight != null) {
//            eight.click();
//            Report.test.get().info("Eight clicked successfully");
//        } else {
//            Report.test.get().fail("Element 'eight' was not initialized correctly.");
//        }
        return this;
    }
}
