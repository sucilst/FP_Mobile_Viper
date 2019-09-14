package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PLNPrepaid extends AbstractObjectScreen {

    @FindBy(linkText = "Prabayar")
    protected AndroidElement tabPrabayar;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/et_no_pln")
    protected AndroidElement fieldIDPLN;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/et_phone_number")
    protected AndroidElement fieldPhonePLN;

    @FindBy(xpath = "//android.widget.TextView[@text='Informasi Pelanggan']")
    protected AndroidElement boxInformasiPelanggan;

    @FindBy(id="com.sepulsa.androiddev:id/electricity_product_container")
    protected AndroidElement boxPilihanToken;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/inquiry_result_text")
    protected AndroidElement boxIDSalah;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Rp 100.000\")")
    protected AndroidElement token100k;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Rp 50.000\")")
    protected AndroidElement token50k;

    @FindBy(id = "com.sepulsa.androiddev:id/tv_title")
    protected AndroidElement totalBayar;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pilih Metode Pembayaran\")")
    protected AndroidElement titleMetodeBayar;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"BCA Virtual Account\"))")
    protected AndroidElement titleBayarBCA;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Mandiri Virtual Account\"))")
    protected AndroidElement titleBayarMandiri;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Virtual Account Semua Bank\"))")
    protected AndroidElement titleBayarSemuaBank;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Bayar Sekarang\").instance(0))")
    protected AndroidElement buttonBayar;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/txtThankYou")
    protected AndroidElement titleThankYou;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/txtPaymentGreeting")
    protected AndroidElement titleDetailBayar;

    public PLNPrepaid(AndroidDriver driver) {
        super(driver);
    }

    public void pilihPrabayar(){
       tabPrabayar.click();
    }

    public void isiIDPel(String idPel) {
        fieldIDPLN.sendKeys(idPel);
        driver.hideKeyboard();
    }

    public void isiNoHP(String noHP) {
        fieldPhonePLN.clear();
        fieldPhonePLN.sendKeys(noHP);
        driver.hideKeyboard();
    }

    public void statusPelangganTampil(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxInformasiPelanggan));
        Assert.assertTrue(boxInformasiPelanggan.isDisplayed());
    }

    public void idPelangganMuncul(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxPilihanToken));
        Assert.assertTrue(boxPilihanToken.isDisplayed());
    }

    public void beliToken100k(){
        token100k.click();
    }

    public void beliToken50k() { token50k.click();}

    public void totalTagihanAwalMuncul() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(totalBayar));
        Assert.assertTrue(totalBayar.isDisplayed());
    }
    public void statusGagalTampil(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxIDSalah));
        Assert.assertTrue(boxIDSalah.isDisplayed());
    }

    public void pilihanMetodeBayar(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(titleMetodeBayar));
        Assert.assertTrue(titleMetodeBayar.isDisplayed());
    }

    public void pilihBayarBCA(){
        titleBayarBCA.click();
    }

    public void pilihBayarMandiri(){
        titleBayarMandiri.click();
    }

    public void pilihBayarSemuaBank(){
        titleBayarSemuaBank.click();
    }

    public void klikBayar(){
        buttonBayar.click();
    }

    public void diHalamanTagihanBCA(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(titleThankYou));
        wait.until(ExpectedConditions.visibilityOf(titleDetailBayar));
        Assert.assertEquals(titleDetailBayar.getText(),"Informasi pembayaran Virtual Account Bank BCA","Salah Metode");
    }

    public void diHalamanTagihanMandiri(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(titleThankYou));
        wait.until(ExpectedConditions.visibilityOf(titleDetailBayar));
        Assert.assertEquals(titleDetailBayar.getText(),"Informasi Pembayaran Mandiri Virtual Account","Salah Metode");
    }

    public void diHalamanTagihanSemuaBank(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(titleThankYou));
        wait.until(ExpectedConditions.visibilityOf(titleDetailBayar));
        Assert.assertEquals(titleDetailBayar.getText(),"Informasi Pembayaran Virtual Account Semua Bank","Salah Metode");
    }
}
