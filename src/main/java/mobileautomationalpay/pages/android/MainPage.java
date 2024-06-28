package mobileautomationalpay.pages.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileautomationalpay.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends AndroidActions {
    AndroidDriver driver;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement home_page_button;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement like_button;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement down_like_button;

    public MainPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        home_page_button.click();
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
