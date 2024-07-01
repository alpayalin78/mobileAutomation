package mobileautomationalpay.pages.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileautomationalpay.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends AndroidActions{
    AndroidDriver driver;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement home_page_button;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement search_button;

    public SearchPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void searchVideo(String searching_text, Integer video_quantity_to_be_checked) {
        // click search button
        // type video name + enter
        // video başlıklarını çek. return et.
    }

}
