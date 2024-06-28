package org.mobileautomationalpay.tests.reactiontoshorts;

import org.mobileautomationalpay.TestUtils.AndroidBaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReactionToShorts extends AndroidBaseTest {

    @BeforeTest
    public void preSetup() throws IOException {
        ConfigureAppium();
    }

    @Test
    public void swipeReels() throws InterruptedException {
        // Tümü Shorts videolar sekmeleri visible mı kontrol et.
        // Sırasıyla video içeriklerinin isimlerini al, aratılan kelime var mı yok mu irdele. Yoksa devam. Varsa video tıklanır.
        // sonrasında video player bakılır geldi mi diye screenshot alınır.

//        driver.findElement(By.id("com.google.android.youtube:id/reel_dyn_like")).click();
    }
}
