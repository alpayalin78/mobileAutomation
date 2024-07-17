package mobileautomationalpay.pages.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileautomationalpay.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class ShortsPage extends AndroidActions {
    AndroidDriver driver;
    private By three_dot_right_upper_corner = By.xpath("//android.widget.ImageView[@content-desc='More']");
    private By three_dot_save_play_to_playlist = By.id("//android.widget.TextView[@resource-id='com.google.android.youtube:id/list_item_text' and @text='Save to playlist']");
    private By three_dot_description = By.xpath("//android.widget.TextView[@resource-id='com.google.android.youtube:id/list_item_text' and @text='Description']");
    private By search_button = By.xpath("//android.widget.ImageView[@content-desc='Search']");
    private By like_button = By.id("com.google.android.youtube:id/reel_dyn_like");
    private By down_like_button = By.id("com.google.android.youtube:id/reel_dyn_dislike");
    private By comment_button = By.id("com.google.android.youtube:id/reel_dyn_comment");
    private By add_comment_section = By.xpath("//android.widget.EditText[@text='Add a comment...']");
    private By add_comment_button_detail = By.xpath("//android.widget.EditText[@content-desc='Add a comment...']");
    private By send_comment_button_detail = By.xpath("//android.view.ViewGroup[@content-desc='Send comment']/android.widget.ImageView");
    private By comment_filter = By.xpath("//android.widget.ImageView[@content-desc='Sort comments']");
    private By close_comment_section = By.xpath("//android.widget.ImageView[@content-desc='Close']");
    private By top = By.xpath("//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Top comments']");
    private By newest_comments = By.xpath("//android.widget.TextView[@resource-id='com.google.android.youtube:id/text' and @text='Newest first']");
    private By last_comments = By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.youtube:id/results']/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]");
    private By comment_username = By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.youtube:id/results']/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
    private By comment_like_button = By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.youtube:id/results']/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
    private By comment_dislike_button = By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.youtube:id/results']/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]");
    private By comment_reply_button = By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.youtube:id/results']/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[3]");
    private By comment_add_reply_keys = By.xpath("//android.widget.EditText[@content-desc='Add a reply...']");
    private By number_of_comments_on_video = By.xpath("//android.widget.FrameLayout[@resource-id='com.google.android.youtube:id/panel_header']/android.widget.FrameLayout");
    private By swipe_up_icon = By.xpath("//android.widget.ImageView[@resource-id='com.google.android.youtube:id/reel_persistent_edu_button_anim_icon']");

    private By commentor_user = By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.youtube:id/results']/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
    private By comment_add_reply_button = By.xpath("//android.view.ViewGroup[@content-desc='Send comment, disabled']/android.widget.ImageView");

    private By share_button = By.id("com.google.android.youtube:id/reel_dyn_share");
    private By reel_main_title = By.id("com.google.android.youtube:id/reel_main_title");
    private By subscribe_channel_button = By.xpath("//android.widget.FrameLayout[@resource-id='com.google.android.youtube:id/elements_top_channel_bar_container']/android.view.ViewGroup/android.view.ViewGroup[2]");
    private By shorts_page_button = By.xpath("//android.widget.Button[@content-desc='Shorts']");
    private By short_owner_description_text = By.xpath("//android.widget.FrameLayout[@resource-id='com.google.android.youtube:id/elements_top_channel_bar_container']/android.view.ViewGroup");
    private By short_owner_subscriber_name = By.xpath("//android.widget.FrameLayout[@resource-id='com.google.android.youtube:id/elements_top_channel_bar_container']/android.view.ViewGroup/android.view.ViewGroup[1]");


    public ShortsPage(AndroidDriver driver) throws InterruptedException {
        super(driver);
        this.driver = driver;
        this.go_to_shorts_page();
        }

    public void go_to_shorts_page() throws InterruptedException {
        this.find_element(shorts_page_button, false).click();
        this.pass_swipe_up_animation();
    }

    public void pass_swipe_up_animation() throws InterruptedException {
        if (this.find_element(swipe_up_icon, true).isDisplayed()) {
            this.find_element(swipe_up_icon, false).click();
        }
    }

    public void like_reaction(Integer interaction_number, String uuid_to) throws InterruptedException, IOException {

        for (int ln = 0; ln <= interaction_number; ln++){
            this.find_element(this.like_button, false).click();
            this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);
            swipeActionShorts(0.5F, 0.8F, 0.5F, 0.2F);
        }
    }

    public void dislike_reaction(Integer interaction_number, String uuid_to) throws InterruptedException, IOException {
        for (int ln = 0; ln <= interaction_number; ln++){
            this.find_element(this.down_like_button, false).click();
            this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);
            swipeActionShorts(0.5F, 0.85F, 0.5F, 0.1F);
        }
    }

    public void leave_comments(Integer interaction_number, String text_to_comment, String uuid_to) throws InterruptedException, IOException {
        for (int ln = 0; ln <= interaction_number; ln++){
            this.find_element(comment_button, false).click();
            this.find_element(add_comment_section, false).sendKeys(text_to_comment);
            this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);
            this.find_element(send_comment_button_detail, false).click();
            this.find_element(close_comment_section, false).click();
            swipeActionShorts(0.5F, 0.85F, 0.5F, 0.1F);
        }
    }

    public void get_shorts_detail(Integer interaction_number, String uuid_to) throws InterruptedException, IOException {
        for (int ln = 0; ln <= interaction_number; ln++){
            String reel_main_title_text = this.find_element(reel_main_title, false).getAttribute("contentDescription");
            swipeActionShorts(0.5F, 0.85F, 0.5F, 0.1F);
        }
    }

    public void subscribe_account(Integer interaction_number, String uuid_to) throws InterruptedException, IOException {
        for (int ln = 0; ln <= interaction_number; ln++){
            if (this.find_element(subscribe_channel_button, true).isDisplayed()){
                this.find_element(this.subscribe_channel_button, false).click();
                this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);
                swipeActionShorts(0.5F, 0.85F, 0.5F, 0.1F);
            }
            else {
                swipeActionShorts(0.5F, 0.85F, 0.5F, 0.1F);
            }
        }
    }
}
