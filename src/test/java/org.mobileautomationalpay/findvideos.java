package org.mobileautomationalpay;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.mobileautomationalpay.TestUtils.AndroidBaseTest;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class findvideos extends AndroidBaseTest {

    @BeforeTest
    public void preSetup() throws IOException {
        ConfigureAppium();
    }

    @Test
    public void FillForm_ErrorValidation() throws InterruptedException {
//      System.out.println(driver.getSessionId());
        //	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rahul Shetty");
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='YouTube']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")).click();

        Dimension dimension = driver.manage().window().getSize()
        int starting_point_x = (int) (dimension.width * 0.5)
        int starting_point_y = (int) (dimension.height * 0.5)
        int end_point_x = (int) (dimension.width * 0.5)
        int end_point_y = (int) (dimension.height * 0.9)

//        TouchAction touch = new TouchAction(driver);
//        touch.press(PointOption.point(starting_point_x, starting_point_y))
//                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//                .moveTo(PointOption.point(end_point_x, end_point_y)).release().perform();

//        WebElement source = (MobileElement) driver.findElementsByAccessibilityId("SomeAccessibilityID");
//        WebElement target = (MobileElement) driver.findElementsByAccessibilityId("SomeOtherAccessibilityID");
//        Point source = dragMe.getCenter();
//        Point target = driver.findElementByAccessibilityId("dropzone").getCenter();
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence dragNDrop = new Sequence(finger, 1);
//        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), source.x, source.y));
//        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), target.x, target.y));
//        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(Arrays.asList(dragNDrop));

        driver.findElement(By.id("com.google.android.youtube:id/reel_dyn_like")).click();

//        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
//        driver.findElement(By.id("android:id/text1")).click();
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
//        driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
//        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//        String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//        AssertJUnit.assertEquals(toastMessage,"Please your name");
    }


    @Test
    public void FillForm_PositiveFlow() throws InterruptedException {
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rahul Shetty");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.widget.Toast)[1]")).size() < 1);


    }
}
