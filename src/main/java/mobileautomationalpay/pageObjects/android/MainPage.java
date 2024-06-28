package mobileautomationalpay.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mobileautomationalpay.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class MainPage extends AndroidActions {
    AndroidDriver driver;

    public MainPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    //driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"))
    @AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
    public List<WebElement> productList;


    public List<WebElement> getProductList() {

        return productList;
    }

    public void acceptTermsConditions() {
        longPressAction(terms);
        acceptButton.click();
    }

}
