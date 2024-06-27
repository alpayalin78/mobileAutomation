package org.mobileautomationalpay.TestUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import mobileautomationalpay.utils.AppiumUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.AfterTest;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class AndroidBaseTest extends AppiumUtils {

    protected AndroidDriver driver;
    public AppiumDriverLocalService service;

    public void ConfigureAppium() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//mobileautomationalpay//resources//data.properties");
        String ipAddress = System.getProperty("ipAddress") != null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
        System.out.println(ipAddress);
        prop.load(fis);
        //String ipAddress = prop.getProperty("ipAddress");
        String port = prop.getProperty("port");

//		service = startAppiumServer(ipAddress,Integer.parseInt(port));
//        service = AppiumDriverLocalService.buildDefaultService();
//        service.start();

        //options.setDeviceName("Android Device");// real device
//			options.setChromedriverExecutable("//Users//rahulshetty//documents//chromedriver 11");
//        options.setApp("D:/mobileAutomation/mobileAutomation/src/test/java/org.mobileautomationalpay/resources/General-Store.apk");
//        UiAutomator2Options options = new UiAutomator2Options();
        DesiredCapabilities options = new DesiredCapabilities();

        options.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
//        options.setCapability(MobileCapabilityType.APP, "D:/mobileAutomation/mobileAutomation/src/test/java/org.mobileautomationalpay/resources/General-Store.apk");
//        options.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
        options.setCapability("noReset", false);
        options.setCapability("autoGrantPermissions", "true");
        options.setCapability("appWaitActivity", "*");

        driver = new AndroidDriver(new URL("http://localhost:4721"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.getSessionId());

    }


    @AfterTest()
    public void tearDown() {
        driver.quit();
    }

}
