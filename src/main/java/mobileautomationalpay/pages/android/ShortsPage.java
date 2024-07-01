package mobileautomationalpay.pages.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileautomationalpay.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class ShortsPage extends AndroidActions {
    AndroidDriver driver;

    @AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"More\"]")
    private WebElement three_dot_right_upper_corner;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.google.android.youtube:id/list_item_text\" and @text=\"Save to playlist\"]")
    private WebElement three_dot_save_play_to_playlist;

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.google.android.youtube:id/list_item_text\" and @text=\"Description\"]")
    private WebElement three_dot_description;

    @AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Search\"]")
    private WebElement search_button;

    @AndroidFindBy(id="com.google.android.youtube:id/reel_dyn_like")
    private WebElement like_button;

    @AndroidFindBy(id="com.google.android.youtube:id/reel_dyn_dislike")
    private WebElement down_like_button;

    @AndroidFindBy(id="com.google.android.youtube:id/reel_dyn_comment")
    private WebElement comment_button;

    @AndroidFindBy(id="com.google.android.youtube:id/reel_dyn_share")
    private WebElement share_button;


    public ShortsPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//        shorts_button.click();
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
