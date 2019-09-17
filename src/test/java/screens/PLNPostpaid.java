package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.InputSepulsa;

import java.util.List;

public class PLNPostpaid extends AbstractObjectScreen {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pascabayar\")")
    protected AndroidElement tabPascabayar;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/et_no_pln")
    protected AndroidElement fieldIDPLN;

    @AndroidFindBy(id="com.sepulsa.androiddev:id/et_phone_number")
    protected AndroidElement fieldPhonePLN;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Informasi Tagihan']")
    protected AndroidElement boxInformasiTagihan;

    @FindBy(id="com.sepulsa.androiddev:id/electricity_product_container")
    protected AndroidElement boxTagihanListrik;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Bayar Tagihan Sekarang\").instance(0))")
    protected AndroidElement buttonBayarTagihan;

    @AndroidFindBy(id = "com.sepulsa.androiddev:id/inquiry_result_text")
    protected AndroidElement boxIDSalah;

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

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"KEMBALI KE BERANDA\").instance(0))")
    protected AndroidElement hyperlinkBeranda;

    @FindBy(xpath = "//android.widget.TextView[@text='Informasi Tagihan']")
    protected List<AndroidElement> adaInformasiTagihan;

    public PLNPostpaid(AndroidDriver driver) {
        super(driver);
    }

    public void pilihPascabayar(){
        tabPascabayar.click();
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
        wait.until(ExpectedConditions.visibilityOf(boxInformasiTagihan));
        Assert.assertTrue(boxInformasiTagihan.isDisplayed());
    }

    public void kolomIDKosong(){
        fieldIDPLN.clear();
    }

    public void kolomHandphoneKosong(){
        fieldPhonePLN.clear();
    }

    public void totalTagihanAwalMuncul() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxTagihanListrik));
        Assert.assertTrue(boxTagihanListrik.isDisplayed());
    }
    public void statusGagalTampil(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxIDSalah));
        Assert.assertTrue(boxIDSalah.isDisplayed());
        Assert.assertEquals(boxIDSalah.getText(), InputSepulsa.idPelangganSalah,"IDnya bener");
    }

    public void statusSudahBayarTampil(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(boxIDSalah));
        Assert.assertTrue(boxIDSalah.isDisplayed());
        Assert.assertEquals(boxIDSalah.getText(),InputSepulsa.generalError,"Unknown error");
    }

    public void keHalamanPembayaran(){
        buttonBayarTagihan.click();
    }
    public void diHalamanPembayaran(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(totalBayar));
        Assert.assertTrue(totalBayar.isDisplayed());
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

    public void tungguProsesPembayaran(){
        try{
            Thread.sleep(30000);
        } catch (Exception e) {}
    }

    public void keHalamanBeranda(){
        hyperlinkBeranda.click();
    }

    public void statusTagihanTidakTampil() {
        Assert.assertEquals(0,adaInformasiTagihan.size());
    }
}
