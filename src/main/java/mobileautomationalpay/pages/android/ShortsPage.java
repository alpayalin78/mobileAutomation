package mobileautomationalpay.pages.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileautomationalpay.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class ShortsPage extends AndroidActions {
    AndroidDriver driver;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement shorts_button;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement like_button;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement down_like_button;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement comment_button;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement subscribe_button;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement account_visit_button;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")
    private WebElement share_reel_button;

    public ShortsPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        shorts_button.click();
    }
//    driver.findElement(By.xpath("//android.widget.TextView[@content-desc='YouTube']")).click();
//    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Shorts']")).click();

    public void giveReaction(String reaction_type) {


    }


    public void leaveComments(String comment) {


    }


    public void subscribeAccount() {


    }


    public void visitAccount() {


    }


    public void shareReel() {


    }


    public void collectReelData() {


    }


}
