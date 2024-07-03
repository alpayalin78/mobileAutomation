package mobileautomationalpay.pages.android;

import io.appium.java_client.AppiumBy;
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

//    @AndroidFindBy(xpath= "//android.widget.Button[@content-desc='Home']")
    private By main_page_button = By.xpath("//android.widget.Button[@content-desc='Home']");
    private By search_button_main_screen = By.xpath("//android.view.ViewGroup[@content-desc='Search YouTube']");
    private By search_options = By.xpath("//android.widget.ImageView[@resource-id='com.google.android.youtube:id/search_type_icon']");
    private By search_button = By.xpath("//android.widget.ImageView[@content-desc='Search']");
    private By search_button_text = By.id("com.google.android.youtube:id/search_edit_text");
    private By notification_button = By.xpath("//android.widget.ImageView[@content-desc='Notifications']");
    private By profile_button = By.xpath("//android.widget.FrameLayout[@resource-id='com.google.android.youtube:id/mobile_topbar_avatar']");
    private By account_button = By.id("Account");
    private By sign_in_button = By.id("com.google.android.youtube:id/button");
    private By add_account_button = By.id("com.google.android.youtube:id/name");

    public MainPage(AndroidDriver driver) throws InterruptedException {
        super(driver);
        this.driver = driver;
        go_to_main_page();
    }

    public void go_to_account_page(){
        this.driver.findElement(account_button).click();
    }

    public void add_account_button(){
        this.driver.findElement(add_account_button).click();
    }

    public void go_to_main_page() throws InterruptedException {
        Thread.sleep(10000);
        this.driver.findElement(main_page_button).click();
    }




//        arama text'i girildikten sonra, kaç adet search option tıklanacak bilgisi girilir.
//        list  search_option_elements = this.driver.findElements(search_options);
//        for i in range(search_option_elements): quantity'e göre her biri tıklatılır bilgiler toplanır verilere yazılır.

//        Show More'a kadar scroll et ve bilgileri topla //android.widget.TextView[@resource-id="com.google.android.youtube:id/link_text_start"]

//genel hareket - video 1
//android.support.v7.widget.RecyclerView[@resource-id="com.google.android.youtube:id/results"]/android.view.ViewGroup[2]//
//        --- android.view.ViewGroup[2]
//        video isim --- android.view.ViewGroup[2] -> android.view.ViewGroup [0]
//        paylaşan title, views, days ago--- android.view.ViewGroup[2] -> android.view.ViewGroup [1]
//android.support.v7.widget.RecyclerView[@resource-id="com.google.android.youtube:id/results"]/android.view.ViewGroup[3]




        // click search button
        // type video name + enter
        // video başlıklarını çek. return et.
    }
//
//    public void searchVideo(String searching_text) {
//        // click search button
//        // type video name + enter
//        // video başlıklarını çek.
//    }

