package mobileautomationalpay.pages.android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import mobileautomationalpay.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;

public class SearchPage extends AndroidActions {
    AndroidDriver driver;

    private By search_button = By.xpath("//android.widget.ImageView[@content-desc='Search']");
    private By search_button_text = By.id("com.google.android.youtube:id/search_edit_text");
    private By search_results = By.xpath("(//android.view.ViewGroup[@resource-id='com.google.android.youtube:id/linearLayout'])[%s]");
    private By search_video_results = By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.youtube:id/results']/android.view.ViewGroup[%s]//android.widget.ImageView[@content-desc='Go to channel']");
    private By options = By.xpath("//android.widget.ImageButton[@content-desc='Filter']");
    private By search_filter = By.xpath("//android.widget.TextView[@resource-id='com.google.android.youtube:id/title' and @text='Search filters']");
    private By type_filter = By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='All']");
    private By type_filter_video_dropdown = By.xpath("//android.widget.CheckedTextView[@resource-id='com.google.android.youtube:id/spinner_dropdown_item' and @text='Video']");
    private By apply_filter = By.xpath("//android.widget.Button[@resource-id='com.google.android.youtube:id/apply']");
    private By search_clear = By.xpath("//android.widget.ImageView[@content-desc='Clear']");


    public SearchPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void scrollElementIntoView(Integer index_video) throws InterruptedException {
        int maxScrollAttempts = 5;
        int scrollAttempts = 0;
        boolean elementFound = false;
        Integer index_video_ts = 1;
        String search_result_video = String.format("//android.widget.ImageView[@content-desc='Go to channel'][%s]", index_video_ts);
        By search_result_video_locator = By.xpath(search_result_video);

        while (scrollAttempts < maxScrollAttempts) {
            try {
                if (this.find_element(search_result_video_locator, true).isDisplayed()) {
                    String content_locator = String.format("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.youtube:id/results']/android.view.ViewGroup[%s]/android.view.ViewGroup[1]", index_video);
                    By content_locator_by_xpath = By.xpath(content_locator);
                    String found_video_content = this.find_element(content_locator_by_xpath, false).getAttribute("contentDescription");
                    System.out.println(found_video_content);
                    break;
                }
            } catch (Exception e) {
                swipeActionShorts(0.5F, 0.8F, 0.5F, 0.4F);
                System.out.println("Scrolling...");
            }
            scrollAttempts++;
        }
    }

    public void searchVideo(ArrayList<String> searching_text, Integer video_search_quantity_to_be_checked, Integer video_quantity_to_be_checked, String uuid_to) throws InterruptedException, IOException {
        this.find_element(search_button, false).click();
        this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);

        for (int ln = 0; ln < searching_text.size(

        ); ln++) {
            this.find_element(search_button_text, false).sendKeys(searching_text.get(ln));
            this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);

            for (int i = 1; i <= video_search_quantity_to_be_checked; i++) {
                String search_results = String.format("(//android.widget.ImageView[@resource-id='com.google.android.youtube:id/search_type_icon'])[%s]", i);
                By search_results_locator = By.xpath(search_results);
                this.find_element(search_results_locator, false).click();
                this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);
                this.find_element(options, false).click();
                this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);
                this.find_element(type_filter, false).click();
                this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);
                this.find_element(type_filter_video_dropdown, false).click();
                this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);
                this.find_element(apply_filter, false).click();
                this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);
                Integer video_number = 1;

                for (int index_video = 1; index_video <= video_quantity_to_be_checked; index_video++) {
                    scrollElementIntoView(video_number);
                    video_number++;

                }
                this.find_element(search_clear, false).click();
                this.getScreenshotPath(getClass().getName().toLowerCase(), this.driver, uuid_to);

            }
        }

    }
}
