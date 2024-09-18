package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.Report;
import utils.SharedDriver;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;
import java.util.Map;

public class LoginUI extends Report
{
     AndroidDriver driver;

    @FindBy(how = How.ID, using = "com.sec.android.app.popupcalculator:id/calc_keypad_btn_08")
    public WebElement eight;

    public LoginUI()

    {

        try {
            this.driver = SharedDriver.getCapabilities(); // Initialize the driver
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        PageFactory.initElements(driver, this);

    }
    public LoginUI clickEight(String heading)
    {
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).sendKeys(heading);

        // eight.click();
//    if (eight != null) {
//            eight.click();
//            Report.test.get().info("Eight clicked successfully");
//        } else {
//            Report.test.get().fail("Element 'eight' was not initialized correctly.");
//        }
        return this;
    }
}
