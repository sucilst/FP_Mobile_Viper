package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BayarBPJS extends AbstractObjectScreen {
    @AndroidFindBy(id = "com.sepulsa.androiddev:id/ilb_edt_phone")
    protected AndroidElement fieldPhoneBPJS;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/ilb_edt_nobpjs")
    protected AndroidElement fieldNoBPJS;

    @FindBy(xpath = "//android.widget.TextView[@text='Informasi Pelanggan']")
    protected AndroidElement boxInformasiPelanggan;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/bk_btn_lanjut")
    protected AndroidElement buttonBayarTagihan;

    public BayarBPJS(AndroidDriver driver) {
        super(driver);
    }

    public void isiNoBPJS(String kodeBPJS){
        fieldNoBPJS.sendKeys(kodeBPJS);
        driver.hideKeyboard();
    }

    public void isiNoHP(String phoneBPJS){
        fieldPhoneBPJS.sendKeys(phoneBPJS);
        driver.hideKeyboard();
    }

    public void cekStatusPeserta(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxInformasiPelanggan));
        Assert.assertTrue(boxInformasiPelanggan.isDisplayed());
    }

    public void bayarSekarang(){

    }
}
