package mobileautomationalpay.pages.android;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import mobileautomationalpay.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchPage extends AndroidActions {
    AndroidDriver driver;

    private By search_button = By.xpath("//android.widget.ImageView[@content-desc='Search']");
    private By search_button_text = By.id("com.google.android.youtube:id/search_edit_text");
    private By search_results = By.xpath("(//android.view.ViewGroup[@resource-id='com.google.android.youtube:id/linearLayout'])[%s]");
    private By search_video_results = By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.youtube:id/results']/android.view.ViewGroup[%s]//android.widget.ImageView[@content-desc='Go to channel']");


    public SearchPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void scrollElementIntoView() throws InterruptedException {
        int maxScrollAttempts = 5;
        int scrollAttempts = 0;
        boolean elementFound = false;
        String i = "1";
        String search_result_video = String.format(String.format("(//android.widget.ImageView[@content-desc='Go to channel'])[%s]", i));
        By search_result_video_locator = By.xpath(search_result_video);

        while (scrollAttempts < maxScrollAttempts && !elementFound) {
            try {
                // Attempt to find the element
                if (this.driver.findElement(search_result_video_locator).isDisplayed()) {
                    elementFound = true;
                    this.driver.findElement(search_result_video_locator).click();
                    System.out.println("Element found, scrolling stopped.");
                }
            } catch (Exception e) {
                // Element not found, perform scroll action
                swipeActionShorts(0.5F, 0.8F, 0.5F, 0.2F);
                Thread.sleep(3000);
                System.out.println("Scrolling...");
            }
            scrollAttempts++;
        }
    }

    public void searchVideo(String searching_text, Integer video_search_quantity_to_be_checked, Integer video_quantity_to_be_checked) throws InterruptedException {
        this.driver.findElement(search_button).click();
        this.driver.findElement(search_button_text).sendKeys(searching_text + Keys.ENTER);

        for (int i = 1; i <= video_search_quantity_to_be_checked; i++) {
            String search_results = String.format("(//android.view.ViewGroup[@resource-id='com.google.android.youtube:id/linearLayout'])[%s]", i);

            By search_results_locator = By.xpath(search_results);
            this.driver.findElement(search_results_locator).click();

            for (int t = 1; t <= video_quantity_to_be_checked; t++) {
                scrollElementIntoView();
            }

        }
    }

}
