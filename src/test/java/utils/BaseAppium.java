package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseAppium {

    @BeforeMethod
    @Parameters({"UDID_", "appPackage_", "appActivity_", "deviceName_", "androidVersion_", "appiumHost_", "nodeJsPort_"})
    protected void SetupAppium(String UDID_, String appPackage_, String appActivity_, String deviceName_,
                               String androidVersion_, String appiumHost_, String nodeJsPort_) throws
            MalformedURLException, InterruptedException {
        if (ThreadLocalDriver.getTLDriver() == null) {
            startServer(UDID_, appPackage_, appActivity_, deviceName_, androidVersion_, appiumHost_, nodeJsPort_);
        }
    }

    public void startServer(String UDID_, String appPackage_, String appActivity_, String deviceName_,
                            String androidVersion_, String appiumHost_, String nodeJsPort_) throws
            MalformedURLException, InterruptedException {


        File f = new File(System.getProperty("user.dir") + "/app");
        File fs = new File(f, "app-sandbox-debug.apk");

        // define device properties
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, androidVersion_);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName_);
        caps.setCapability(MobileCapabilityType.UDID, UDID_);
        caps.setCapability("appPackage", appPackage_);
        caps.setCapability("appActivity", appActivity_);
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        caps.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        caps.setCapability(MobileCapabilityType.NO_RESET, true);

        ThreadLocalDriver.setTlDriver(new AndroidDriver(new URL("http://" + appiumHost_ + ":" + nodeJsPort_ + "/wd/hub/"), caps));
        ThreadLocalDriver.getTLDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    protected synchronized void teardown(){

    }

}
