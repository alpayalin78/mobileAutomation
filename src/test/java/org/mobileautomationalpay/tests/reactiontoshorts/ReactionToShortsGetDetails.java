package org.mobileautomationalpay.tests.reactiontoshorts;
import java.io.IOException;
import java.util.Map;
import mobileautomationalpay.pages.android.ShortsPage;
import org.mobileautomationalpay.TestUtils.AndroidBaseTest;
import org.mobileautomationalpay.TestUtils.JsonUtil;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReactionToShortsGetDetails extends AndroidBaseTest {

    private ShortsPage shortsPage;
    private Map testData;
    private String uuid_to;

    @BeforeTest
    @Parameters("testDataPath")
    public void setPageObjects(String testDataPath) throws IOException, InterruptedException {
        this.shortsPage = new ShortsPage(driver);
        this.testData = JsonUtil.getTestData(testDataPath, Map.class);
        this.uuid_to = uuid;
    }

    @Test
    public void get_details() throws InterruptedException, IOException {
        Integer value = (Integer) this.testData.get("searchKey_1");
        this.shortsPage.get_shorts_detail(value, this.uuid_to);
        // Tümü Shorts videolar sekmeleri visible mı kontrol et.
        // Sırasıyla video içeriklerinin isimlerini al, aratılan kelime var mı yok mu irdele. Yoksa devam. Varsa video tıklanır.
        // sonrasında video player bakılır geldi mi diye screenshot alınır.

//        driver.findElement(By.id("com.google.android.youtube:id/reel_dyn_like")).click();
    }
}