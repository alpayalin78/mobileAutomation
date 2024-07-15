package mobileautomationalpay.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.util.UUID;

public abstract class AppiumUtils {

    public AppiumDriverLocalService service;
    Date now = new Date();

//    public AppiumDriverLocalService startAppiumServer(String ipAddress, int port) {
////        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\alpay\\AppData\\Roaming\\npm\\node_modules\\appium-uiautomator2-driver\\build\\index.js"))
////                .withIPAddress(ipAddress).usingPort(port).build();
////        service = AppiumDriverLocalService.buildDefaultService();
////        return service;
//    }

    public String date_timer() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        String formattedDate = now.format(formatter);

        return formattedDate;
    }

    public String uuid_generator(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public String getScreenshotPath(String testCaseName, AppiumDriver driver, String uuid) throws IOException {
        File source = driver.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir") + "//reports//" + "//" + uuid + "//" + testCaseName + date_timer() + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
        return destinationFile;
        //1. capture and place in folder //2. extent report pick file and attach to report


    }
}
