package mobileautomationalpay.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileautomationalpay.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class SubscriptionPage extends AndroidActions {
    AndroidDriver driver;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement all_subscriptions_button;

    public SubscriptionPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void fetch_all_subscribed_users(String comment) {


    }

}
