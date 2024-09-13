package container;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LoginUI;

import java.net.MalformedURLException;
import java.net.URL;

public class ActionClass {
    public static AndroidDriver driver;
    public static AndroidDriver getCapabilities() throws MalformedURLException {

        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A21s");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
            capabilities.setCapability(MobileCapabilityType.UDID, "RZ8N609NS9X");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
            capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        }

        return driver;


    }
//
//    public static  clickEight(){
//        eight.click();
//    }
}
