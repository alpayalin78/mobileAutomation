package org.mobileautomationalpay.TestUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import mobileautomationalpay.utils.AppiumUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class AndroidBaseTest extends AppiumUtils {

    protected AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeTest
    public void ConfigureAppium() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//data.properties");
        String ipAddress = System.getProperty("ipAddress") != null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
        System.out.println(ipAddress);
        prop.load(fis);
        String port = prop.getProperty("port");

        DesiredCapabilities options = new DesiredCapabilities();
//        service = AppiumDriverLocalService.buildDefaultService();
//        service.start();

        options.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        options.setCapability("noReset", false);
        options.setCapability("autoGrantPermissions", "true");
        options.setCapability("appWaitActivity", "*");
        options.setCapability("appPackage", "com.google.android.youtube");
        options.setCapability("appActivity", "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }


    @AfterTest()
    public void tearDown() {
        driver.quit();
    }

}
