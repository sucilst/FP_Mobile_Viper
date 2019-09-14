package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SepulsaCredit extends AbstractObjectScreen {

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/tv_sepulsa_credit")
    protected AndroidElement saldoSepulsaCredit;

    @AndroidFindBy(className = "android.widget.ImageButton")
    protected AndroidElement buttonBack;

    /*@AndroidFindBy(uiAutomator = )
    protected 100

    androidfindby
    protected 200

androidfindby
    protected 500

    androidfindby
    protected 1000
     */

    public SepulsaCredit(AndroidDriver driver) {
        super(driver);
    }

    public void saldoKreditKosong(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(saldoSepulsaCredit));
        Assert.assertTrue(saldoSepulsaCredit.isDisplayed());
        Assert.assertEquals(saldoSepulsaCredit.getText(),"Rp 0","Ada Saldo");
    }

    public void kembaliKeMenu(){
        buttonBack.click();
    }
}
