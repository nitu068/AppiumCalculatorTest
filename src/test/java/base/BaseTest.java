package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.Constants;
import java.net.URL;

public class BaseTest {
    public static AndroidDriver driver;

    public void setup() {
        try {
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setCapability(MobileCapabilityType.DEVICE_NAME, Constants.DEVICE_NAME);
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, Constants.PLATFORM_NAME);
            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, Constants.APP_PACKAGE);
            dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, Constants.APP_ACTIVITY);
            dc.setCapability("noReset", true);

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
