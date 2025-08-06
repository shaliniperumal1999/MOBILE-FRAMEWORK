package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Report;
import utils.SharedDriver;

import java.net.MalformedURLException;

public class Personal extends Report {
    AndroidDriver driver;
    @FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Nationality\"]")
    public WebElement nationality;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text=\"Indian\"]")
    public WebElement Indian;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text=\"Blood Group\"]")
    public WebElement BloodGroup;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text=\"Father's name\"]]")
    public WebElement Fathername;
    @FindBy(how = How.XPATH,using = "//android.widget.TextView[@text=\"Email\"]")
    public WebElement Email;
    @FindBy(how = How.XPATH,using = "//android.widget.EditText[@text=\"Address Line 1\"]")
    public WebElement Address;
    @FindBy(how = How.XPATH,using = "//android.widget.EditText[@text=\"City\"]")
    public WebElement City;
    @FindBy(how = How.XPATH,using = "//android.widget.EditText[@text=\"Pincode\"]")
    public WebElement Pincode;
    @FindBy(how = How.XPATH,using = "//android.view.ViewGroup[@content-desc=\"Update\"]")
    public WebElement Update;






    public Personal() {
        super();

        try {
            this.driver = SharedDriver.getCapabilities(); // Initialize the driver
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        PageFactory.initElements(driver, this);

    }
    public Personal ClickNationality() {
        nationality.click();
        return this;
    }
    public Personal ClickIndian() {
        Indian.click();
        return this;
    }
    public Personal EnterBloodGroup(String Bloodgroup) {
        BloodGroup.sendKeys(Bloodgroup);
        return this;
    }
    public Personal EnterFathername(String Fathername) {
        BloodGroup.sendKeys(Fathername);
        return this;
    }
    public Personal ClickEmail() {
        Email.click();
        return this;
    }
    public Personal EnterAddressLine1(String AddressLine1) {
        Address.sendKeys(AddressLine1);
        return this;
    }
    public Personal ClickCity() {
        City.click();
        return this;
    }
    public Personal EnterCity(String cityName) {
        City.sendKeys(cityName);
        return this;
    }

    public Personal EnterPincode(String pincode) {
       Pincode.sendKeys(pincode);
        return this;
    }
    public Personal ClickUpdateButton() {
        Update.click();
        return this;
    }
    public Personal UploadImage(String imagePath) {
        Update.click();
        return this;
    }





}
