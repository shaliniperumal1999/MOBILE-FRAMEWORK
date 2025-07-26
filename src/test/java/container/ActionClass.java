/*
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
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 11 Pro 5G");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
            capabilities.setCapability(MobileCapabilityType.UDID, "29422bee4287");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            capabilities.setCapability("appPackage", "com.venzo.talntx");
            capabilities.setCapability("appActivity", "com.venzo.talntx.MainActivity");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        }

        return driver;


    }
//
//    public static  clickEight(){
//        eight.click();
//    }
}
*/
