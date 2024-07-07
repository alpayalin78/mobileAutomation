package mobileautomationalpay.utils;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public abstract class AppiumUtils {

    public AppiumDriverLocalService service;

//    public AppiumDriverLocalService startAppiumServer(String ipAddress, int port) {
////        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\alpay\\AppData\\Roaming\\npm\\node_modules\\appium-uiautomator2-driver\\build\\index.js"))
////                .withIPAddress(ipAddress).usingPort(port).build();
////        service = AppiumDriverLocalService.buildDefaultService();
////        return service;
//    }

}
