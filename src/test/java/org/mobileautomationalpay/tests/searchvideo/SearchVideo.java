package org.mobileautomationalpay.tests.searchvideo;
import org.mobileautomationalpay.TestUtils.JsonUtil;
import mobileautomationalpay.pages.android.SearchPage;
import org.mobileautomationalpay.TestUtils.AndroidBaseTest;
import org.openqa.selenium.json.Json;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Map;


public class SearchVideo extends
        AndroidBaseTest {
    private SearchPage searchPage;
    private Map testData;
    private String uuid_to;

    @BeforeTest
    @Parameters("testDataPath")
    public void setPageObjects(String testDataPath) throws IOException, InterruptedException {
        this.searchPage = new SearchPage(driver);
        this.testData = JsonUtil.getTestData(testDataPath, Map.class);
        this.uuid_to = uuid;
    }


    @Test
    public void SearchVideo() throws InterruptedException, IOException {
        ArrayList<String> teams = new ArrayList<>(this.testData.size());

        for (int i = 0; i < this.testData.size(); i++) {
            teams.add(null);
        }

        for (int i = 0; i < this.testData.size(); i++) {
            // Map'teki anahtarları alıp sırayla işleme koyuyoruz
            String key = "searchKey_" + (i + 1);
            String value = this.testData.get(key).toString();
            teams.set(i, value);
        }
        this.searchPage.searchVideo(teams, 1, 1, this.uuid_to);

        // MainPage nesnesi oluşturulur.
        // searchVideo, fonksiyonu çağırılır.
        // aratıla metin, return edilen video başlıkları çerisinde var mı, kaç video çekilsin ve kaçının başlığında aratılan kelime var.
        // sonuç sonrası visible olan tüm kategoriler visible mı kontrol edilir

        // Tümü Shorts videolar sekmeleri visible mı kontrol et.
        // Sırasıyla video içeriklerinin isimlerini al, aratılan kelime var mı yok mu irdele. Yoksa devam. Varsa video tıklanır.
        // sonrasında video player bakılır geldi mi diye screenshot alınır.

//        driver.findElement(By.id("com.google.android.youtube:id/reel_dyn_like")).click();
    }
//
//
//    @Test
//    public void LookForEachSearchReturnsResult() throws InterruptedException {
//
//    }
}
