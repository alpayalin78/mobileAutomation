package mobileautomationalpay.pages.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.MobileBy;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileautomationalpay.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.remote.RemoteWebDriver;


public class MainPage extends AndroidActions {
    AndroidDriver driver;

    WebElement main_page_button = driver.find(By.xpath("//android.widget.Button[@content-desc=\"Home\"]"));

    @AndroidFindBy(xpath= "//android.view.ViewGroup[@content-desc=\"Search YouTube\"]")
    private WebElement search_button_main_screen;

    @AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Search\"]")
    private WebElement search_button;

    @AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Notifications\"]")
    private WebElement notification_button;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id='com.google.android.youtube:id/mobile_topbar_avatar']")
    private WebElement profile_button;

    public MainPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void go_to_main_page(){
        main_page_button.click();
    }

    public void searchVideo(String searching_text,Integer video_quantity_to_be_checked) {
        // click search button
        // type video name + enter
        // video başlıklarını çek. return et.
    }

    public void searchVideo(String searching_text) {
        // click search button
        // type video name + enter
        // video başlıklarını çek.
    }

}
