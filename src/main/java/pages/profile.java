package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Report;
import utils.SharedDriver;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Map;

public class profile extends Report {

        @FindBy(how = How.XPATH, using ="(//android.widget.TextView[@text=\"View more\"])[1]")
        public WebElement clickmyaccount;
        @FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Personal\"]")
        public WebElement clickpersonal;


        public profile ClickMyAccount() throws InterruptedException {
                clickmyaccount.click();
                Thread.sleep(6000);
                return this;
        }
        public profile ClickPersonaldetails()  {
                clickpersonal.click();
                return this;
        }

}
