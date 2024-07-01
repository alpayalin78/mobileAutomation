package org.mobileautomationalpay.tests.searchvideo;

import org.mobileautomationalpay.TestUtils.JsonUtil;
import org.mobileautomationalpay.tests.searchvideo.model.SearchVideoTestData;
import io.appium.java_client.AppiumBy;
import mobileautomationalpay.pages.android.MainPage;
import mobileautomationalpay.pages.android.SearchPage;
import org.mobileautomationalpay.TestUtils.AndroidBaseTest;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchVideo extends
        AndroidBaseTest {
    private MainPage mainPage;
    private SearchPage searchPage;
    private SearchVideoTestData testData;

    @BeforeTest
    @Parameters("testDataPath")
    public void setPageObjects(String testDataPath) throws IOException {
        this.mainPage = new MainPage(driver);
        this.searchPage = new SearchPage(driver);
        this.testData = JsonUtil.getTestData(testDataPath, SearchVideoTestData.class);
    }


    @Test
    public void SearchVideo() throws InterruptedException {
        this.mainPage.go_to_main_page();
        // MainPage nesnesi oluşturulur.
        // searchVideo, fonksiyonu çağırılır.
        // aratıla metin, return edilen video başlıkları çerisinde var mı, kaç video çekilsin ve kaçının başlığında aratılan kelime var.
        // sonuç sonrası visible olan tüm kategoriler visible mı kontrol edilir

        // Tümü Shorts videolar sekmeleri visible mı kontrol et.
        // Sırasıyla video içeriklerinin isimlerini al, aratılan kelime var mı yok mu irdele. Yoksa devam. Varsa video tıklanır.
        // sonrasında video player bakılır geldi mi diye screenshot alınır.

//        driver.findElement(By.id("com.google.android.youtube:id/reel_dyn_like")).click();
    }


    @Test
    public void LookForEachSearchReturnsResult() throws InterruptedException {

    }
}
